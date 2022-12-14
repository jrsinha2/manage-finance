package com.adityasinha.projects.managefinance.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.mapping.Document;

@EqualsAndHashCode(callSuper = true)
@Data
@Document(collection = "Expense")
public class Expense extends Transaction{

    private ExpenseFlag expenseFlag;

}
