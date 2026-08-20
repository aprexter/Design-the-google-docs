package com.aprexter.googledocs.service;

import com.aprexter.googledocs.models.*;

public class DocumentEditor {
    private Document document;

    private Persistence persistance;
    public DocumentEditor(Document document, Persistence persistance) {
        this.document = document;
        this.persistance = persistance;
    }
    public void addText(String text) {
        document.getDocumentElements().add(new TextElement(text));
    }
    public void addImage(String path) {
        document.getDocumentElements().add(new ImageElement(path));
    }
    public void addUrl(String url) {
        document.getDocumentElements().add(new UrlElement(url));
    }

//    public String renderDocument() {
//        if (renderedDocument.isEmpty()) {
//            renderedDocument = document.render();
//        }
//        return renderedDocument;
//    }
//
//    public void saveDocument() {
//        storage.save(renderDocument());
//    }
}
