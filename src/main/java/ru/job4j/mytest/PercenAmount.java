package ru.job4j.mytest;

public class PercenAmount {

    public static double percAm(int revenue, int cogs, double bbr, short years) {
        int la = Loan.loanAmount(revenue);
               double percentPerYear = la * Rate.rate(revenue, cogs, la, bbr) / 100;
              return years * percentPerYear;
        }
    }
