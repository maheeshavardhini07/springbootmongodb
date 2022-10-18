package com.sony.task2.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @NonNull
    @Id
    private String id;
    @NonNull
    private String name;

    private String gender;
    private String email;
    private float salary;
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", gender=" + gender + ", email=" + email + ", salary=" + salary
                + "]";
    }
    
}
