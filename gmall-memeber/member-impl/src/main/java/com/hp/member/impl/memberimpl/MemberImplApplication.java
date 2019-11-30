package com.hp.member.impl.memberimpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.hp.member.impl.memberimpl.mapper")
public class MemberImplApplication {

    public static void main(String[] args) {
        SpringApplication.run(MemberImplApplication.class, args);
    }

}
