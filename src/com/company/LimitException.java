package com.company;

public class LimitException extends Exception{
    private Double remainingAmount;

    public LimitException(String message, Double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }

    public Double getRemainingAmount() {
        if(remainingAmount < 6000){
            System.out.println("Ваш счет: " + remainingAmount);
            remainingAmount = remainingAmount - remainingAmount;
            System.out.println("Ваш счет: " + remainingAmount);
        }
        return remainingAmount;
    }
}
