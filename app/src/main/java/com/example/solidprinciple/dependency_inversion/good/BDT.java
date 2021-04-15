package com.example.solidprinciple.dependency_inversion.good;

public class BDT implements CurrencyConversion {
    @Override
    public String currency() {
        return "BDT ";
    }
}
