package com.sgb.springdatasample.services;

import java.util.Optional;

import com.sgb.springdatasample.entities.User;

import org.springframework.data.domain.AuditorAware;

/**
 * @author Sebastián Gamboa
 */
public class AuditorAwareImpl implements AuditorAware<User> {

    private Optional<User> auditor = Optional.empty();

    /**
	 * @param auditor the auditor to set
	 */
	public void setAuditor(User auditor) {
		this.auditor = Optional.of(auditor);
	}

    @Override
    public Optional<User> getCurrentAuditor() {
        return auditor;
    }
}