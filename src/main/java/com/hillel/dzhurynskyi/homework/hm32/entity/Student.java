package com.hillel.dzhurynskyi.homework.hm32.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "student", catalog = "hm32")
public class Student {
    @Id
    @Column(name = "id", unique = true, nullable = false)
    private long id;
    @Column(name = "name", length = 45)
    private String name;
    @Column(name = "email", length = 40)
    private String email;

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
