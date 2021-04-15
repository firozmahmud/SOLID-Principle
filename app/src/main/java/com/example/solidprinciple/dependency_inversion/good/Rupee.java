package com.example.solidprinciple.dependency_inversion.good;

public class Rupee implements CurrencyConversion {
    @Override
    public String currency() {
        return "Rp ";
    }
}
