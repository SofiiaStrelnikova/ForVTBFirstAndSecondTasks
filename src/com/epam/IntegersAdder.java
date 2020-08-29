package com.epam;

public class IntegersAdder {
    public static int sum(int a, int b) {
        if ((a > 0 && b > 0 && Integer.MAX_VALUE - a < b) ||
                (a < 0 && b < 0 && Integer.MIN_VALUE - a > b))
            throw new ArithmeticException("Overflow of the integer type! Please enter two integers, " +
                    "that will give no more than 2^31-1 and no less than -2^31 after adding!");

        return Integer.sum(a, b);
    }
}
