package com.adityasinha.projects.managefinance.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class MutualFund {
    @Id
    private String userId;
    private int instrumentId;
    private int name;
    private int units;
    private double nav;
    private MutualFundRiskType riskType;
    private MutualFundType type;

    enum MutualFundRiskType {
        VERY_HIGH,
        HIGH,
        MEDIUM_HIGH,
        MEDIUM,
        LOW
    }

    enum MutualFundType {
        LARGE_CAP,
        MID_CAP,
        SMALL_CAP,
        INDEX,
        SECTORAL
    }
}
