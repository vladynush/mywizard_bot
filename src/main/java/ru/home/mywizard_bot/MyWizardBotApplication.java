package ru.home.mywizard_bot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;

@SpringBootApplication
public class MyWizardBotApplication {

    public static void main(String[] args) {
        ApiContextInitializer.init();
        SpringApplication.run(MyWizardBotApplication.class, args);
    }

}
