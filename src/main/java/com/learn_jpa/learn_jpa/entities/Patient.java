package com.learn_jpa.learn_jpa.entities;

import com.learn_jpa.learn_jpa.entities.type.BloodGroupType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@ToString
@Data
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private LocalDate birthDate;

    private String email;

    private String gender;

    @Enumerated(value = EnumType.STRING)
    private BloodGroupType bloodGroup;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @OneToOne
    @JoinColumn(name = "patient_insurance", unique = true)
    private Insurance insurance; // owning side

    @OneToMany()
    @JoinColumn(name = "patient") // inverse side
    private Set<Appointment> appointments = new HashSet<>();
}
