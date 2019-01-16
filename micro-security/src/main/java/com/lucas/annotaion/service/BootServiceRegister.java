/**
 * 版权所有(C) 2018 深圳市雁联计算系统有限公司
 * 创建: 李江 2018-12-19
 */
package com.lucas.annotaion.service;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * service服务自动装配
 * Created by LUCAS.
 * Description: 深圳市雁联计算系统有限公司
 * Date: 2018-07-04
 * Time: 下午7:04
 *
 * @author lijiang
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import({BootServiceScannerRegister.class})
public @interface BootServiceRegister {

    String[] basePackages() default {"com.lucas.*"};
}
