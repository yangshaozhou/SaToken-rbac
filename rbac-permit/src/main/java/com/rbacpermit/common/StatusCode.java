package com.rbacpermit.common;

import lombok.*;

/**
 * 响应状态
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum StatusCode {

//    操作成功
    SUCCESS("0x200","操作成功"),
//    操作异常
    ERROR("0x500","操作异常"),
//    请先登录
    UNAUTHORIZED("0x401","请先登录"),
//    暂无权限访问
    ACCESS_DENIED("0x403","权限不足");

//    状态码
   private String code;
//    返回信息
    private String message;

}
