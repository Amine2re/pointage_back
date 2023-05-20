package com.worldvista.pointage.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.filter.CorsFilter;

import java.lang.reflect.Array;
import java.util.Arrays;

@Configuration
public class CorsConfig {

    @Bean
    CorsConfiguration corsFilter(){
        var corsConfiguration =  new CorsConfiguration();
//        corsConfiguration.setAllowedHeaders(Arrays.asList("",""));
        return corsConfiguration;
    }
//    @Bean
//    CorsFilter corsFilter() {
//        CorsConfiguration corsConfiguration =
//            new CorsConfiguration();
//    }
//
}
