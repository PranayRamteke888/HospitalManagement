package com.hospitalmanagement.service;

import java.util.List;

import com.hospitalmanagement.entity.Billing;

public interface BillingService {
    Billing generateBilling(Billing billing);
    List<Billing> getAllBillings();
}
