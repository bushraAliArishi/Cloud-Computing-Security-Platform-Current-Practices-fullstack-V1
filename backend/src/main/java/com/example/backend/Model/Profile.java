package com.example.backend.Model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
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
    private Long id;

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

}
