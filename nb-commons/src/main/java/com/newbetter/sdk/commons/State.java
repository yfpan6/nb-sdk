package com.newbetter.sdk.commons;

import com.newbetter.sdk.utils.Asserts;

/**
 * 编码状态
 * 不使用枚举是为了保留扩展
 *
 * @Author panyunfeng
 * @Date 2019/12/15
 */
public class State implements CodedMessage {

    /**
     * 默认的成功状态 常量定义
     * 程序中涉及成功的状态时，请尽量使用此常量，以统一成功状态的编码和方案
     */
    public static final State SUCCESS = new State(0, "OK");

    /**
     * 默认的失败状态编码 常量定义
     * 程序中涉及失败的状态时，请尽量使用此常量，以统一失败状态的编码和方案
     */
    public static final State FAILURE = new State(1, "FAIL");

    /**
     * 状态数字编码
     */
    protected int code;

    /**
     * 状态文案描述
     */
    protected String message;

    protected State(int code, String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * State 工厂方法
     * @param code
     * @param message
     * @return
     */
    public static State of(int code, String message) {
        return new State(code, message);
    }

    /**
     * State 工厂方法
     * @param codedMessage
     * @return
     */
    public static State of(CodedMessage codedMessage) {
        Asserts.notNull(codedMessage);

        return new State(codedMessage.getCode(), codedMessage.getMessage());
    }

    public boolean isEqual(State state) {
        if (state == null) {
            return false;
        }

        return getCode() == state.getCode();
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "State[code=" + code +
                ", message=" + message + "]";
    }
}
