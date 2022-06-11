package com.school21.euphoria.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = "Car")
public class CarEntity {
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "marka")
    private String marka;
    @Basic
    @Column(name = "number")
    private String number;
    @Basic
    @Column(name = "type")
    private String type;
}
