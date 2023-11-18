package com.rbacpermit.exception;

import com.rbacpermit.util.RestResp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;



@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    /**
     * 处理系统异常
     */
    @ExceptionHandler(Exception.class)
    public RestResp<Void> handlerException(Exception e) {
        e.printStackTrace();
        return RestResp.error();
    }

    @ExceptionHandler(ApiException.class)
    public RestResp<Void> handlerBusinessException(ApiException e) {
        e.printStackTrace();
        return RestResp.fail(e.getStatusCode());
    }
}
