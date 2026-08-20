package com.aprexter.googledocs.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class UrlElement extends  DocumentElement{
    public UrlElement(String url){
        this.url = url;
    }


    @Column(length = 200,nullable = false)
    private String url;
    @Override
    public String render() {
        return url;
    }
}
