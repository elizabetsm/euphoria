package com.school21.euphoria.repository;

import com.school21.euphoria.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<CarEntity, Integer> {
    void deleteById(Long id);
}
