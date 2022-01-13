package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);

        while (true){
            try {
                System.out.print("Напишите сумму вывода: ");
                bankAccount.withDraw(6000);

            }catch (LimitException limitException){
                System.out.println(limitException.getMessage());
                try {
                    bankAccount.withDraw((int) (limitException.getRemainingAmount()));
                } catch (LimitException e) {
                    e.printStackTrace();
                }
                break;
            }
        }
    }
}
