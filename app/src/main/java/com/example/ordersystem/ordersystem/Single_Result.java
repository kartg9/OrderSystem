package com.example.ordersystem.ordersystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Single_Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single__result);
        Intent intent = getIntent();
        String Single_Meal_Value = intent.getStringExtra("Single_Meal_Value");
        TextView Single_Result_Meal;
        Single_Result_Meal = (TextView) findViewById(R.id.Single_Result_Meal);
        Single_Result_Meal.setText(Single_Meal_Value);
    }
}
