package com.ludan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LustinApplication {

    private final Logger logger = LoggerFactory.getLogger(LustinApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(LustinApplication.class,args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {

        logger.error("error logback for lustin");
        logger.info("info logback for lustin");
        return String.format("Hello %s!", name);
    }
}
