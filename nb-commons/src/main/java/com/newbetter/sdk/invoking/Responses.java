package com.newbetter.sdk.invoking;

import com.newbetter.sdk.commons.CodedMessage;
import com.newbetter.sdk.commons.State;
import com.newbetter.sdk.exception.CodedException;
import com.newbetter.sdk.utils.Asserts;

/**
 * 过程调用响应工具类
 * 功能1：提供了一些Response子类的工厂方法, of(Class<子类>,...); success(Class<子类>,...); fail(Class<子类>,...)
 *       success 默认code=200,msg=OK; fail 默认code=500,msg=FAIL
 * 功能2：提供了一些Response.DefaultImpl的工厂方法, of(...); success(...); fail(...)
 *       success 默认code=200,msg=OK; fail 默认code=500,msg=FAIL
 * 功能3：提供了响应成功和失败的判断方法,
 *       响应成功: isSuccess(response), response不为空并且response.code的值等于State.SUCCESS.getCode()
 *       响应失败: isFail(response), response为空或者response.code的值不等于State.SUCCESS.getCode()
 *
 * @Author panyunfeng
 * @Date 2019/12/15
 */
public class Responses {

    public static <R extends Response> R of(Class<R> clazz, CodedMessage codedMessage) {
        return of(clazz, codedMessage, null);
    }

    public static <R extends Response, T> R of(Class<R> clazz, CodedMessage codedMessage, T data) {
        Asserts.notNull(clazz, "the param 'clazz' is required for Responses.of(clazz,codedMessage).");
        Asserts.notNull(codedMessage, "the param 'codedMessage' is required for Responses.of(clazz,codedMessage).");

        return of(clazz, codedMessage.getCode(), codedMessage.getMessage(), data);
    }

    public static <R extends Response, T> R of(Class<R> clazz, int code, String message, T data) {
        Asserts.notNull(clazz, "the param 'clazz' is required for Responses.of(clazz,code,msg,data).");

        try {
            Response response = clazz.getConstructor().newInstance();
            response.setCode(code);
            response.setMsg(message);
            response.setData(data);

            return (R) response;
        } catch (Exception e) {

            throw CodedException.of("create class:" + clazz.getName() +
                    " error. by Responses.of(clazz,code,msg,data).", e);
        }
    }

    public static <R extends Response> R success(Class<R> clazz) {
        return of(clazz, State.SUCCESS.getCode(), State.SUCCESS.getMessage(), null);
    }

    public static <R extends Response, T> R success(Class<R> clazz, T data) {
        return of(clazz, State.SUCCESS.getCode(), State.SUCCESS.getMessage(), data);
    }

    public static <R extends Response, T> R fail(Class<R> clazz, int code) {
        return of(clazz, code, State.FAILURE.getMessage(), null);
    }

    public static <R extends Response, T> R fail(Class<R> clazz, int code, String message) {
        return of(clazz, code, message, null);
    }

    public static <R extends Response, T> R fail(Class<R> clazz, CodedMessage codedMessage) {
        return of(clazz, codedMessage, null);
    }

    public static <T> Response<T> of(int code, String message, T data) {
        return new Response.DefaultImpl<>(code, message, data);
    }

    public static <T> Response<T> of(CodedMessage codedMessage) {
        Asserts.notNull(codedMessage, "the param 'codedMessage' is required for Responses.of(codedMessage).");

        return new Response.DefaultImpl<>(codedMessage.getCode(), codedMessage.getMessage(), null);
    }

    public static <T> Response<T> of(CodedMessage codedMessage, T data) {
        Asserts.notNull(codedMessage, "the param 'codedMessage' is required for Responses.of(codedMessage,data).");

        return new Response.DefaultImpl<>(codedMessage.getCode(), codedMessage.getMessage(), data);
    }

    public static <T> Response<T> success() {
        return of(State.SUCCESS, null);
    }

    public static <T> Response<T> success(T data) {
        return of(State.SUCCESS, data);
    }

    public static Response fail(int code) {
        return new Response.DefaultImpl(code, State.FAILURE.getMessage(), null);
    }

    public static Response fail(int code, String message) {
        return new Response.DefaultImpl(code, message, null);
    }

    public static <T> Response<T> fail(CodedMessage codedMessage) {
        Asserts.notNull(codedMessage, "the param 'codedMessage' is required for Responses.fail(codedMessage).");

        return new Response.DefaultImpl<>(codedMessage.getCode(), codedMessage.getMessage(), null);
    }


    /**
     * 成功响应条件: response不为空, 并且响应code值等于State.SUCCESS.getCode().
     *
     * @return true-成功, false-失败
     */
    public static boolean isSuccess(Response response) {

        return response != null && response.getCode() == State.SUCCESS.getCode();
    }

    /**
     * 失败响应条件: response为空，或者响应code值不等于State.SUCCESS.getCode().
     *
     * @return true-失败, false-成功
     */
    public boolean isFail(Response response) {

        return response == null || response.getCode() != State.SUCCESS.getCode();
    }

}
