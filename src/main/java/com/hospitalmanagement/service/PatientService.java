package com.hospitalmanagement.service;

import java.util.List;

import com.hospitalmanagement.entity.Patient;

public interface PatientService {
    Patient registerPatient(Patient patient);
    Patient getPatientById(Long id);
    List<Patient> getAllPatients();
}
