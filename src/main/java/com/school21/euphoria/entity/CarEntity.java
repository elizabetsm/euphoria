package com.school21.euphoria.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Car", schema = "public", catalog = "postgres")
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarEntity carEntity = (CarEntity) o;
        return id == carEntity.id && Objects.equals(marka, carEntity.marka) && Objects.equals(number, carEntity.number) && Objects.equals(type, carEntity.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, marka, number, type);
    }
}
