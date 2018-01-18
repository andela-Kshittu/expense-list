package com.engage.expenseserver.controllers;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.engage.expenseserver.domains.Expense;
import com.engage.expenseserver.repositories.ExpenseRepository;
import com.engage.expenseserver.services.ExpenseService;
import com.engage.expenseserver.services.ExpenseServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * Created by Shittu on 18/01/2018.
 */
public class ExpenseControllerTest {
    private ExpenseService expenseService;
    private ExpenseController expenseController;

    @Before
    public void setup() {
        expenseService = Mockito.mock(ExpenseService.class);
        expenseController = new ExpenseControllerImpl();
        expenseController.setExpenseService(expenseService);
    }

    @Test
    public void testCreate() {
        Expense expense = Mockito.mock(Expense.class);
        expenseController.create(expense);
        verify(expenseService, times(1)).create(expense);
    }

    @Test
    public void testGetAllExpenses() {
        expenseController.getAllExpenses();
        verify(expenseService, times(1)).getAllExpenses();
    }
}
