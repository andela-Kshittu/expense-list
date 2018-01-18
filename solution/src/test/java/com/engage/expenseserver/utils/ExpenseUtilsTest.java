package com.engage.expenseserver.utils;

import static com.engage.expenseserver.utils.ExpenseUtils.cleanAmount;
import static com.engage.expenseserver.utils.ExpenseUtils.convertToPounds;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Shittu on 18/01/2018.
 */
public class ExpenseUtilsTest {

    @Test
    public void testConvertToPounds(){
        Double expected = 8.8;
        Assert.assertEquals("Failed to convert Euros to pounds", expected, convertToPounds("10"));
    }

    @Test
    public void testCleanEuros(){
        String expected = "12.00";
        Assert.assertEquals("Failed to clean euros", expected, cleanAmount("12,00 EUR"));
    }

    @Test
    public void testCleanPounds(){
        String expected = "100000.00";
        Assert.assertEquals("Failed to clean pounds", expected, cleanAmount("100,000.00"));
    }

    @Test
    public void  testInvalidAmounts() {
        String expected = "0.00";
        Assert.assertEquals("Failed to resolve invalid amount", expected, cleanAmount("INVALID"));
    }

}
