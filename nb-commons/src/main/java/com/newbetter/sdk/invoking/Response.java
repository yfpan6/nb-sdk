package com.newbetter.sdk.invoking;

import lombok.Getter;
import lombok.Setter;

/**
 * 远程调用的响应包装类
 *
 * @Author panyunfeng
 * @Date 2019/12/15
 */
@Setter
@Getter
public abstract class Response<T> {

    /**
     * 响应状态编码
     */
    protected int code;

    /**
     * 响应消息内容
     */
    protected String msg;

    /**
     * 响应数据
     */
    protected T data;

    public static final class DefaultImpl<T> extends Response<T> {

        public DefaultImpl(int code, String message, T data) {
            this.code = code;
            this.msg = message;
            this.data = data;
        }

    }

}
