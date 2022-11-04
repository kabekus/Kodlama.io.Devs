package com.example.kodlamaio_devs;

import com.example.kodlamaio_devs.dataAccess.concretes.InMemorySoftwareLanguageRepository;
import com.example.kodlamaio_devs.entities.concretes.SoftwareLanguage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodlamaioDevsApplication {

    public static void main(String[] args) {
        SpringApplication.run(KodlamaioDevsApplication.class, args);
    }

}
