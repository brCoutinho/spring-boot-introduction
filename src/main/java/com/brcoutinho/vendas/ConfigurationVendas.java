package com.brcoutinho.vendas;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationVendas {
    @Bean(name = "applicationName")
    public String applicationName(){
        return "Sistema de Vendas";
    }
}
