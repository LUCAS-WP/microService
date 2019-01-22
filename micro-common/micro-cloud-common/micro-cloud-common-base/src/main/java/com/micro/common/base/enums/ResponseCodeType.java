/**
 * 版权所有(C) 2018 深圳市雁联计算系统有限公司
 * 创建: 李江 2018-12-26
 */
package com.micro.common.base.enums;

/**
 * 错误响应码
 * Created by LUCAS.
 * Description: 深圳市雁联计算系统有限公司
 * Date: 2018-07-04
 * Time: 下午7:04
 *
 * @author lijiang
 */
public enum ResponseCodeType {
    ;

    private String value;
    private String message;

    ResponseCodeType(String value, String message){
        this.value = value;
        this.message = message;
    }

    public String getValue() {
        return value;
    }

    public ResponseCodeType setValue(String value) {
        this.value = value;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ResponseCodeType setMessage(String message) {
        this.message = message;
        return this;
    }
}
