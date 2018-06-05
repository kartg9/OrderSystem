package com.example.ordersystem.ordersystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Pack_Rsult extends Pack_Soup {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pack__rsult);
        Intent intent = getIntent();
        String Pack_Meal_Value = intent.getStringExtra("Pack_Meal_Value");
        String Pack_Drink_Value = intent.getStringExtra("Pack_Drink_Value");
        String Pack_Soup_Value = intent.getStringExtra("Pack_Soup_Value");
        TextView Pack_Result_Meal;
        TextView Pack_Result_Drink;
        TextView Pack_Result_Soup;
        Pack_Result_Meal = (TextView) findViewById(R.id.Pack_Result_Meal);
        Pack_Result_Meal.setText(Pack_Meal_Value);
        Pack_Result_Drink = (TextView) findViewById(R.id.Pack_Result_Drink);
        Pack_Result_Drink.setText(Pack_Drink_Value);
        Pack_Result_Soup = (TextView) findViewById(R.id.Pack_Result_Soup);
        Pack_Result_Soup.setText(Pack_Soup_Value);
        Button Pack_Result_Back = (Button)findViewById(R.id.Pack_Result_Back);
        Pack_Result_Back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
