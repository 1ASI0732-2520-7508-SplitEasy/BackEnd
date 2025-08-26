package com.example.spliteasybackend.shared.interfaces.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/public")
public class PublicController {
    @GetMapping("/ping")
    public Map<String, Object> ping() {
        return Map.of("status", "ok");
    }
}
