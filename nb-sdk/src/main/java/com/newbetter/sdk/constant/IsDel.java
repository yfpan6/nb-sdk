package com.newbetter.sdk.constant;

/**
 * @author panyunfeng
 * @date 2021/2/3
 */
public final class IsDel {

    private IsDel() {}

    /**
     * 未删除
     */
    public static final byte NO = 0;

    /**
     * 已删除
     */
    public static final byte YES = 1;

    /**
     * 判断参数值是否代表已删除
     * value值不为空且值等于1代表已删除
     *
     * @param value
     * @return true-已删除, false-未删除
     */
    public static boolean yes(Byte value) {
        return value != null && value == YES;
    }

}
