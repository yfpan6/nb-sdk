package com.newbetter.sdk.exception;

import com.newbetter.sdk.commons.CodedMessage;
import com.newbetter.sdk.commons.State;

/**
 * 已编码的异常
 * 一种抽象的异常，可以根据异常code定位到具体的异常
 * 通常会在程序最外层捕获捕获些类异常，并转换为错误响应码返回调用方，同时打印堆栈和error日志
 * 如果不想打印异常信息，建议使用其子类 BusinessException
 *
 * @Author panyunfeng
 * @Date 2019-12-10
 */
public class CodedException extends RuntimeException {

    /**
     * 异常编码
     */
    protected int code;

    protected CodedException() {
        this.code = State.FAILURE.getCode();
    }

    protected CodedException(int code, String message) {
        super(message);
        this.code = code;
    }

    protected CodedException(int code, String message, Throwable e) {
        super(message, e);
        this.code = code;
    }


    public static CodedException of(String message) {
        return of(State.FAILURE.getCode(), message, null);
    }

    public static CodedException of(String message, Throwable e) {
        return of(State.FAILURE.getCode(), message, e);
    }

    public static CodedException of(CodedMessage codedMessage) {
        return of(codedMessage, null);
    }

    public static CodedException of(CodedMessage codedMessage, Throwable e) {
        if (codedMessage == null) {
            throw new NullPointerException("the param 'codedMessage' is null.");
        }

        return of(codedMessage.getCode(), codedMessage.getMessage(), e);
    }

    public static CodedException of(int code, String message) {
        return new CodedException(code, message);
    }

    public static CodedException of(int code, String message, Throwable e) {
        if (e != null) {
            return new CodedException(code, message, e);
        } else {
            return new CodedException(code, message);
        }
    }

    /**
     * 无堆栈的异常，不打印堆栈信息
     */
    public static CodedException ofNoStack(String message) {
        return new CodedException.NoStackCodedException(State.FAILURE.getCode(), message);
    }

    /**
     * 无堆栈的异常，不打印堆栈信息
     */
    public static CodedException ofNoStack(int code, String message) {
        return new CodedException.NoStackCodedException(code, message);
    }

    /**
     * 无堆栈的异常，不打印堆栈信息
     */
    public static CodedException ofNoStack(CodedMessage codedMessage) {
        if (codedMessage == null) {
            throw new NullPointerException("the param 'codedMessage' is null.");
        }

        return new CodedException.NoStackCodedException(State.FAILURE.getCode(), null);
    }

    /**
     * 无堆栈的异常，不打印堆栈信息
     */
    public static class NoStackCodedException extends CodedException {

        public NoStackCodedException(int code, String message) {
            super(code, message);
        }

        @Override
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

}
