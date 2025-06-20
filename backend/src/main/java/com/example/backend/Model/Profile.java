package com.example.backend.Model;

import java.io.File;
import java.time.LocalDateTime;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Profile {

    @Id
    private Integer  id;

    private String fName;
    private String lName;
    private int age;
    private String job;
    private LocalDateTime dob;
    @OneToOne
    @MapsId
    @JsonIgnore
    @JoinColumn(name = "user_id")
    private MyUser myUser;
     
    @OneToMany(mappedBy = "profile", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<FileModel> filesmodel;


}
