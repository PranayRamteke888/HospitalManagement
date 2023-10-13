package com.hospitalmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospitalmanagement.entity.Billing;

@Repository
public interface BillingRepository extends JpaRepository<Billing, Long> {
    // You can define custom query methods here if needed
}
