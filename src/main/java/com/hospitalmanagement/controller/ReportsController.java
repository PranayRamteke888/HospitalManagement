package com.hospitalmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.hospitalmanagement.entity.Reports;
import com.hospitalmanagement.service.ReportsService;

import java.util.List;

@RestController
@RequestMapping("/reports")
public class ReportsController {
    @Autowired
    private ReportsService reportsService;

    @GetMapping("/all")
    public List<Reports> getAllReports() {
        return reportsService.getAllReports();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Reports> getReportById(@PathVariable Long id) {
        Reports report = reportsService.getReportById(id);
        if (report != null) {
            return new ResponseEntity<>(report, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
