package com.hospitalmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalmanagement.entity.Bed;
import com.hospitalmanagement.repository.BedRepository;

import java.util.List;

@Service
public class BedServiceImpl implements BedService {
    @Autowired
    private BedRepository bedRepository;

    @Override
    public Bed allocateBed(Bed bed) {
        // Implement allocation logic and save to the repository
        return bedRepository.save(bed);
    }

    @Override
    public void deallocateBed(String bedNumber) {
        // Implement deallocation logic and update the bed's status in the repository
    }

    @Override
    public List<Bed> getAllBeds() {
        return bedRepository.findAll();
    }
}

