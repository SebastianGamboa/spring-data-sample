package com.sgb.springdatasample.config;

import com.sgb.springdatasample.entities.User;
import com.sgb.springdatasample.services.AuditorAwareImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * AuditConfiguration
 * 
 * @author Sebastián Gamboa
 */
@Configuration
@EnableJpaAuditing
public class AuditConfiguration {
    @Bean
    public AuditorAware<User> auditorProvider() {
        return new AuditorAwareImpl();
    }
}