package cn.netbuffer.mapstruct.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"cn.netbuffer"})
public class MapstructDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MapstructDemoApplication.class, args);
    }

}