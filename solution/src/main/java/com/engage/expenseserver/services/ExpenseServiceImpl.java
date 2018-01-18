package com.engage.expenseserver.services;

import static com.engage.expenseserver.utils.ExpenseUtils.EUR;
import static com.engage.expenseserver.utils.ExpenseUtils.cleanPounds;
import static com.engage.expenseserver.utils.ExpenseUtils.convertToPounds;

import com.engage.expenseserver.domains.Expense;
import com.engage.expenseserver.repositories.ExpenseRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Shittu on 18/01/2018.
 */
@Service
public class ExpenseServiceImpl implements ExpenseService {

    private final ExpenseRepository expenseRepository;

    @Autowired
    public ExpenseServiceImpl(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    @Override
    public Expense create(Expense expense) {

        // Add vat before saving.
        String amount = expense.getAmount();
        Double value = amount.endsWith(EUR) ? convertToPounds(amount) : Double.valueOf(cleanPounds(amount));
        Double vat = (value / 100) * 20;

        // Ensure id is not set from frontend
        expense.setId(null);
        expense.setAmount(String.valueOf(value));
        expense.setVat(String.valueOf(vat));

        return expenseRepository.save(expense);
    }

    @Override
    public List<Expense> getAllExpenses() {
        List<Expense> expenses = new ArrayList<>();
        expenseRepository.findAll().iterator().forEachRemaining(expenses::add);
        return expenses;
    }
}
