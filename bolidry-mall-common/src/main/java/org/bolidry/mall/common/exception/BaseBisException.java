package org.bolidry.mall.common.exception;

import lombok.Data;
import lombok.Getter;

/**
 * 基础自定义业务异常
 * @author ZhuPengWei
 * @date 2022-08-15 11:15
 */
@Data
public class BaseBisException extends RuntimeException {

    /**
     * 默认异常
     */
    private static final String DEFAULT_ERROR_CODE = "-1";

    private String errorCode;

    private String errorMessage;

    public BaseBisException(String errorMessage) {
        super(errorMessage);
        this.errorCode = DEFAULT_ERROR_CODE;
        this.errorMessage = errorMessage;
    }

    public BaseBisException(String errorCode,String errorMessage) {
        super(errorMessage);
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public BaseBisException(BaseErrorEnum baseErrorEnum) {
        super(baseErrorEnum.getErrorMessage());
        this. errorCode= baseErrorEnum.getErrorCode();
        this.errorMessage = baseErrorEnum.getErrorMessage();
    }

}
