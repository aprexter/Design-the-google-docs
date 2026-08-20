package com.aprexter.googledocs.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.awt.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ImageElement extends  DocumentElement {
    @Column(length = 200,nullable = false)
    private String imagePath;

    public ImageElement(String imagePath){
        this.imagePath = imagePath;
    }


    @Override
    public String render() {
        return  "[Image: "+imagePath+" ]";
    }
}
