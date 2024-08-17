package com.yc.controller;


import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@Log4j2
public class HelloController {

    @Autowired
    private Environment env;
    @GetMapping
    public String hello() {
        //System.out.println("1");
        //System.out.println("2");
        log.debug("debug");
        log.info("info");
        log.warn("warning");


        log.info(env.getProperty("JAVA_HOME"));
        log.info(env.getProperty("product.pname") + "\t" + env.getProperty("myfilepath"));
        log.info(env.getProperty("server.port"));

        return "hello world";
    }
}
