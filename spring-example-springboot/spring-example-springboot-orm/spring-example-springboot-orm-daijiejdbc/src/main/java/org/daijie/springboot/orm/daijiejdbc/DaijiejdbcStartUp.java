package org.daijie.springboot.orm.daijiejdbc;


import org.daijie.jdbc.JDBCBaseConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;

@SpringBootApplication
public class DaijiejdbcStartUp {

    public static void main(String[] args) {
        SpringApplication.run(DaijiejdbcStartUp.class, args);
    }
}
