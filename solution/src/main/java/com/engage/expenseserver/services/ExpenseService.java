package com.engage.expenseserver.services;

import com.engage.expenseserver.domains.Expense;
import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by Shittu on 18/01/2018.
 */
public interface ExpenseService {

    Expense create(@RequestBody Expense expense);

    List<Expense> getAllExpenses();
}
