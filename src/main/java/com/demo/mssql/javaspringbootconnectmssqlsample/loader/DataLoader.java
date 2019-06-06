package com.demo.mssql.javaspringbootconnectmssqlsample.loader;

import com.demo.mssql.javaspringbootconnectmssqlsample.model.User;
import com.demo.mssql.javaspringbootconnectmssqlsample.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) {
        userRepository.deleteAll();
        userRepository.save(new User("Puck",25));
        userRepository.save(new User("Rang",27));
        userRepository.save(new User("Elen",14));
    }
}
