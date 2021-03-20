package com.newbetter.sdk.utils;

import com.newbetter.sdk.commons.CodedMessage;
import com.newbetter.sdk.constant.ErrorCode;
import com.newbetter.sdk.exception.AssertException;
import com.newbetter.sdk.exception.CodedException;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.function.Supplier;

/**
 * 断言工具
 * <p>断言失败默认会抛出AssertException. 但也提供了接收CodedException参数的方法, 允许客户化异常类型.
 * 断言建议使用带message或codedMessage参数的方法，尽量将异常原因描述清楚，方便定位。
 * </p>
 *
 * @Author panyunfeng
 * @Date 2019/12/18
 */
public class Asserts {

    public static void isTrue(Boolean bool) {
        if (bool == null || !bool) {
            throw AssertException.of("the result is not true.");
        }
    }

    public static void isTrue(Boolean bool, String message) {
        if (bool == null || !bool) {
            throw AssertException.of(message);
        }
    }

    public static void isTrue(Boolean bool, String messageTemplate, Object... msgArgs) {
        if (bool == null || !bool) {
            throw AssertException.of(format(messageTemplate, msgArgs));
        }
    }

    public static void isTrue(Boolean bool, int code, String message) {
        if (bool == null || !bool) {
            throw AssertException.of(code, message);
        }
    }

    public static void isTrue(Boolean bool, int code, String messageTemplate, Object... msgArgs) {
        if (bool == null || !bool) {
            throw AssertException.of(code, format(messageTemplate, msgArgs));
        }
    }

    public static void isTrue(Boolean bool, CodedMessage codedMessage) {
        if (bool == null || !bool) {
            throw AssertException.of(codedMessage);
        }
    }

    public static void isFalse(Boolean bool) {
        if (bool == null || bool) {
            throw AssertException.of("the state is not false.");
        }
    }

    public static void isFalse(Boolean bool, String message) {
        if (bool == null || bool) {
            throw AssertException.of(message);
        }
    }

    public static void isFalse(Boolean bool, String messageTemplate, Object... msgArgs) {
        if (bool == null || bool) {
            throw AssertException.of(format(messageTemplate, msgArgs));
        }
    }

    public static void isFalse(Boolean bool, int code, String message) {
        if (bool == null || bool) {
            throw AssertException.of(code, message);
        }
    }

    public static void isFalse(Boolean bool, int code, String messageTemplate, Object... msgArgs) {
        if (bool == null || bool) {
            throw AssertException.of(code, format(messageTemplate, msgArgs));
        }
    }

    public static void isFalse(Boolean bool, CodedMessage codedMessage) {
        if (bool == null || bool) {
            throw AssertException.of(codedMessage);
        }
    }

    public static void isFalse(Boolean bool, Supplier<CodedException> exceptionSupplier) {
        if (bool == null || bool) {
            throw exceptionSupplier.get();
        }
    }

    public static void isNull(Object value) {
        if (value != null) {
            throw AssertException.of(ErrorCode.PARAM_NOT_NULL, "the value is not null.");
        }
    }

    public static void isNull(Object value, String message) {
        if (value != null) {
            throw AssertException.of(ErrorCode.PARAM_NOT_NULL, message);
        }
    }

    public static void isNull(Object value, String messageTemplate, Object... msgArgs) {
        if (value != null) {
            throw AssertException.of(ErrorCode.PARAM_NOT_NULL, format(messageTemplate, msgArgs));
        }
    }

    public static void isNull(Object value, int code, String message) {
        if (value != null) {
            throw AssertException.of(code, message);
        }
    }

    public static void isNull(Object value, int code, String messageTemplate, Object... msgArgs) {
        if (value != null) {
            throw AssertException.of(code, format(messageTemplate, msgArgs));
        }
    }

    public static void isNull(Object value, CodedMessage codedMessage) {
        if (value != null) {
            throw AssertException.of(codedMessage);
        }
    }

    public static void isNull(Object value, Supplier<CodedException> exceptionSupplier) {
        if (value != null) {
            throw exceptionSupplier.get();
        }
    }

    public static  void notNull(Object value) {
        if (value == null) {
            throw AssertException.of(ErrorCode.PARAM_IS_NULL, "the value is null.");
        }
    }

    public static  void notNull(Object value, String message) {
        if (value == null) {
            throw AssertException.of(ErrorCode.PARAM_IS_NULL, message);
        }
    }

    public static  void notNull(Object value, String messageTemplate, Object... msgArgs) {
        if (value == null) {
            throw AssertException.of(ErrorCode.PARAM_IS_NULL, format(messageTemplate, msgArgs));
        }
    }

    public static  void notNull(Object value, int code, String message) {
        if (value == null) {
            throw AssertException.of(code, message);
        }
    }

    public static  void notNull(Object value, int code, String messageTemplate, Object... msgArgs) {
        if (value == null) {
            throw AssertException.of(code, format(messageTemplate, msgArgs));
        }
    }

    public static void notNull(Object value, CodedMessage codedMessage) {
        if (value == null) {
            throw AssertException.of(codedMessage);
        }
    }

    public static void notNull(Object value, Supplier<CodedException> exceptionSupplier) {
        if (value == null) {
            throw exceptionSupplier.get();
        }
    }

    public static void isEmpty(Collection<?> collection) {
        if (collection != null && !collection.isEmpty()) {
            throw AssertException.of(ErrorCode.PARAM_COLLECTION_NOT_EMPTY, "the collection is not empty.");
        }
    }

    public static void isEmpty(Collection<?> collection, String message) {
        if (collection != null && !collection.isEmpty()) {
            throw AssertException.of(ErrorCode.PARAM_COLLECTION_NOT_EMPTY, message);
        }
    }

    public static void isEmpty(Collection<?> collection, String messageTemplate, Object... msgArgs) {
        if (collection != null && !collection.isEmpty()) {
            throw AssertException.of(ErrorCode.PARAM_COLLECTION_NOT_EMPTY, format(messageTemplate, msgArgs));
        }
    }

    public static void isEmpty(Collection<?> collection, int code, String message) {
        if (collection != null && !collection.isEmpty()) {
            throw AssertException.of(code, message);
        }
    }

    public static void isEmpty(Collection<?> collection, int code, String messageTemplate, Object... msgArgs) {
        if (collection != null && !collection.isEmpty()) {
            throw AssertException.of(code, format(messageTemplate, msgArgs));
        }
    }

    public static void isEmpty(Collection<?> collection, CodedMessage codedMessage) {
        if (collection != null && !collection.isEmpty()) {
            throw AssertException.of(codedMessage);
        }
    }

    public static void isEmpty(Collection<?> collection, Supplier<CodedException> exceptionSupplier) {
        if (collection != null && !collection.isEmpty()) {
            throw exceptionSupplier.get();
        }
    }

    public static void notEmpty(Collection<?> collection) {
        if (collection == null || collection.isEmpty()) {
            throw AssertException.of(ErrorCode.PARAM_COLLECTION_IS_EMPTY, "the collection is empty.");
        }
    }

    public static void notEmpty(Collection<?> collection, String message) {
        if (collection == null || collection.isEmpty()) {
            throw AssertException.of(ErrorCode.PARAM_COLLECTION_IS_EMPTY, message);
        }
    }

    public static void notEmpty(Collection<?> collection, String messageTemplate, Object... msgArgs) {
        if (collection == null || collection.isEmpty()) {
            throw AssertException.of(ErrorCode.PARAM_COLLECTION_IS_EMPTY, format(messageTemplate, msgArgs));
        }
    }

    public static void notEmpty(Collection<?> collection, int code, String message) {
        if (collection == null || collection.isEmpty()) {
            throw AssertException.of(code, message);
        }
    }

    public static void notEmpty(Collection<?> collection, int code, String messageTemplate, Object... msgArgs) {
        if (collection == null || collection.isEmpty()) {
            throw AssertException.of(code, format(messageTemplate, msgArgs));
        }
    }

    public static void notEmpty(Collection<?> collection, CodedMessage codedMessage) {
        if (collection == null || collection.isEmpty()) {
            throw AssertException.of(codedMessage);
        }
    }

    public static void notEmpty(Collection<?> collection, Supplier<CodedException> exceptionSupplier) {
        if (collection == null || collection.isEmpty()) {
            throw exceptionSupplier.get();
        }
    }

    public static void isEmpty(Map<?, ?> map) {
        if  (map != null && !map.isEmpty()) {
            throw AssertException.of(ErrorCode.PARAM_MAP_NOT_EMPTY, "the map is not empty.");
        }
    }

    public static void isEmpty(Map<?, ?> map, String message) {
        if  (map != null && !map.isEmpty()) {
            throw AssertException.of(ErrorCode.PARAM_MAP_NOT_EMPTY, message);
        }
    }

    public static void isEmpty(Map<?, ?> map, String messageTemplate, Object... msgArgs) {
        if  (map != null && !map.isEmpty()) {
            throw AssertException.of(ErrorCode.PARAM_MAP_NOT_EMPTY, format(messageTemplate, msgArgs));
        }
    }

    public static void isEmpty(Map<?, ?> map, int code, String message) {
        if  (map != null && !map.isEmpty()) {
            throw AssertException.of(code, message);
        }
    }

    public static void isEmpty(Map<?, ?> map, int code, String messageTemplate, Object... msgArgs) {
        if  (map != null && !map.isEmpty()) {
            throw AssertException.of(code, format(messageTemplate, msgArgs));
        }
    }

    public static void isEmpty(Map<?, ?> map, CodedMessage codedMessage) {
        if (map != null && !map.isEmpty()) {
            throw AssertException.of(codedMessage);
        }
    }

    public static void isEmpty(Map<?, ?> map, Supplier<CodedException> exceptionSupplier) {
        if (map != null && !map.isEmpty()) {
            throw exceptionSupplier.get();
        }
    }

    public static void notEmpty(Map<?, ?> map) {
        if (map == null || map.isEmpty()) {
            throw AssertException.of(ErrorCode.PARAM_MAP_IS_EMPTY, "the map is empty.");
        }
    }

    public static void notEmpty(Map<?, ?> map, String message) {
        if (map == null || map.isEmpty()) {
            throw AssertException.of(ErrorCode.PARAM_MAP_IS_EMPTY, message);
        }
    }

    public static void notEmpty(Map<?, ?> map, String messageTemplate, Object... msgArgs) {
        if (map == null || map.isEmpty()) {
            throw AssertException.of(ErrorCode.PARAM_MAP_IS_EMPTY, format(messageTemplate, msgArgs));
        }
    }

    public static void notEmpty(Map<?, ?> map, int code, String message) {
        if (map == null || map.isEmpty()) {
            throw AssertException.of(code, message);
        }
    }

    public static void notEmpty(Map<?, ?> map, int code, String messageTemplate, Object... msgArgs) {
        if (map == null || map.isEmpty()) {
            throw AssertException.of(code, format(messageTemplate, msgArgs));
        }
    }

    public static void notEmpty(Map<?, ?> map, CodedMessage codedMessage) {
        if (map == null || map.isEmpty()) {
            throw AssertException.of(codedMessage);
        }
    }

    public static void notEmpty(Map<?, ?> map, Supplier<CodedException> exceptionSupplier) {
        if (map == null || map.isEmpty()) {
            throw exceptionSupplier.get();
        }
    }

    public static void isEmpty(Object[] array) {
        if (array != null && array.length > 0) {
            throw AssertException.of("the array is not empty.");
        }
    }

    public static void isEmpty(Object[] array, String message) {
        if (array != null && array.length > 0) {
            throw AssertException.of(message);
        }
    }

    public static void isEmpty(Object[] array, CodedMessage codedMessage) {
        if (array != null && array.length > 0) {
            throw AssertException.of(codedMessage);
        }
    }

    public static void isEmpty(Object[] array, Supplier<CodedException> exceptionSupplier) {
        if (array != null && array.length > 0) {
            throw exceptionSupplier.get();
        }
    }

    public static void notEmpty(Object[] array) {
        if (array == null || array.length == 0) {
            throw AssertException.of("the array is empty");
        }
    }

    public static void notEmpty(Object[] array, String message) {
        if (array == null || array.length == 0) {
            throw AssertException.of(message);
        }
    }

    public static void notEmpty(Object[] array, CodedMessage codedMessage) {
        if (array == null || array.length == 0) {
            throw AssertException.of(codedMessage);
        }
    }

    public static void notEmpty(Object[] array, Supplier<CodedException> exceptionSupplier) {
        if (array == null || array.length == 0) {
            throw exceptionSupplier.get();
        }
    }

    /**
     * 参考Guava Strings.lenientFormat(template, Object[] args)
     *
     * @param template
     * @param args
     * @return
     */
    private static String format(String template, Object... args) {
        if (template == null) {
            return "null";
        }

        if (Collections.isEmpty(args)) {
            return template;
        }

        // start substituting the arguments into the '%s' placeholders
        StringBuilder builder = new StringBuilder(template.length() + 16 * args.length);
        int templateStart = 0;
        int i = 0;
        while (i < args.length) {
            int placeholderStart = template.indexOf("%s", templateStart);
            if (placeholderStart == -1) {
                break;
            }
            builder.append(template, templateStart, placeholderStart);
            builder.append(args[i++]);
            templateStart = placeholderStart + 2;
        }
        builder.append(template, templateStart, template.length());

        // if we run out of placeholders, append the extra args in square braces
        if (i < args.length) {
            builder.append(" [");
            builder.append(args[i++]);
            while (i < args.length) {
                builder.append(", ");
                builder.append(args[i++]);
            }
            builder.append(']');
        }

        return builder.toString();
    }

}
