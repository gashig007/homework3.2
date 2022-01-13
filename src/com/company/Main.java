package com.company;

public class Main {

    public static void main(String[] args) {
        Boolean remainder = false;
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);
        while (true) {
            try {
                System.out.println("Ваш счет " + bankAccount.getAmount());
                bankAccount.withDraw(6000);
            } catch (LimitException limitException) {
                System.out.println("Ваш счет: " + bankAccount.getAmount());
                System.out.println(limitException.getMessage());
                try {
                    bankAccount.withDraw((int) limitException.getRemainingAmount());
                } catch (LimitException e) {
                    e.printStackTrace();
                }
                break;
            }
        }
    }
}
