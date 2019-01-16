/**
 * 版权所有(C) 2018 深圳市雁联计算系统有限公司
 * 创建: 李江 2018-12-19
 */
package com.lucas.system.config;

import com.lucas.action.AccountController;
import com.lucas.filter.BootServiceFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.mvc.Controller;

/**
 * 配置Spring自动装配类型;注解为@Controller；或者自定义服务类型：类名包含Service
 * Created by LUCAS.
 * Description: 深圳市雁联计算系统有限公司
 * Date: 2018-07-04
 * Time: 下午7:04
 *
 * @author lijiang
 */
@ComponentScan(includeFilters = {
        @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {BootServiceFilter.class}),
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {AccountController.class})
        })
public class BootServiceScanConfig {
}
