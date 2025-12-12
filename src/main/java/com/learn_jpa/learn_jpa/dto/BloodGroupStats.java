package com.learn_jpa.learn_jpa.dto;

import com.learn_jpa.learn_jpa.entities.type.BloodGroupType;
import lombok.Data;

@Data
public class BloodGroupStats {
    private final BloodGroupType bloodGroupType;
    private final Long count;
}
