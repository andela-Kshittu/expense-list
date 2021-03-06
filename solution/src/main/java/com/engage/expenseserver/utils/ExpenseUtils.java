package com.engage.expenseserver.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Shittu on 18/01/2018.
 */
public class ExpenseUtils {
    private static final Pattern p = Pattern.compile("(^[0-9.,]+).*");
    public static final String EUR = "EUR";
    private static final String COMMA = ",";
    private static final String DOT = ".";
    private static final String BLANK = "";
    private static final Double RATE = 0.88;

    public static Double convertToPounds(String amount) {
        return Double.valueOf(cleanAmount(amount)) * RATE;
    }

    public static String cleanAmount(String amount) {
        // Normalize number string before conversion
        Matcher m = p.matcher(amount);
        // resolve invalid amounts.
        String cleanAmount = "0.00";
        if(m.matches()) {
            String group = m.group(1);
            String reversed = new StringBuilder(group).reverse().toString().replaceFirst(COMMA, DOT);
            String poundString = new StringBuilder(reversed).reverse().toString();
            int index = poundString.lastIndexOf(DOT);
            if (index > -1) {
                String suffix = poundString.substring(index);
                poundString = poundString.substring(0, index);
                cleanAmount = poundString.replace(DOT, BLANK).concat(suffix);
            } else {
                cleanAmount = poundString;
            }
        }
        return cleanAmount;
    }
}
