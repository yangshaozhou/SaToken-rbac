package com.rbacpermit.exception;

import com.rbacpermit.common.StatusCode;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 自定义业务异常，用于处理用户请求，业务错误时抛出
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ApiException extends RuntimeException {
    private final StatusCode statusCode;

    public ApiException(StatusCode statusCode) {
        super(statusCode.getMessage(),null,false,false);
        this.statusCode = statusCode;
    }

    public ApiException(String message) {
        super(message);
        this.statusCode = null;
    }

}
