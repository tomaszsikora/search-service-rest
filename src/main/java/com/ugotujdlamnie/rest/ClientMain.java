package com.ugotujdlamnie.rest;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ClientMain {

  @Bean
  RestTemplate restTemplate()
  {
    return new RestTemplate();
  }


    public static void main(String[] args) {
      ApplicationContext context = new SpringApplicationBuilder(ClientMain.class)
              .web(false)
              .run();

    }
}

