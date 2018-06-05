package com.example.ordersystem.ordersystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Pack_Soup extends Pack_Drink {
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            return true;
        }
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pack__soup);

        Intent intent = getIntent();
        final String Pack_Meal_Value = intent.getStringExtra("Pack_Meal_Value");
        final String Pack_Drink_Value = intent.getStringExtra("Pack_Drink_Value");
        Button Pack_Gipin = (Button)findViewById(R.id.Pack_Soup_Corn);
        Pack_Gipin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Pack_Soup.this,Pack_Rsult.class);
                intent.putExtra("Pack_Meal_Value",Pack_Meal_Value);
                intent.putExtra("Pack_Drink_Value",Pack_Drink_Value);
                intent.putExtra("Pack_Soup_Value","玉米濃湯");
                startActivity(intent);
            }
        });

        Button Pack_Dakoai = (Button)findViewById(R.id.Pack_Soup_Beef);
        Pack_Dakoai.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Pack_Soup.this,Pack_Rsult.class);
                intent.putExtra("Pack_Meal_Value",Pack_Meal_Value);
                intent.putExtra("Pack_Drink_Value",Pack_Drink_Value);
                intent.putExtra("Pack_Soup_Value","牛肉清湯");
                startActivity(intent);

            }
        });




        Button Pack_Dadin = (Button)findViewById(R.id.Pack_Soup_Seafood);
        Pack_Dadin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Pack_Soup.this,Pack_Rsult.class);
                intent.putExtra("Pack_Meal_Value",Pack_Meal_Value);
                intent.putExtra("Pack_Drink_Value",Pack_Drink_Value);
                intent.putExtra("Pack_Soup_Value","海鮮清湯");
                startActivity(intent);
            }
        });

        Button Pack_Soup_Back = (Button)findViewById(R.id.Pack_Soup_Back);

        Pack_Soup_Back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                finish();
            }
        });



    }
}
