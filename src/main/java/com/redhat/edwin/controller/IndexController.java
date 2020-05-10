package com.redhat.edwin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * <pre>
 *     com.redhat.edwin.controller.IndexController
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 09 Mei 2020 15:38
 */
@RestController
public class IndexController {
    @GetMapping("/")
    public HashMap helloWorld() {
        return new HashMap<>(){{
            put("Message", "Hello Spring Boot.");
        }};
    }
}