package com.example.ordersystem.ordersystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Pack_Rsult extends Pack_Soup {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pack__rsult);
        Intent intent = getIntent();
        final String Pack_Meal_Value = intent.getStringExtra("Pack_Meal_Value");
        final String Pack_Drink_Value = intent.getStringExtra("Pack_Drink_Value");
        final String Pack_Soup_Value = intent.getStringExtra("Pack_Soup_Value");
        final TextView Pack_Result_Meal;
        final TextView Pack_Result_Drink;
        final TextView Pack_Result_Soup;
        Pack_Result_Meal = (TextView) findViewById(R.id.Pack_Result_Meal);
        Pack_Result_Meal.setText(Pack_Meal_Value);
        Pack_Result_Drink = (TextView) findViewById(R.id.Pack_Result_Drink);
        Pack_Result_Drink.setText(Pack_Drink_Value);
        Pack_Result_Soup = (TextView) findViewById(R.id.Pack_Result_Soup);
        Pack_Result_Soup.setText(Pack_Soup_Value);


    }
}
