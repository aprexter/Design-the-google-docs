package com.aprexter.googledocs.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class DocumentElement extends BaseModel {
    public abstract String render();
}
