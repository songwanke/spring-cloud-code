package cn.springcloud.book.feign.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author songwanke
 * @date 2018/10/25
 */
@Configuration
public class HelloFeignServiceConfig {

    @Bean
    Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}
