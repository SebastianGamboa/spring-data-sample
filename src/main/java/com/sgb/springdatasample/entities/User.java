package com.sgb.springdatasample.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;
import lombok.Setter;

/**
 * User
 * @author Sebastián Gamboa
 */
@Entity
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class User {

    @Id
    @Column(length = 100, nullable = false, unique = true)
    private String email;

    @Column(nullable = false, length = 100)
    private String name;
}