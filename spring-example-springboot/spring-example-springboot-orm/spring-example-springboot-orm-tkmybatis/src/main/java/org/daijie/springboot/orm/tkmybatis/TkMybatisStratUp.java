package org.daijie.springboot.orm.tkmybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = {"org.daijie.springboot.orm.tkmybatis.mapper"})
@SpringBootApplication
public class TkMybatisStratUp {

    public static void main(String[] args) {
        SpringApplication.run(TkMybatisStratUp.class, args);
    }
}
