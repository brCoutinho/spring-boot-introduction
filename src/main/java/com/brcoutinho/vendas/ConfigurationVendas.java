package com.brcoutinho.vendas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

//@Configuration
//@Profile("development") //o que estiver nessa classe só rodará para o perfil 'development'
@Development
public class ConfigurationVendas {
    @Bean
    public CommandLineRunner executar(){
        return args -> {
            System.out.println("Rodando a configuração de desenvolvimento");
        };
    }
}
