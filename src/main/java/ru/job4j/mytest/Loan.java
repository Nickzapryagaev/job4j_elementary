package ru.job4j.mytest;

public class Loan {
    public static int loanAmount(int revenue) {
        double result = revenue * 0.25;
        if (result < 40_000) {
            result = 0;
        } else if (result > 50_000) {
            result = 50_000;
        }
        return (int) result;
    }
}