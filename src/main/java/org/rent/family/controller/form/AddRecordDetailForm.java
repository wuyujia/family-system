package org.rent.family.controller.form;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * Copyright © 2017北京联合倍全电子商务有限公司. All rights reserved.
 *
 * @Prject: family-record
 * @Package: org.rent.family.controller.form
 * @Description: TODO
 * @author: wuyujia
 * @Date: 2017/5/24 23:54
 * @version: V1.0
 */
public class AddRecordDetailForm {

    @NotBlank(message = "记录名称不能为空")
    private String name;

    @NotBlank(message = "描述不能为空")
    private String desc;

    @NotNull(message = "金额不能为空")
    private BigDecimal money;

    private String consumeTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getConsumeTime() {
        return consumeTime;
    }

    public void setConsumeTime(String consumeTime) {
        this.consumeTime = consumeTime;
    }

    @Override
    public String toString() {
        return "AddRecordDetailForm{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", money=" + money +
                ", consumeTime='" + consumeTime + '\'' +
                '}';
    }
}
