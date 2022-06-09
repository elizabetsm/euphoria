package com.school21.euphoria.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Driver", schema = "public", catalog = "postgres")
public class DriverEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "license")
    private String license;
    @Basic
    @Column(name = "licenseDuration")
    private String licenseDuration;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getLicenseDuration() {
        return licenseDuration;
    }

    public void setLicenseDuration(String licenseDuration) {
        this.licenseDuration = licenseDuration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DriverEntity that = (DriverEntity) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(license, that.license) && Objects.equals(licenseDuration, that.licenseDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, license, licenseDuration);
    }
}
