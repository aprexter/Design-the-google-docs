package com.aprexter.googledocs;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class GoogleDocsApplication {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

    public static void main(String[] args) {
        SpringApplication.run(GoogleDocsApplication.class, args);



//        Document document = new Document();
//        Persistence persistence = new FileStorage();
//
//        DocumentEditor editor = new DocumentEditor(document, persistence);
//
//        // Simulate a client using the editor with common text formatting features.
//        editor.addText("Hello, world!");
//        editor.addNewLine();
//        editor.addText("This is a real-world document editor example.");
//        editor.addNewLine();
//        editor.addTabSpace();
//        editor.addText("Indented text after a tab space.");
//        editor.addNewLine();
//        editor.addImage("picture.jpg");
//
//        // Render and display the final document.
//        System.out.println(editor.renderDocument());
//
//        editor.saveDocument();
    }

}
