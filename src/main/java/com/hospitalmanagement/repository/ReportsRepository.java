package com.hospitalmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospitalmanagement.entity.Reports;

@Repository
public interface ReportsRepository extends JpaRepository<Reports, Long> {
    // You can define custom query methods here if needed
}
