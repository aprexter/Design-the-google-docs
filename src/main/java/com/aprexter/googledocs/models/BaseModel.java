package com.aprexter.googledocs.models;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@MappedSuperclass
public class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    @CreatedDate
    @Column(updatable = false,insertable = false,nullable = false)
    protected LocalDateTime createdDate;

    @LastModifiedDate
    @Column(insertable = false,nullable = false)
    protected LocalDateTime updatedDate;


}
