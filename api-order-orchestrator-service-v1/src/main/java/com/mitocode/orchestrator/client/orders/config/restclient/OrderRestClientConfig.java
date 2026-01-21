package com.mitocode.orchestrator.client.orders.config.restclient;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

/**
 * @author Luis Balarezo
 **/
@Configuration
public class OrderRestClientConfig {

    @Bean
    public RestClient.Builder restClientBuilder() {
        return RestClient.builder();
    }

    @Bean
    public RestClient orderRestClient(RestClient.Builder restClientBuilder) {
        return restClientBuilder
                .clone()
                .baseUrl("http://localhost:40010/api/v1")
                .build();
    }


}
