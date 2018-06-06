package com.example.ordersystem.ordersystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Pack_Meal extends AppCompatActivity {
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            return true;
        }
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pack__meal);
        Button Pack_Gipin = (Button)findViewById(R.id.Pack_Gipin);
        Pack_Gipin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pack_Meal.this,Pack_Drink.class);
                intent.putExtra("Pack_Meal_Value","極品肋眼牛");
                startActivity(intent);
            }
        });

        Button Pack_Dakoai = (Button)findViewById(R.id.Pack_Dakoai);
        Pack_Dakoai.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pack_Meal.this,Pack_Drink.class);
                intent.putExtra("Pack_Meal_Value","大塊厚切牛");
                startActivity(intent);
            }
        });

        Button Pack_Dadin = (Button)findViewById(R.id.Pack_Dadin);
        Pack_Dadin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pack_Meal.this,Pack_Drink.class);
                intent.putExtra("Pack_Meal_Value","大丁骨牛");
                startActivity(intent);
            }
        });

        Button Pack_Fali = (Button)findViewById(R.id.Pack_Fali);
        Pack_Fali.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pack_Meal.this,Pack_Drink.class);
                intent.putExtra("Pack_Meal_Value","經典菲力牛");
                startActivity(intent);
            }
        });

        Button Pack_Gipai = (Button)findViewById(R.id.Pack_Gipai);
        Pack_Gipai.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pack_Meal.this,Pack_Drink.class);
                intent.putExtra("Pack_Meal_Value","香煎雞腿排");
                startActivity(intent);
            }
        });

        Button Pack_Chupai = (Button)findViewById(R.id.Pack_Chupai);
        Pack_Chupai.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pack_Meal.this,Pack_Drink.class);
                intent.putExtra("Pack_Meal_Value","嫩煎厚豬排");
                startActivity(intent);
            }
        });

        Button Pack_Back = (Button)findViewById(R.id.Pack_Meal_Back);
        Pack_Back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pack_Meal.this,Home.class);
                startActivity(intent);
            }
        });
    }
}
