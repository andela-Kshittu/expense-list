package com.engage.expenseserver.controllers;

import com.engage.expenseserver.domains.Expense;
import com.engage.expenseserver.services.ExpenseService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Shittu on 18/01/2018.
 */
@RestController
public class ExpenseControllerImpl implements ExpenseController {
    private ExpenseService expenseService;

    @Autowired
    public void setExpenseService(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @Override
    public Expense create(@RequestBody Expense expense) {
        return expenseService.create(expense);
    }

    @Override
    public List<Expense> getAllExpenses() {
        return expenseService.getAllExpenses();
    }

}
