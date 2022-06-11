package com.school21.euphoria.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
    void deleteById(Long id);
}
