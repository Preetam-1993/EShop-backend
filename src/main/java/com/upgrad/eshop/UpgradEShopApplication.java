package com.upgrad.eshop;

import com.upgrad.eshop.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class UpgradEShopApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(UpgradEShopApplication.class, args);
    }

}
