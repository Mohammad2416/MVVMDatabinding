package com.mohammadmirzakhani.sample.mvvmdatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mohammadmirzakhani.sample.mvvmdatabinding.databinding.ActivityMainBinding;
import com.mohammadmirzakhani.sample.mvvmdatabinding.model.Customer;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);


        Customer customer = new Customer();
        customer.setFirstName("Mohammad");
        customer.setLastName("Mirzakhani");

        binding.setCustomer(customer);


    }
}
