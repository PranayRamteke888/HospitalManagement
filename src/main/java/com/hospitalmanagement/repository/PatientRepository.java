package com.hospitalmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospitalmanagement.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    // You can define custom query methods here if needed
}
