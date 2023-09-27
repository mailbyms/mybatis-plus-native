package com.gyjian.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import java.net.UnknownHostException;

@Slf4j
@SpringBootApplication(proxyBeanMethods = false)
public class MybatisPlusNativeApplication {

    public static void main(String[] args) throws UnknownHostException {
        ConfigurableApplicationContext application = SpringApplication.run(MybatisPlusNativeApplication.class, args);
        Environment env = application.getEnvironment();
        String port = env.getProperty("server.port");
        String path = env.getProperty("server.servlet.context-path");
        String infoMessage = "Local: http://localhost:" + port + path + "doc.html\n";

        log.info(infoMessage);
    }

}
