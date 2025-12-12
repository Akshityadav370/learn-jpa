package com.learn_jpa.learn_jpa.service;

import com.learn_jpa.learn_jpa.repositories.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientService {
    private final PatientRepository patientRepository;
}
