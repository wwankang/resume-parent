package top.wankang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients(basePackages = "top.wankang.api")
public class ResumeWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResumeWebApplication.class, args);
    }

}
