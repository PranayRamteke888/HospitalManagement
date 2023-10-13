package com.hospitalmanagement.entity;

import javax.persistence.*;

@Entity
@Table(name = "reports")
public class Reports {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String reportName;

    @Lob
    @Column(nullable = false)
    private String reportData;

    // Constructors
    public Reports() {
    }

    public Reports(String reportName, String reportData) {
        this.reportName = reportName;
        this.reportData = reportData;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getReportData() {
        return reportData;
    }

    public void setReportData(String reportData) {
        this.reportData = reportData;
    }
}
