package com.adityasinha.projects.managefinance.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
public class Transaction {

    @Id
    private String transactionId;

    private double amount;

    private String name;

    private LocalDateTime transactionTs;

}
