package com.hospitalmanagement.service;

import java.util.List;

import com.hospitalmanagement.entity.Bed;

public interface BedService {
    Bed allocateBed(Bed bed);
    void deallocateBed(String bedNumber);
    List<Bed> getAllBeds();
}
