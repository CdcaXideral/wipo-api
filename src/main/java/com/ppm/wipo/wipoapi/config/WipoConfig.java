package com.ppm.wipo.wipoapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class WipoConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
