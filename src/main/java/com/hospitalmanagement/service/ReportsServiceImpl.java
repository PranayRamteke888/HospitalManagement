package com.hospitalmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalmanagement.entity.Reports;
import com.hospitalmanagement.repository.ReportsRepository;

import java.util.List;

@Service
public class ReportsServiceImpl implements ReportsService {
    @Autowired
    private ReportsRepository reportsRepository;

    @Override
    public List<Reports> getAllReports() {
        return reportsRepository.findAll();
    }

    @Override
    public Reports getReportById(Long id) {
        return reportsRepository.findById(id).orElse(null);
    }
}
