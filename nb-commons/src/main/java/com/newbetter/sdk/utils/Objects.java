package com.newbetter.sdk.utils;

/**
 * @Author panyunfeng04
 * @Date 2019-11-05
 */
public class Objects {

    public static <T> T ifNull(T value, T elseValue) {
        if (value == null) {

            return elseValue;
        }

        return value;
    }

    public static <T> T firstNotNull(T... objects) {
        if (objects.length == 0) {

            return null;
        }

        for (T object : objects) {
            if (object != null) {

                return object;
            }
        }

        return null;
    }

}
