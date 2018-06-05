package com.example.ordersystem.ordersystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Pack_Drink extends Pack_Meal {
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            return true;
        }
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pack__drink);
        Intent intent = getIntent();
        final String Pack_Meal_Value = intent.getStringExtra("Pack_Meal_Value");
        Button Pack_Cof = (Button)findViewById(R.id.Pack_Cof);
        Pack_Cof.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pack_Drink.this,Pack_Soup.class);
                intent.putExtra("Pack_Meal_Value",Pack_Meal_Value);
                intent.putExtra("Pack_Drink_Value","美式咖啡");
                startActivity(intent);
            }
        });

        Button Pack_Nemon = (Button)findViewById(R.id.Pack_Nemon);
        Pack_Nemon.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pack_Drink.this,Pack_Soup.class);
                intent.putExtra("Pack_Meal_Value",Pack_Meal_Value);
                intent.putExtra("Pack_Drink_Value","檸檬紅茶");
                startActivity(intent);
            }
        });
        Button Pack_Cok = (Button)findViewById(R.id.Pack_Cok);
        Pack_Cok.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pack_Drink.this,Pack_Soup.class);
                intent.putExtra("Pack_Meal_Value",Pack_Meal_Value);
                intent.putExtra("Pack_Drink_Value","百是可樂");
                startActivity(intent);
            }
        });
        Button Pack_Chino = (Button)findViewById(R.id.Pack_Chino);
        Pack_Chino.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pack_Drink.this,Pack_Soup.class);
                intent.putExtra("Pack_Meal_Value",Pack_Meal_Value);
                intent.putExtra("Pack_Drink_Value","卡布奇諾");
                startActivity(intent);
            }
        });
        Button Pack_Nate = (Button)findViewById(R.id.Pack_Nate);
        Pack_Nate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pack_Drink.this,Pack_Soup.class);
                intent.putExtra("Pack_Meal_Value",Pack_Meal_Value);
                intent.putExtra("Pack_Drink_Value","拿鐵咖啡");
                startActivity(intent);
            }
        });
        Button Pack_Fanda = (Button)findViewById(R.id.Pack_Fanda);
        Pack_Fanda.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pack_Drink.this,Pack_Soup.class);
                intent.putExtra("Pack_Meal_Value",Pack_Meal_Value);
                intent.putExtra("Pack_Drink_Value","分答汽水");
                startActivity(intent);
            }
        });

        Button Pack_Jui = (Button)findViewById(R.id.Pack_Jui);
        Pack_Jui.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pack_Drink.this,Pack_Soup.class);
                intent.putExtra("Pack_Meal_Value",Pack_Meal_Value);
                intent.putExtra("Pack_Drink_Value","鮮榨果汁");
                startActivity(intent);
            }
        });
        Button Pack_Drink_Back = (Button)findViewById(R.id.Pack_Drink_Back);
        Pack_Drink_Back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
