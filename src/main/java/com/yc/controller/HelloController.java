package com.yc.controller;


import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@Log4j2
public class HelloController {

    @GetMapping
    public String hello() {
        //System.out.println("1");
        //System.out.println("2");
        log.debug("debug");
        log.info("info");
        log.warn("warning");
        return "hello world";
    }
}
