package com.hospitalmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.hospitalmanagement.entity.Bed;
import com.hospitalmanagement.service.BedService;

import java.util.List;

@RestController
@RequestMapping("/beds")
public class BedController {
    @Autowired
    private BedService bedService;

    @PostMapping("/allocate")
    public ResponseEntity<Bed> allocateBed(@RequestBody Bed bed) {
        Bed allocatedBed = bedService.allocateBed(bed);
        return new ResponseEntity<>(allocatedBed, HttpStatus.CREATED);
    }

    @PostMapping("/deallocate/{bedNumber}")
    public ResponseEntity<Void> deallocateBed(@PathVariable String bedNumber) {
        bedService.deallocateBed(bedNumber);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/all")
    public List<Bed> getAllBeds() {
        return bedService.getAllBeds();
    }
}
