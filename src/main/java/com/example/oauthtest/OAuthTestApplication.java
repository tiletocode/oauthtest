package com.example.oauthtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class OAuthTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(OAuthTestApplication.class, args);
    }

}
