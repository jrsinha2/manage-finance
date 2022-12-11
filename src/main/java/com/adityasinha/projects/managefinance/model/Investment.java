package com.adityasinha.projects.managefinance.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;

@EqualsAndHashCode(callSuper = true)
@Data
@Document(collection = "Investment")
public class Investment extends Transaction{

    private InvestmentType type;

}
