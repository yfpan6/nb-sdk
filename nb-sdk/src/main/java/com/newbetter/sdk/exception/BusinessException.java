package com.newbetter.sdk.exception;

import com.newbetter.sdk.commons.State;

/**
 * 统一业务异常（CodedException的子类）
 * 一种抽象的异常，可以根据异常code定位到具体的异常
 * 通常用于业务上可以预见的异常，会中断程序运行，但又不太关心其异常详情的场景，可以将其包装成BusinessException上抛，
 * 通常会在程序最外层捕获此类异常，并转换为错误响应码返回调用方，不会打印异常堆栈，会输出warning级日志
 *
 * BusinessException 含堆栈
 * NoStackBusinessException 不含堆栈
 *
 * @Author panyunfeng
 * @Date 2019-12-10
 */
public class BusinessException extends CodedException {

    private BusinessException(String message) {
        super(State.FAILURE.getCode(), message);
    }

    public static BusinessException of(String message) {
        return new BusinessException(message);
    }

    public static BusinessException ofNoStack(String message) {
        return new NoStackBusinessException(message);
    }

    /**
     * 无堆栈的异常，不打印堆栈信息
     */
    public static class NoStackBusinessException extends BusinessException {

        private NoStackBusinessException(String message) {
            super(message);
        }

        @Override
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }
}
