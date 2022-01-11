package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public Double deposit(double sum){
        amount = amount + sum;
        return amount;
    }

    public Double withDraw(double sum) throws LimitException {
        amount = amount - sum;
        if (amount < sum){
            throw new LimitException("На вашем счету недостаточно денег " + getAmount(), amount);
        }
        return amount;
    }
}
