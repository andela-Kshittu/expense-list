package com.engage.expenseserver.repositories;

import com.engage.expenseserver.domains.Expense;

import org.springframework.data.repository.CrudRepository;

public interface ExpenseRepository extends CrudRepository<Expense, Long> {
}
