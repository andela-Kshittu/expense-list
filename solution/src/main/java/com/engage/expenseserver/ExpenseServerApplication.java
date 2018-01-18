package com.engage.expenseserver;

import com.engage.expenseserver.domains.Expense;
import com.engage.expenseserver.services.ExpenseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Slf4j
@SpringBootApplication
public class ExpenseServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpenseServerApplication.class, args);
	}
}
