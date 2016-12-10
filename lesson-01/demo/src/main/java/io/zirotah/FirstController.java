package io.zirotah;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
public class FirstController {
    @RequestMapping("/")
    public String hello() {
        return "Hello Java Spring Boot world!";
    }
}