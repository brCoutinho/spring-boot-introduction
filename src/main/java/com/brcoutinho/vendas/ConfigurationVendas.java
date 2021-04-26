package com.brcoutinho.vendas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("development") //o que estiver nessa classe só rodará para o perfil 'development'
public class ConfigurationVendas {
    @Bean
    public CommandLineRunner executar(){
        return args -> {
            System.out.println("Rodando a configuração de desenvolvimento");
        };
    }
}
