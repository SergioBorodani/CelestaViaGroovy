package ru.curs.groovy

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class GroovyApp {

    static void main(String[] args) {
        SpringApplication.run(GroovyApp.class, args);
    }

}
