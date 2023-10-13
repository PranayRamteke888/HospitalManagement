package com.hospitalmanagement.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String contactNumber;

    @Column(nullable = false)
    private Date dateOfAdmit;

    // Constructors
    public Patient() {
    }

    public Patient(String name, String address, String contactNumber, Date dateOfAdmit) {
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
        this.dateOfAdmit = dateOfAdmit;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Date getDateOfAdmit() {
        return dateOfAdmit;
    }

    public void setDateOfAdmit(Date dateOfAdmit) {
        this.dateOfAdmit = dateOfAdmit;
    }
}
