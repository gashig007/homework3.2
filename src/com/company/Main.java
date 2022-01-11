package com.company;

public class Main {

    public static void main(String[] args) {
        Boolean remainder = false;
        BankAccount bankAccount = new BankAccount();
        LimitException limitException = new LimitException("На вашем счету недостаточно денег ", bankAccount.getAmount());
        bankAccount.deposit(20000);
        while (true) {
            try {
                System.out.println("Ваш счет " + bankAccount.getAmount());
                bankAccount.withDraw(6000);
            } catch (LimitException limitException1) {
                if (limitException1.getRemainingAmount() < 6000) {
                    System.out.println("Ваш счет: " + limitException);
                    break;
                }
            }

        }
    }
}
