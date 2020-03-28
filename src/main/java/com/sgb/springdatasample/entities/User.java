package com.sgb.springdatasample.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * @author Sebastián Gamboa
 */
@Entity
@Table(name = "users")
@Getter
@Setter
@RequiredArgsConstructor
public class User extends AbstractEntity {

    @Id
    private String email;
    private String name;
}