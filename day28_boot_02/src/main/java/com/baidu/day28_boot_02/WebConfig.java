package com.baidu.day28_boot_02;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // 允许所有接口支持跨域
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:5173")  // 允许来自 http://localhost:5173 的请求
                .allowedMethods("GET", "POST", "PUT", "DELETE")  // 允许的 HTTP 方法
                .allowedHeaders("*")  // 允许的请求头
                .allowCredentials(true);  // 是否允许携带凭证（如 cookies）
    }
}
