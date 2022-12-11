package com.adityasinha.projects.managefinance.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Stocks {
    @Id
    private String userId;
    private int instrumentId;
    private String name;
    private String sector;
    private int quantity;
    private double avgBoughtPrice;
    private double lastTradedPrice;

}
