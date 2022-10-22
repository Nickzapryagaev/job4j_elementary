package ru.job4j.mytest;

public class Rate {

    public static double rate(int revenue, int cogs, int loanAmount, double bbr) {
        double result = 0;
        double riskPrem = 0;
        int ebitda = revenue - cogs;
        for (int i = 0; i < loanAmount / ebitda; i++) {
            riskPrem += 0.5;
            result = riskPrem + bbr;
        }
        return result;
    }
}
