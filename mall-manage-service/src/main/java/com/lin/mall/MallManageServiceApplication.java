package com.lin.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * description
 *
 * @author lin.luo@hand-china.com
 * @date 2019/11/4 10:47
 */
@SpringBootApplication
@MapperScan("com.lin.mall.mapper")
public class MallManageServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallManageServiceApplication.class, args);
    }
}
