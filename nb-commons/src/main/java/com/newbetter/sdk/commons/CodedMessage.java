package com.newbetter.sdk.commons;

/**
 * 可编码消息的接口定义
 * <p>内置SimpleImpl, 如果只是简单的构建code-message对象,
 * 通过 CodedMessage.of(code, message) 即可创建 SimpleImpl 对象</p>
 *
 * @Author panyunfeng
 * @Date 2019-11-11
 */
public interface CodedMessage {

    /**
     * 消息编码
     * @return
     */
    int getCode();

    /**
     * 消息内容
     * @return
     */
    String getMessage();

    static SimpleImpl of(int code, String message) {

        return new SimpleImpl(code, message);
    }

    final class SimpleImpl implements CodedMessage {

        protected int code;
        protected String message;

        private SimpleImpl(int code, String message) {
            this.code = code;
            this.message = message;
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
            return "CodedMessage[code=" + code +
                    ", message=" + message + "]";
        }

    }
}
