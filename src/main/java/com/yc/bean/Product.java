package com.yc.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties(prefix = "product")
public class Product {
    private String pname;
    private Double price;
    private Boolean isUsed;
    private Date manDate;
    private Map<String,String> attributes;
    private Address address;
    private List<String> types;
}
