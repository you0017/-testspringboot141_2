package com.yc;


import com.yc.bean.Address;
import com.yc.bean.Apple;
import com.yc.bean.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)//让JUnit运行spring的测试环境，获得spring环境的上下文支持
//获取启动类，加载配置，寻找主配置启动类(被@SpringBootApplication注解的类)
@SpringBootTest(classes = Testspringboot1412Application.class)
//不启动springboot
@ContextConfiguration(classes = AppConfig.class)
//@SpringJUnitConfig(classes = AppConfig.class)
public class Testspringboot1412ApplicationTests {

    @Autowired
    private Product product;
    @Autowired
    private Address address;
    @Autowired
    private Apple apple;
    @Test
    public void contextLoads() {
        System.out.println(apple);
    }

    @Test
    public void test(){
        System.out.println(product);
        System.out.println(address);
    }

}

