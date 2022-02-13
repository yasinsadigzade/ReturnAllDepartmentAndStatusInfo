package com.example.nextpieceofproject.data.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


}
