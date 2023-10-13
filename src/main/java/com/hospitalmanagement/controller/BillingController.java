package com.hospitalmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.hospitalmanagement.entity.Billing;
import com.hospitalmanagement.service.BillingService;

import java.util.List;

@RestController
@RequestMapping("/billing")
public class BillingController {
    @Autowired
    private BillingService billingService;

    @PostMapping("/generate")
    public ResponseEntity<Billing> generateBilling(@RequestBody Billing billing) {
        Billing generatedBilling = billingService.generateBilling(billing);
        return new ResponseEntity<>(generatedBilling, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public List<Billing> getAllBillings() {
        return billingService.getAllBillings();
    }
}
