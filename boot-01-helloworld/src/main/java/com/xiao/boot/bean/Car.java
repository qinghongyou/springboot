package com.xiao.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//@Component
@NoArgsConstructor // 无参构造器
@AllArgsConstructor // 全参构造器
@Data
@ToString
@ConfigurationProperties(prefix = "mycar")
public class Car {
    public String brand;
    public int price;
}
