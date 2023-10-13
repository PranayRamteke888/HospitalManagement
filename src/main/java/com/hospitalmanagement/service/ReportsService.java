package com.hospitalmanagement.service;

import java.util.List;

import com.hospitalmanagement.entity.Reports;

public interface ReportsService {
    List<Reports> getAllReports();
    Reports getReportById(Long id);
}
