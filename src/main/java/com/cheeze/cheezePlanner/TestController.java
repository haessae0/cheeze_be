package com.cheeze.cheezePlanner;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TestController {

    @GetMapping("/hello")
    public List<String> hello() {
        return Arrays.asList("8080 스프링" + " 3000 리액트");
    }
}
