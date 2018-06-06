package com.example.ordersystem.ordersystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class Single_Meal extends AppCompatActivity {
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            return true;
        }
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single__meal);
        Button Single_Gipin = (Button)findViewById(R.id.Single_Gipin);
        Single_Gipin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Single_Meal.this,Single_Result.class);
                intent.putExtra("Single_Meal_Value","極品肋眼牛");
                startActivity(intent);
            }
        });

        Button Single_Dakoai = (Button)findViewById(R.id.Single_Dakoai);
        Single_Dakoai.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Single_Meal.this,Single_Result.class);
                intent.putExtra("Single_Meal_Value","大塊厚切牛");
                startActivity(intent);
            }
        });

        Button Single_Dadin = (Button)findViewById(R.id.Single_Dadin);
        Single_Dadin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Single_Meal.this,Single_Result.class);
                intent.putExtra("Single_Meal_Value","大丁骨牛");
                startActivity(intent);
            }
        });

        Button Single_Fali = (Button)findViewById(R.id.Single_Fali);
        Single_Fali.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Single_Meal.this,Single_Result.class);
                intent.putExtra("Single_Meal_Value","經典菲力牛");
                startActivity(intent);
            }
        });
        Button Single_Gipai = (Button)findViewById(R.id.Single_Gipai);
        Single_Gipai.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Single_Meal.this,Single_Result.class);
                intent.putExtra("Single_Meal_Value","香煎雞腿排");
                startActivity(intent);
            }
        });

        Button Single_Chupai = (Button)findViewById(R.id.Single_Chupai);
        Single_Chupai.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Single_Meal.this,Single_Result.class);
                intent.putExtra("Single_Meal_Value","嫩煎厚豬排");
                startActivity(intent);
            }
        });

        Button Single_Meal_Back = (Button)findViewById(R.id.Single_Meal_Back);
        Single_Meal_Back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
