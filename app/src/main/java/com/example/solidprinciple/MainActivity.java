package com.example.solidprinciple;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.solidprinciple.databinding.ActivityMainBinding;
import com.example.solidprinciple.dependency_inversion.good.BDT;
import com.example.solidprinciple.dependency_inversion.good.CurrencyConversion;
import com.example.solidprinciple.dependency_inversion.good.Dollar;
import com.example.solidprinciple.dependency_inversion.good.Rupee;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    //Dollar dollar;
    private CurrencyConversion currencyConversion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        setUpCurrency(new Rupee());
        setUpUI();
    }

    private void setUpCurrency(CurrencyConversion currency) {
        //this.dollar = dollar;
        currencyConversion = currency;
    }

    private void setUpUI() {
        //binding.text.setText(dollar.dollarCurrency() + 1200);
        binding.text.setText(currencyConversion.currency() + 1200);
    }
}