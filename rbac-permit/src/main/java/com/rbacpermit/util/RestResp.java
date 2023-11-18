package com.rbacpermit.util;

import com.rbacpermit.common.StatusCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class RestResp<T> {
    /**
     * 响应状态码
     */
    private String code;

    /**
     * 响应消息
     */
    private String message;

    /**
     * 响应数据
     */
    private T data;

    private RestResp() {
        this.code = StatusCode.SUCCESS.getCode();
        this.message = StatusCode.SUCCESS.getMessage();
    }

    private RestResp(StatusCode statusCode) {
        this.code = statusCode.getCode();
        this.message = statusCode.getMessage();
    }

    private RestResp(T data) {
        this();
        this.data = data;
    }

    /**
     * 返回没有数据的结果
     */
    public static RestResp<Void> ok() {
        return new RestResp<>();
    }

    /**
     * 返回数据的结果
     */

    public static <T> RestResp<T> ok(T data) {
        return new RestResp<>(data);
    }

    /**
     *  返回业务失败
     */
    public static RestResp<Void> fail(StatusCode statusCode) {
        return new RestResp<>(statusCode);
    }

    /**
     * 系统错误
     */
    public static RestResp<Void> error() {
        return new RestResp<>(StatusCode.ERROR);
    }

    public static RestResp<Void> fail(String message) {
        return new RestResp<>(StatusCode.ERROR.getCode(),message,null);
    }

}
