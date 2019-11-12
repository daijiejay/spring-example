package org.daijie.springboot.orm.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = {"org.daijie.springboot.orm.mybatis.mapper"})
@SpringBootApplication
public class MybatisStratUp {

    public static void main(String[] args) {
        SpringApplication.run(MybatisStratUp.class, args);
    }
}
