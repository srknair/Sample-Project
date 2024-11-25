package com.example.bookinvent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.example.*")
@EnableJpaRepositories(basePackages = "com.example.BookRepository")
public class BookInventoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookInventoryApplication.class, args);
    }

}
