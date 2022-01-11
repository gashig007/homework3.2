package com.company;

public class Main {

    public static void main(String[] args) throws LimitException {
        Boolean remainder = false;
        BankAccount bankAccount = new BankAccount();
        LimitException limitException = null;
        bankAccount.deposit(20000);
        while (true) {
            try {
                System.out.println("Ваш счет " + bankAccount.getAmount());
                bankAccount.withDraw(6000);
                if(bankAccount.getAmount() < 6000) {
                    limitException = new LimitException("На вашем счету недостаточно денег ", bankAccount.withDraw(6000));
                }
            } catch (LimitException limitException1) {
                System.out.println("Ваш счет: " + bankAccount.getAmount());
                limitException1.printStackTrace();
                if (bankAccount.getAmount() < 6000) {
                    System.out.println("Ваш счет: " + limitException);
                    break;
                }
            }
        }
    }
}
