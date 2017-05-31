package org.rent.family.domain;

import java.math.BigDecimal;

/**
 * Copyright © 2017北京联合倍全电子商务有限公司. All rights reserved.
 *
 * @Prject: family-record
 * @Package: org.rent.family.domain
 * @Description: TODO
 * @author: wuyujia
 * @Date: 2017/5/24 22:54
 * @version: V1.0
 */
public class Record {

    /**
     * 对账AA记录
     */
    private Integer id;

    /**
     * AA对账名称
     */
    private String name;

    /**
     * AA对账金额
     */
    private BigDecimal account;

    /**
     * 添加时间
     */
    private Long addTime;

    /**
     * 添加时间字符串
     */
    private String addTimeDesc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAddTime() {
        return addTime;
    }

    public void setAddTime(Long addTime) {
        this.addTime = addTime;
    }

    public String getAddTimeDesc() {
        return addTimeDesc;
    }

    public void setAddTimeDesc(String addTimeDesc) {
        this.addTimeDesc = addTimeDesc;
    }

    public BigDecimal getAccount() {
        return account;
    }

    public void setAccount(BigDecimal account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", account=" + account +
                ", addTime=" + addTime +
                ", addTimeDesc='" + addTimeDesc + '\'' +
                '}';
    }
}
