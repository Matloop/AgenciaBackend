package com.matloop.crudseila.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@CrossOrigin(origins = "*")
public class CorsConfig {

    @Bean

    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/**") // Aplica a todas as rotas sob /api
                        .allowedOrigins("*")   // Permite de qualquer origem (para desenvolvimento)
                        // Em produção, especifique a origem do seu frontend:
                        // .allowedOrigins("http://localhost:3000", "https://seudominio.com")
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                        .allowedHeaders("*")
                        .allowCredentials(false); // true se você usar cookies/autenticação baseada em sessão
            }
        };
    }
}