package com.eugeneli.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: YebApplication
 * @Description: 启动类
 * @Author EugeneLi
 * @Date: 2021/5/4
 * @Time: 21:54
 */

@SpringBootApplication
@MapperScan("com.eugeneli.server.mapper")
public class YebApplication {

    public static void main(String[] args) {
        SpringApplication.run(YebApplication.class,args);

    }
}
