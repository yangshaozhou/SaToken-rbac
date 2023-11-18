package com.rbacpermit.exception;

import com.rbacpermit.common.StatusCode;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Asserts {
    public static void fail(StatusCode statusCode) {
        throw new ApiException(statusCode);
    }

    public static void fail(String message) {
        throw new ApiException(message);
    }

}
