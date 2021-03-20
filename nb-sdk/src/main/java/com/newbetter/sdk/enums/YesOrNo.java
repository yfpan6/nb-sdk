package com.newbetter.sdk.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author panyunfeng04
 * @Date 2019-11-05
 */
public enum YesOrNo {

    UNKNOWN((byte) 0, "未知"),
    YES((byte) 1, "是"),
    NO((byte) 2, "否");

    private byte code;
    private String desc;

    YesOrNo(byte code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    private static final Map<Byte, YesOrNo> yesOrNoMap = new HashMap(4) {{
        put(UNKNOWN.code, UNKNOWN);
        put(YES.code, YES);
        put(NO.code, NO);
    }};

    public boolean isEqual(byte code) {
        return this.code == code;
    }

    public static YesOrNo getByCode(Byte code) {
        YesOrNo yesOrNo = yesOrNoMap.get(code);

        if (yesOrNo == null) {
            yesOrNo =  UNKNOWN;
        }

        return yesOrNo;
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
