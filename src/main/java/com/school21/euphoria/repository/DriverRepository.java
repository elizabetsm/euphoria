package com.school21.euphoria.repository;

import com.school21.euphoria.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
    @Override
    List<Driver> findAll();

    @Override
    Driver getById(Long aLong);

    @Override
    <S extends Driver> S save(S entity);
}
