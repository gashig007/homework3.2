package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
        System.out.println("Вы пополнили счет на: " + (int) getAmount() + " Сом");
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void withDraw(int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Операция недоступна, недостаточно средств на счету: ", amount);
        } else {
            amount -= sum;
            System.out.println("Вы сняли: " + sum + " Сом" + " Остаток на счету: " + amount);
        }
    }
}
