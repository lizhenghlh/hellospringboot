package io.github.lizhenghlh;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Created by zhenglee on 2018/7/31.
 */
@SpringBootApplication
public class HelloApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(HelloApplication.class).web(true).run(args);
    }
}