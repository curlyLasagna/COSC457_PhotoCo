package com.example.demo;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.theme.Theme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication()
@ComponentScan("com.example.demo.data")
@EntityScan("com.example.demo.data")
@PWA(name = "Photo-Co", shortName = "Photo-Co")
@Theme("my-theme")
public class AppShell implements AppShellConfigurator {
    public static void main(String[] args) {
        SpringApplication.run(AppShell.class, args);
    }
}
