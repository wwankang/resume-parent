package top.wankang.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author wankang
 * @version 1.0
 * @date 2020/6/7 10:32
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@EnableFeignClients(basePackages = "top.wankang.manage.api")
public class ManageApplicaton {
    public static void main(String[] args) {
        SpringApplication.run(ManageApplicaton.class,args);
    }
}
