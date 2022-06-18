package com.school21.euphoria.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Getter
@Setter
@Table(name = "Car")
public class CarEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
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
