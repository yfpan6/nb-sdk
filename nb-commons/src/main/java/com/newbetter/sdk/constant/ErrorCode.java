package com.newbetter.sdk.constant;

/**
 * @author panyunfeng
 * @date 2021/2/5
 */
public class ErrorCode {

    /**
     * 默认异常编码
     */
    public static final int EXCEPTION = 500;

    /**
     * 参数不合法
     */
    public static final int PARAM_ILLEGAL = 1000;

    /**
     * 参数值为空
     * value == null
     */
    public static final int PARAM_IS_NULL = 1001;

    /**
     * 参数值非空(value != null)
     */
    public static final int PARAM_NOT_NULL = 1002;

    /**
     * 参数值为空
     * <p>可用于下列几种情况的错误编码 <br/>
     * String: string == null || string.trim().length() == 0 <br/>
     * Collection: collection == null || collection.isEmpty() <br/>
     * Map: map == null || map.isEmpty() <br/>
     * Set: set == null || set.isEmpty() <br/>
     * Array: array == null || array.length = 0
     * </p>
     */
    public static final int PARAM_IS_EMPTY = 1003;

    /**
     * 参数值为非空
     * <p>可用于下列几种情况的错误编码 <br/>
     * String: string != null && string.trim().length() > 0 <br/>
     * Collection: collection != null && !collection.isEmpty() <br/>
     * Map: map != null && !map.isEmpty() <br/>
     * Set: set != null && !set.isEmpty() <br/>
     * Array: array != null && array.length > 0
     * </p>
     */
    public static final int PARAM_NOT_EMPTY = 1004;

    /**
     * 字符串为空（string == null || string.trim().length() == 0）
     */
    public static final int PARAM_STRING_IS_EMPTY = 1005;

    /**
     * 字符串不为空（string != null && string.trim().length() > 0）
     */
    public static final int PARAM_STRING_NOT_EMPTY = 1006;

    /**
     * 集合为空（collection == null || collection.isEmpty()）
     */
    public static final int PARAM_COLLECTION_IS_EMPTY = 1005;

    /**
     * 集合不为空（collection != null && !collection.isEmpty()）
     */
    public static final int PARAM_COLLECTION_NOT_EMPTY = 1006;

    /**
     * 集合越界（index < 0 || index >= collection.size()）
     */
    public static final int PARAM_COLLECTION_OUT_OF_BOUNDS = 1007;

    /**
     * 数组为空（array == null || array.isEmpty()）
     */
    public static final int PARAM_ARRAY_IS_EMPTY = 1008;

    /**
     * 数组不为空（array != null && !array.length == 0）
     */
    public static final int PARAM_ARRAY_NOT_EMPTY = 1009;

    /**
     * 数组越界（index < 0 || index >= array.length）
     */
    public static final int PARAM_ARRAY_OUT_OF_BOUNDS = 1010;

    /**
     * 数组为空（set == null || set.isEmpty()）
     */
    public static final int PARAM_SET_IS_EMPTY = 1011;

    /**
     * 数组不为空（set != null && !set.length == 0）
     */
    public static final int PARAM_SET_NOT_EMPTY = 1012;

    /**
     * Map为空（map == null || map.isEmpty()）
     */
    public static final int PARAM_MAP_IS_EMPTY = 1014;

    /**
     * Map不为空（map != null && !map.isEmpty()）
     */
    public static final int PARAM_MAP_NOT_EMPTY = 1015;

    /**
     * 状态不合法
     * <p>何为状态不合法？
     * 1、本应是true, 结果为false
     * 2、本应是false, 结果为true
     * </p>
     */
    public static final int STATE_ILLEGAL = 1500;
}
