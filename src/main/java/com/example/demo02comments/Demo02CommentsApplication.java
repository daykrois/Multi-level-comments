package com.example.demo02comments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Demo02CommentsApplication {

    public static void main(String[] args) {
        SpringApplication.run(Demo02CommentsApplication.class, args);
    }

}
