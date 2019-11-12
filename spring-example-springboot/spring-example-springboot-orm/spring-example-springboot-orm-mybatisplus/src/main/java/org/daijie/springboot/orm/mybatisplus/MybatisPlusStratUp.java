package org.daijie.springboot.orm.mybatisplus;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@MapperScan(basePackages = {"org.daijie.springboot.orm.mybatisplus.mapper"})
@SpringBootApplication
public class MybatisPlusStratUp {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusStratUp.class, args);
    }

    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
