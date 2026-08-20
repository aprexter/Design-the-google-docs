package com.aprexter.googledocs.models;

import com.aprexter.googledocs.models.converter.BooleanToStringConverter;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
@Getter
@Setter
@Entity
public class Document extends BaseModel {

    @OneToMany
    @JoinColumn(name = "document_id")
    private ArrayList<DocumentElement> documentElements;

    @Convert(converter = BooleanToStringConverter.class)
    private Boolean deleted;

    public Document(){
        this.documentElements = new ArrayList<>();
    }

    public void addDocumentElement(DocumentElement documentElement) {
        documentElements.add(documentElement);
    }

    public void removeDocumentElement(DocumentElement documentElement) {
        documentElements.remove(documentElement);
    }

}
