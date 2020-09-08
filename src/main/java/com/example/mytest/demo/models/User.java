package com.example.mytest.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.Getter;

import java.util.UUID;

@Entity
@Data

public class User {


    @Id
    @GeneratedValue
    private UUID id;

    private String name;

    private String email;

}
