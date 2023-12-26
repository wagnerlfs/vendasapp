package br.com.wble.springbootexpert.vendas.vendas.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean(name = "ApplicationName")
    public String ApplicationName()
    {
        return "Sistema de Vendas";

    }
}
