package com.wickedshon.catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CatalogApplication {

   @Bean
   public RestTemplate getTemplate() {
      return new RestTemplate();
   }

   public static void main(String[] args) {
      SpringApplication.run(CatalogApplication.class, args);
   }

}
