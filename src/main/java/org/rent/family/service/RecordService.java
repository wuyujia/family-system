package org.rent.family.service;

import org.rent.family.constant.BusinessConstant;
import org.rent.family.dao.RecordDetailDao;
import org.rent.family.domain.RecordDetail;
import org.rent.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public Object getRecordDetailList() {
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

        if (recordDetailList != null && recordDetailList.size() > 0) {
            for (RecordDetail recordDetail : recordDetailList) {
                if (recordDetail != null) {
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
            resultMap.put("uncharged",unChargedRecordDetailList);
            resultMap.put("charged",chargedRecordDetailList);
            resultMap.put("all",allList);
        }
        return resultMap;
    }
}
