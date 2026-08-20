package com.aprexter.googledocs.repositry;

import com.aprexter.googledocs.models.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepositry extends JpaRepository<Document,Long> {

}
