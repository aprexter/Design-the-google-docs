package com.aprexter.googledocs.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class TextElement extends DocumentElement {
    public TextElement(String text) {
        this.text = text;
    }
   @Lob
   @Column(nullable = false)
    private String text;

    @Override
    public String render() {
        return text;
    }
}
