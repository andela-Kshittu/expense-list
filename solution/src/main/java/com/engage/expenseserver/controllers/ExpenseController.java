package com.engage.expenseserver.controllers;

import com.engage.expenseserver.domains.Expense;
import com.engage.expenseserver.services.ExpenseService;
import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Shittu on 18/01/2018.
 */
public interface ExpenseController {

    void setExpenseService(ExpenseService expenseService);

    @RequestMapping(value = "app/expenses",method = RequestMethod.POST)
    @ResponseBody
    Expense create(@RequestBody Expense expense);

    @RequestMapping(value = "app/expenses",method = RequestMethod.GET)
    @ResponseBody
    List<Expense> getAllExpenses();
}
