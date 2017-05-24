package org.rent.family.domain;

/**
 * Copyright © 2017北京联合倍全电子商务有限公司. All rights reserved.
 *
 * @Prject: family-record
 * @Package: org.rent.family.domain
 * @Description: TODO
 * @author: wuyujia
 * @Date: 2017/5/24 22:51
 * @version: V1.0
 */
public class FamilyUser {

    /**
     * 用户ID
     */
    private Integer uid;

    /**
     * 登录用户名
     */
    private String username;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 用户真实姓名
     */
    private String name;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "FamilyUser{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
