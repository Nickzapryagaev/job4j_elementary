package ru.job4j.mytest;

import static ru.job4j.mytest.Loan.loanAmount;
import static ru.job4j.mytest.Rate.rate;
import static ru.job4j.mytest.PercenAmount.percAm;

public class Main {

    public static void main(String[] args) {
        int revenue = 220_000;
        int la = loanAmount(revenue);
        System.out.println("Loan amount is: " + la);
        int cogs = 200_000;
        double bbr = 5f;
        double r = rate(revenue, cogs, loanAmount(revenue), bbr);
        System.out.println("Rate is: " + r);
        double percentPerYear = la * r / 100;
        System.out.println("Percent per year is: " + percentPerYear);
        short years = 5;
        double pA = percAm(revenue, cogs, bbr, years);
        System.out.println("Total percent is: " + pA);
    }
}
