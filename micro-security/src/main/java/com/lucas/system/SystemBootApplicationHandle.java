/**
 * 版权所有(C) 2018 深圳市雁联计算系统有限公司
 * 创建: 李江 2018-12-18
 */
package com.lucas.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * Created by LUCAS.
 * Description: 深圳市雁联计算系统有限公司
 * Date: 2018-07-04
 * Time: 下午7:04
 *
 * @author lijiang
 */
//@ComponentScan(basePackages = "com.lucas.*")
//@Configuration
//@EnableAutoConfiguration
//@BootServiceRegister(basePackages = "com.lucas.*")
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {
        "com.micro.remote.client"
})
public class SystemBootApplicationHandle {

    public static void main(String[] args) {
        SpringApplication.run(SystemBootApplicationHandle.class);
    }
}
