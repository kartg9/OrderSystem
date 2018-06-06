package com.example.ordersystem.ordersystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class Single_Drink extends AppCompatActivity {
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            return true;
        }
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single__drink);
        Button Single_Cof = (Button)findViewById(R.id.Single_Cof);
        Single_Cof.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Single_Drink.this,Single_Result.class);
                intent.putExtra("Single_Drink_Value","美式咖啡");
                startActivity(intent);
            }
        });
        Button Single_Nemon = (Button)findViewById(R.id.Single_Nemon);
        Single_Nemon.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Single_Drink.this,Single_Result.class);
                intent.putExtra("Single_Drink_Value","檸檬紅茶");
                startActivity(intent);
            }
        });
        Button Single_Cok = (Button)findViewById(R.id.Single_Cok);
        Single_Cok.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Single_Drink.this,Single_Result.class);
                intent.putExtra("Single_Drink_Value","百是可樂");
                startActivity(intent);
            }
        });
        Button Single_Chino = (Button)findViewById(R.id.Single_Chino);
        Single_Chino.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Single_Drink.this,Single_Result.class);
                intent.putExtra("Single_Drink_Value","卡布奇諾");
                startActivity(intent);
            }
        });
        Button Single_Nate = (Button)findViewById(R.id.Single_Nate);
        Single_Nate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Single_Drink.this,Single_Result.class);
                intent.putExtra("Single_Drink_Value","拿鐵咖啡");
                startActivity(intent);
            }
        });
        Button Single_Fanda = (Button)findViewById(R.id.Single_Fanda);
        Single_Fanda.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Single_Drink.this,Single_Result.class);
                intent.putExtra("Single_Drink_Value","分答汽水");
                startActivity(intent);
            }
        });
        Button Single_Jui = (Button)findViewById(R.id.Single_Jui);
        Single_Jui.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Single_Drink.this,Single_Result.class);
                intent.putExtra("Single_Drink_Value","鮮榨果汁");
                startActivity(intent);
            }
        });



        Button Single_Drink_Back = (Button)findViewById(R.id.Single_Drink_Back);
        Single_Drink_Back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
