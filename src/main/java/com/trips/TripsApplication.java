package com.trips;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Esta es la anotación que el IDE está buscando [cite: 52]
public class TripsApplication {
    public static void main(String[] args) {
        SpringApplication.run(TripsApplication.class, args);
    }
}