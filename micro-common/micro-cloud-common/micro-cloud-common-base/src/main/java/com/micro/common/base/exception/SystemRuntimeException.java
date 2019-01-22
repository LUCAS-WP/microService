/**
 * 版权所有(C) 2018 深圳市雁联计算系统有限公司
 * 创建: 李江 2018-12-26
 */
package com.micro.common.base.exception;

import com.micro.common.base.enums.ResponseCodeType;

/**
 * Created by LUCAS.
 * Description: 深圳市雁联计算系统有限公司
 * Date: 2018-07-04
 * Time: 下午7:04
 *
 * @author lijiang
 */
public class SystemRuntimeException extends RuntimeException {

    private ResponseCodeType responseCodeType;

    public SystemRuntimeException(String message) {
        super(message);
    }

    public SystemRuntimeException(String message, Throwable cause) {
        super(message,cause);
    }

    public SystemRuntimeException(String message, ResponseCodeType responseCodeType) {
        super(message);
        this.responseCodeType = responseCodeType;
    }

    public SystemRuntimeException(String message, Throwable cause, ResponseCodeType responseCodeType) {
        super(message, cause);
        this.responseCodeType = responseCodeType;
    }
    public SystemRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, ResponseCodeType responseCodeType) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.responseCodeType = responseCodeType;
    }

    public ResponseCodeType getResponseCodeType() {
        return responseCodeType;
    }

    public SystemRuntimeException setResponseCodeType(ResponseCodeType responseCodeType) {
        this.responseCodeType = responseCodeType;
        return this;
    }
}
