package com.gyong.jenkins.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {


    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
//            .allowedOrigins("http://localhost:3000")
            .allowedOrigins("http://localhost:30000")
            .allowedOrigins("") // Ingress 설정으로 내부적으로 통신이 되므로 CORS 설정 없어도 통신가능
            .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "FETCH");
    }
}
