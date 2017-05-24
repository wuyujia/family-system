package org.rent.family.service;

import org.rent.family.domain.RecordDetail;
import org.rent.utils.DateUtils;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

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
}
