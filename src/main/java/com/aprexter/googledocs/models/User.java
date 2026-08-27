package com.aprexter.googledocs.models;

import com.aprexter.googledocs.models.converter.BooleanToStringConverter;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User extends BaseModel{

    @Column(nullable = false, length = 30,
            updatable = false)
    private String userName;
    @Column(nullable = false,unique = true,length = 50,
            updatable = false)
    private String email;
    @Column(insertable = false)
    @Convert(converter = BooleanToStringConverter.class)
    private Boolean deleted;

    @Column(nullable = false,updatable = false)
    private String password;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private ArrayList<Document>  documents;
    @Enumerated(EnumType.STRING)
    private List<RoleType> roles;
}
