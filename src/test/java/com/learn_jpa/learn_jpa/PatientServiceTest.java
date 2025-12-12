package com.learn_jpa.learn_jpa;


import com.learn_jpa.learn_jpa.dto.BloodGroupStats;
import com.learn_jpa.learn_jpa.dto.CPatientInfo;
import com.learn_jpa.learn_jpa.entities.Patient;
import com.learn_jpa.learn_jpa.repositories.PatientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PatientServiceTest {

    @Autowired
    private PatientRepository patientRepository;

    @Test
    public void testPatient() {
//        List<Patient> patientList = patientRepository.findAll();
//        List<CPatientInfo> patientListConcerete = patientRepository.getAllPatientsInfoConcrete();
//        List<BloodGroupStats> patientStats = patientRepository.getBloodGroupStats();
//
//        for(var p: patientList) {
//            System.out.println(p);
//        }
//
//        int rowsAffected = patientRepository.updatePatientNameWithId("Akshit Yadav", 1L);
//
//        System.out.println(rowsAffected);
    }
}
