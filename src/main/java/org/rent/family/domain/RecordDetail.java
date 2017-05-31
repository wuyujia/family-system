package org.rent.family.domain;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Copyright © 2017北京联合倍全电子商务有限公司. All rights reserved.
 *
 * @Prject: family-record
 * @Package: org.rent.family.domain
 * @Description: TODO
 * @author: wuyujia
 * @Date: 2017/5/24 22:55
 * @version: V1.0
 */
public class RecordDetail {

    /**
     * 对账单详情Id
     */
    private Integer id;

    /**
     * 对账AA发起记录ID
     */
    private Integer recordId;

    /**
     * 对账单详情状态
     */
    private Integer status;

    /**
     * 对账单详情状态描述, 1未结, 2 已结
     */
    private String statusDesc;

    /**
     * 对账记录名称
     */
    private String name;

    /**
     * 对账记录描述
     */
    private String desc;

    /**
     * 对账金额
     */
    private BigDecimal money;

    /**
     * 对账添加时间
     */
    private Integer addTime;

    /**
     * 对账添加时间字符串
     */
    private String addTimeDesc;


    /**
     * 消费时间
     */
    private Integer consumeTime;

    /**
     * 消费时间时间字符串
     */
    private String consumeTimeDesc;

    /**
     * 对账所属用户Id
     */
    private Integer uid;

    /**
     * 对账所属家庭ID
     */
    private Integer familyId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatusDesc() {
        return statusDesc;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

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

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public String getAddTimeDesc() {
        return addTimeDesc;
    }

    public void setAddTimeDesc(String addTimeDesc) {
        this.addTimeDesc = addTimeDesc;
    }

    public Integer getConsumeTime() {
        return consumeTime;
    }

    public void setConsumeTime(Integer consumeTime) {
        this.consumeTime = consumeTime;
    }

    public String getConsumeTimeDesc() {
        return consumeTimeDesc;
    }

    public void setConsumeTimeDesc(String consumeTimeDesc) {
        this.consumeTimeDesc = consumeTimeDesc;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getFamilyId() {
        return familyId;
    }

    public void setFamilyId(Integer familyId) {
        this.familyId = familyId;
    }

    @Override
    public String toString() {
        return "RecordDetail{" +
                "id=" + id +
                ", recordId=" + recordId +
                ", status=" + status +
                ", statusDesc='" + statusDesc + '\'' +
                ", name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", money=" + money +
                ", addTime=" + addTime +
                ", addTimeDesc='" + addTimeDesc + '\'' +
                ", consumeTime=" + consumeTime +
                ", consumeTimeDesc='" + consumeTimeDesc + '\'' +
                ", uid=" + uid +
                ", familyId=" + familyId +
                '}';
    }
}
