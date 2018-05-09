package com.example.ordersystem.ordersystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class Single_Class extends AppCompatActivity {
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            return true;
        }
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single__class);

        Button Single_Meal = (Button)findViewById(R.id.Single_Meal);
        Single_Meal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Single_Class.this,Single_Meal.class);
                startActivity(intent);
            }
        });

        Button Single_Drink = (Button)findViewById(R.id.Single_Drink);
        Single_Drink.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Single_Class.this,Single_Drink.class);
                startActivity(intent);
            }
        });

        Button Single_Soup = (Button)findViewById(R.id.Single_Soup);
        Single_Soup.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Single_Class.this,Single_Soup.class);
                startActivity(intent);
            }
        });

        Button Single_Class_Back = (Button)findViewById(R.id.Single_Class_Back);
        Single_Class_Back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Single_Class.this,Home.class);
                startActivity(intent);
            }
        });
    }
}
