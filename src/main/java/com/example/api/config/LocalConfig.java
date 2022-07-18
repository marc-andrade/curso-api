package com.example.api.config;

import com.example.api.domain.User;
import com.example.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("local")
public class LocalConfig {

    @Autowired
    UserRepository userRepository;

    @Bean
    public void startDB(){
        User u1 = new User(null,"Marcos","marcos@email.com","123");
        User u2 = new User(null,"Lucas","lucas@email.com","123");

        userRepository.saveAll(List.of(u1,u2));

    }
}
