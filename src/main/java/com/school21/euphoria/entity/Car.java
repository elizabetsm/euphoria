package com.school21.euphoria.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Entity
public class Car {
    String markka;
    String number;
    long id;
}
