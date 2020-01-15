package com.example.Audit.model;

import javax.persistence.PostRemove;
import javax.persistence.PreRemove;

public class StudentListener {

    @PreRemove
    void preRemove(Student student) {
        System.out.println("Pre remove: " + student);
    }

    @PostRemove
    void postRemove(Student student) {
        System.out.println("Post remove: " + student);
    }
}
