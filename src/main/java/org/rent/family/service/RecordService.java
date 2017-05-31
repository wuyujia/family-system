package org.rent.family.service;

import org.rent.family.constant.BusinessConstant;
import org.rent.family.dao.RecordDao;
import org.rent.family.dao.RecordDetailDao;
import org.rent.family.domain.Record;
import org.rent.family.domain.RecordDetail;
import org.rent.utils.LinkedHashMapUtil;
import org.rent.utils.ValidateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Copyright © 2017北京联合倍全电子商务有限公司. All rights reserved.
 *
 * @Prject: family-record
 * @Package: org.rent.family.service
 * @Description: TODO
 * @author: wuyujia
 * @Date: 2017/5/24 23:42
 * @version: V1.0
 */
@Service
public class RecordService {

    @Autowired
    private RecordDetailDao recordDetailDao;

    @Autowired
    private RecordDao recordDao;

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    public Object recordOneDetail(String name, String desc, BigDecimal money, String consumeTime) {
        // TODO: 2017/5/24 进行参数合法性校验
//        DateUtils.
        RecordDetail detail = new RecordDetail();
        detail.setName(name);
        detail.setDesc(desc);
        detail.setMoney(money);
//        detail.setConsumeTime(consumeTime);
        return null;
    }

    public Map<String,Object> getRecordDetailList() {
        Map<String,Object> resultMap = new HashMap<>();
        /**
         * 查询所有的分账单记录
         */
        List<RecordDetail> recordDetailList = recordDetailDao.findAllList();

        /**
         * 对分账单记录进行分类
         * 已出账
         * 未出账
         * 全部
         */
        List<RecordDetail> chargedRecordDetailList = new ArrayList<>();//已出账列表
        List<RecordDetail> unChargedRecordDetailList = new ArrayList<>();//未出账列表
        List<RecordDetail> allList = new ArrayList<>();

        if (ValidateUtils.ValidateListIsEmpty(recordDetailList)){
            for (RecordDetail recordDetail : recordDetailList) {
                Integer status = recordDetail.getStatus();
                if (status != null) {
                    if (status == BusinessConstant.RecordDetail.STATUS_UNCHARGED) {
                        unChargedRecordDetailList.add(recordDetail);
                        allList.add(recordDetail);
                    } else if (status == BusinessConstant.RecordDetail.STATUS_CHARGED) {
                        chargedRecordDetailList.add(recordDetail);
                        allList.add(recordDetail);
                    } else {

                    }
                }
            }

        }

        resultMap.put("uncharged",unChargedRecordDetailList);//未出账单
        resultMap.put("charged",chargedRecordDetailList);//已出账单
        resultMap.put("all",allList);//全部账单
        return resultMap;
    }

    /**
     * 查询AA记录及记录详情
     * @param id
     * @return
     */
    public Object findOneOfRecord(Integer id){
        // 查询
        Record record = recordDao.findOneByRecordId(id);
        Assert.isNull(record, "查询AA记录为空");
        List<RecordDetail> recordList = recordDetailDao.findRecordDetailListByRecordId(id);
        Assert.isNull(recordList, "查询AA记录详情为空");
        return LinkedHashMapUtil.build()
                .append("record", record)
                .append("recordList", recordList)
                .fetchAll();
    }

    /**
     * 发起AA
     * @param recordIdList
     * @return
     */
    public Object launchAA(List recordIdList,String name){
        /**
         * 1.查询生成AA账单的所有分账单
         */
        List<RecordDetail> recordList =  recordDao.findListByIdList(recordIdList);

        /**
         * 2.生成AA账单
         */
        Record record = new Record();
        BigDecimal account = BigDecimal.ZERO;
        if (ValidateUtils.ValidateListIsEmpty(recordList)){
            for (RecordDetail recordDetail:recordList){
                account = account.add(recordDetail.getMoney());
            }
        }
        record.setAccount(account);
        record.setAddTime(new Date().getTime());
        record.setAddTimeDesc(simpleDateFormat.format(new Date()));
        record.setName(name);
        return null;
    }
}
