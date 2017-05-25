package org.rent.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * @author lee
 * @description
 * @create 2017-05-11
 */
public enum BackCodeEnum {

    BackCodeEnumSuccess(200,"success"),
    BackCodeEnum1(1001, "saveOrUpdate failed!"),//保存失败
    BackCodeEnum2(1002, "Illegal operation"),//不合法操作
    BackCodeEnum3(1003, "some params is null");//参数为空



    private Integer code;
    private String msg;

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    BackCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static BackCodeEnum getByCode(String code) {
        if (StringUtils.isNotBlank(String.valueOf(code))) {
            for (BackCodeEnum e : values()) {
                if (e.code.equals(code)) {
                    return e;
                }
            }
        }
        return null;
    }

}
