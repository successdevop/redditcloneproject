package com.success.reddit.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Load data from the database");
    }
}
