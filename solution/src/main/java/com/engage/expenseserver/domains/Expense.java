package com.engage.expenseserver.domains;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Expense {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String amount;
    private String vat;
    private String date;
    private String reason;

    public Expense(String amount, String vat, String date, String reason) {
        this.amount = amount;
        this.vat = vat;
        this.date = date;
        this.reason = reason;
    }
}
