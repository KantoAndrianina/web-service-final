package com.example.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
// @EntityScan("com.example.myapp.entity")
// @EnableJpaRepositories("com.example.myapp.repository")
// @ComponentScan(basePackages = {"com.example.package1", "com.example.package2"})

public class AccessingDataPostgressApp {

  public static void main(String[] args) {
    SpringApplication.run(AccessingDataPostgressApp.class, args);
  }

}