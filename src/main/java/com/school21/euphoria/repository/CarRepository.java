package com.school21.euphoria.repository;

import com.school21.euphoria.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    @Override
    List<Car> findAll();

    @Override
    Car getById(Long aLong);

    @Override
    <S extends Car> S save(S entity);
}
