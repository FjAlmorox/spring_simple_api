package com.example.spring_simple_api;

import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/hello")
    public Map<String, String> hello() {
        return Map.of("message", "Hello from Spring Boot 3 + Java 21!");
    }

    @GetMapping("/time")
    public Map<String, Object> time() {
        return Map.of("currentTime", LocalDateTime.now());
    }

    @PostMapping("/echo")
    public Map<String, Object> echo(@RequestBody Map<String, Object> payload) {
        payload.put("echoedAt", LocalDateTime.now());
        return payload;
    }
}
