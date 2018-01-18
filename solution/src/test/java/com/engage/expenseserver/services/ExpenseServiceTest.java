package com.engage.expenseserver.services;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.engage.expenseserver.domains.Expense;
import com.engage.expenseserver.repositories.ExpenseRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * Created by Shittu on 18/01/2018.
 */
public class ExpenseServiceTest {

    private ExpenseService expenseService;
    private ExpenseRepository expenseRepository;

    @Before
    public void setup() {
        expenseRepository = Mockito.mock(ExpenseRepository.class);
        expenseService = new ExpenseServiceImpl(expenseRepository);
    }

    @Test
    public void testCreate() {
        Expense expense = Mockito.mock(Expense.class);
        when(expense.getAmount()).thenReturn("12.00");

        expenseService.create(expense);

        verify(expense, times(1)).getAmount();
        verify(expense, times(1)).setId(null);
        verify(expense, times(1)).setAmount("12.0");
        verify(expense, times(1)).setVat("2.4");
        verify(expenseRepository, times(1)).save(expense);
    }

    @Test
    public void testGetAllExpenses() {
        expenseService.getAllExpenses();
        verify(expenseRepository, times(1)).findAll();
    }
}
