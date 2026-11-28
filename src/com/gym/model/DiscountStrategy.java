package com.gym.model;

public interface DiscountStrategy {
    double applyDiscount(double amount);
    String getName();
}
