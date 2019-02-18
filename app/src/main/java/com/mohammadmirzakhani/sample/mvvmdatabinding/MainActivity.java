package com.mohammadmirzakhani.sample.mvvmdatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mohammadmirzakhani.sample.mvvmdatabinding.databinding.ActivityMainBinding;
import com.mohammadmirzakhani.sample.mvvmdatabinding.handler.EventHandler;
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


        //And Also you can find and bind data for views which are in your layout but they are not in your Model.
        binding.imageView.setImageDrawable(getDrawable(R.drawable.ic_launcher_background));


        //EventHandler::clickOnView
//        binding.setEventHandler(new EventHandler(this));

    }
}
