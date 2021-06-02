package com.xiao.boot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor // 无参构造器
@AllArgsConstructor // 全参构造器
@Data
@ToString
public class Pet {
    protected String name;
}
