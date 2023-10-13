package com.hospitalmanagement.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospitalmanagement.entity.Bed;

@Repository
public interface BedRepository extends JpaRepository<Bed, Long> {
    // You can define custom query methods here if needed
}

