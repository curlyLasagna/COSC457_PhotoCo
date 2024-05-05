package com.example.demo;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.theme.Theme;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
@PWA(name = "Photo-Co", shortName = "Photo-Co")
@Theme("my-theme")
public class AppShell implements AppShellConfigurator {
    private static final Logger log = LoggerFactory.getLogger(AppShell.class);
    public static void main(String[] args) {
        SpringApplication.run(AppShell.class, args);
    }
}
