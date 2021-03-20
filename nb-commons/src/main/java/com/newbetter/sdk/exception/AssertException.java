package com.newbetter.sdk.exception;

import com.newbetter.sdk.commons.CodedMessage;
import com.newbetter.sdk.constant.ErrorCode;

/**
 * 断言异常
 * com.newbetter.sdk.utils.Asserts 的方法默认抛此异常。
 *
 * @author panyunfeng
 * @date 2021/2/5
 */
public class AssertException extends CodedException {

    protected AssertException(int code, String message) {
        super(code, message);
    }

    protected AssertException(int code, String message, Throwable e) {
        super(code, message, e);
    }

    public static AssertException of(String message) {
        return new AssertException(ErrorCode.EXCEPTION, message);
    }

    public static AssertException of(int code, String message) {
        return new AssertException(code, message);
    }

    public static AssertException of(CodedMessage codedMessage) {
        if (codedMessage == null) {
            throw new NullPointerException("the param 'codedMessage' is null.");
        }Strings

        return new AssertException(codedMessage.getCode(), codedMessage.getMessage());
    }

}
