package ru.learnup.spring.boot.operasalesapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.learnup.spring.boot.operasalesapp.services.OperaService;

@Configuration
public class MyConfiguration {
    @Bean
    public OperaService operaService () {
        return new OperaService();
    }
}
