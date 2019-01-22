package com.yafun;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yafun.mapper")
public class YaFunApplication {

	public static void main(String[] args) {
		SpringApplication.run(YaFunApplication.class, args);
	}
}
