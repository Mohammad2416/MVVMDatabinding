package com.mohammadmirzakhani.sample.mvvmdatabinding.handler;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.mohammadmirzakhani.sample.mvvmdatabinding.model.Customer;

public class EventHandler {
    private Context context;

    public EventHandler(Context context) {
        this.context = context;
    }

    private void onHandleClick(){
        Toast.makeText(context, "Clicked :D", Toast.LENGTH_SHORT).show();
    }

    private void clickOnViewGetData(Customer customer){
        Toast.makeText(context, "Customer Name : " + customer.getFirstName(), Toast.LENGTH_SHORT).show();
    }

}
