package com.springboot.web.springboot3web.config;

import com.springboot.web.springboot3web.component.MyYamlHttpMessageConverter;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@SpringBootConfiguration
public class Myconfig {

    @Bean
    public WebMvcConfigurer configurer() {
        return new WebMvcConfigurer() {

            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                //WebMvcConfigurer.super.addInterceptors(registry);
            }

            //配置把对象转换程yamldeMessageConverters
            @Override
            public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
                //WebMvcConfigurer.super.configureMessageConverters(converters);
                converters.add(new MyYamlHttpMessageConverter());
            }
        };
    }
}
