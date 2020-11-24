package com.example.mitacfiademo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class Contact {
    @Id @GeneratedValue
    private Long id;
    private String name, phone, address;
}
