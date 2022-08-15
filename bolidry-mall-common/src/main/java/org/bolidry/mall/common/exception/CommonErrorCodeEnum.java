package org.bolidry.mall.common.exception;

import lombok.Getter;

/**
 *
 * @author ZhuPengWei
 * @date 2022-08-15 11:25
 */
@Getter
public enum CommonErrorCodeEnum implements BaseErrorEnum {

    // ======系统级别的未知异常======
    SYSTEM_UNKNOWN_ERROR("-1", "系统未知错误"),

    // ======客户端异常======

    /**
     * org.springframework.web.HttpRequestMethodNotSupportedException
     */
    CLIENT_HTTP_METHOD_ERROR("1001", "客户端HTTP请求方法错误"),

    // ======服务端异常======
    SERVER_ILLEGAL_ARGUMENT_ERROR("2001", "业务方法参数检查不通过"),

    ;

    String errorCode;
    String errorMessage;

    CommonErrorCodeEnum(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

}
