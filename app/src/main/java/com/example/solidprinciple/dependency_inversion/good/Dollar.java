package com.example.solidprinciple.dependency_inversion.good;

public class Dollar implements CurrencyConversion {
    @Override
    public String currency() {
        return "$ ";
    }
}
