package com.sgb.springdatasample.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

/**
 * AbstractEntity
 * 
 * @author Sebastián Gamboa
 */
@MappedSuperclass
public abstract class AbstractEntity {

    @Column(nullable = false, updatable = false)
    @CreatedDate
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime modifiedAt;

    @Column(length = 100, updatable = false)
    @CreatedBy
    private String createdBy;

    @Column(length = 100)
    @LastModifiedBy
    private String modifiedBy;
}