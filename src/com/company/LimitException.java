package com.company;

public class LimitException extends Exception{
    private Double remainingAmount;

    public LimitException(String message, Double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }

    public Double getRemainingAmount() {
        if(remainingAmount < 6000){
            remainingAmount = remainingAmount - remainingAmount;
        }
        return remainingAmount;
    }
}
