package com.nhnacademy.mini_dooray.newgateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

@Configuration
public class RouteConfig {
    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes().route("project-service", predicateSpec -> predicateSpec.path("/api/project/**").uri("http://localhost:8082"))
                .route("account-service", predicateSpec -> predicateSpec.path("/api/member/**").uri("http://localhost:8081")).build();
    }
}