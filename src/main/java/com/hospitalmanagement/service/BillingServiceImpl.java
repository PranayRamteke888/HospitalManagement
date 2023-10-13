package com.hospitalmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalmanagement.entity.Billing;
import com.hospitalmanagement.repository.BillingRepository;

import java.util.List;

@Service
public class BillingServiceImpl implements BillingService {
    @Autowired
    private BillingRepository billingRepository;

    @Override
    public Billing generateBilling(Billing billing) {
        // Implement billing generation logic and save to the repository
        return billingRepository.save(billing);
    }

    @Override
    public List<Billing> getAllBillings() {
        return billingRepository.findAll();
    }

	
	}
