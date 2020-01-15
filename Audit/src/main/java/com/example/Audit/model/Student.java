package com.example.Audit.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="STUDENT")
@EntityListeners(StudentListener.class)
public class Student {

    @Id
    int id;

    @Column(name="name")
    String name;
}
