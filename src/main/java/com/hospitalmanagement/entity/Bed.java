package com.hospitalmanagement.entity;

import javax.persistence.*;

@Entity
@Table(name = "beds")
public class Bed {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String bedNumber;

    @Column(nullable = false)
    private boolean isOccupied;

    @Column(nullable = false)
    private String bedType;

    // Constructors
    public Bed() {
    }

    public Bed(String bedNumber, boolean isOccupied, String bedType) {
        this.bedNumber = bedNumber;
        this.isOccupied = isOccupied;
        this.bedType = bedType;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(String bedNumber) {
        this.bedNumber = bedNumber;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }
}
