package com.gym.model;

public interface Billable {
    double calculateFinalPrice(DiscountStrategy strategy);
}
