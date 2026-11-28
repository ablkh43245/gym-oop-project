package com.gym.model;

public class NoDiscountStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double amount) {return amount;}
    @Override
    public String getName() {return "No Discount (0%)";}
}
