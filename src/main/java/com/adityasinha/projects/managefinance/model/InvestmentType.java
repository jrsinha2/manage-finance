package com.adityasinha.projects.managefinance.model;

import lombok.Getter;

@Getter
public enum InvestmentType {
    STOCK(1, "stock"),
    MUTUAL_FUND(2, "mutual_fund"),
    FIXED_DEPOSIT(3, "fixed_deposit"),
    ELSS(4, "tax_saving_fund");
    private final int instrumentId;

    private final String instrumentName;

    InvestmentType(int instrumentId, String instrumentName) {
        this.instrumentId = instrumentId;
        this.instrumentName = instrumentName;
    }
}
