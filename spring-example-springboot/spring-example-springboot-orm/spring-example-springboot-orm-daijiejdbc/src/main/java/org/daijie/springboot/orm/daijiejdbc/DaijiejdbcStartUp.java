package org.daijie.springboot.orm.daijiejdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class DaijiejdbcStartUp {

    public static void main(String[] args) {
        try {
            SpringApplication.run(DaijiejdbcStartUp.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
