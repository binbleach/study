package com.huangjiabin.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//lombok注解创建实体类
@Data   //set、get
@AllArgsConstructor  //全参
@NoArgsConstructor  //空参
public class Payment {
    private Long id;
    private String serial;
}
