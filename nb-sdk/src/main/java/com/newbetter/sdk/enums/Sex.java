package com.newbetter.sdk.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author panyunfeng
 * @Date 2019-11-11
 */
public enum Sex {

    UNKNOWN((byte) 0, "未知"),
    MALE((byte) 1, "男"),
    FEMALE((byte) 2, "女");

    private byte code;
    private String desc;

    Sex(byte code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    private static final Map<Byte, Sex> sexMap = new HashMap(4) {{
        put(UNKNOWN.code, UNKNOWN);
        put(MALE.code, MALE);
        put(FEMALE.code, FEMALE);
    }};

    public boolean isEqual(byte code) {
        return this.code == code;
    }

    public static Sex getByCode(Byte code) {
        Sex sex = sexMap.get(code);

        if (sex == null) {
            sex =  UNKNOWN;
        }

        return sex;
    }

    public int code() {
        return code;
    }

    public byte byteCode() {
        return code;
    }

    public String desc() {
        return desc;
    }

}
