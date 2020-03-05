package com.sgb.springdatasample.services;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;

/**
 * AuditorAwareService
 * 
 * @author Sebastián Gamboa
 */
public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("Auditor");
    }
}