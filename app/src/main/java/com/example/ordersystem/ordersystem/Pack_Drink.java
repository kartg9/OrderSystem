package com.example.ordersystem.ordersystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class Pack_Drink extends AppCompatActivity {
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

        Button Pack_Cof = (Button)findViewById(R.id.Pack_Cof);
        Pack_Cof.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Pack_Drink.this,Pack_Soup.class);
                startActivity(intent);
            }
        });

        Button Pack_Nemon = (Button)findViewById(R.id.Pack_Nemon);
        Pack_Nemon.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Pack_Drink.this,Pack_Soup.class);
                startActivity(intent);
            }
        });
        Button Pack_Cok = (Button)findViewById(R.id.Pack_Cok);
        Pack_Cok.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Pack_Drink.this,Pack_Soup.class);
                startActivity(intent);
            }
        });
        Button Pack_Chino = (Button)findViewById(R.id.Pack_Chino);
        Pack_Chino.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Pack_Drink.this,Pack_Soup.class);
                startActivity(intent);
            }
        });
        Button Pack_Nate = (Button)findViewById(R.id.Pack_Nate);
        Pack_Nate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Pack_Drink.this,Pack_Soup.class);
                startActivity(intent);
            }
        });
        Button Pack_Fanda = (Button)findViewById(R.id.Pack_Fanda);
        Pack_Fanda.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Pack_Drink.this,Pack_Soup.class);
                startActivity(intent);
            }
        });

        Button Pack_Jui = (Button)findViewById(R.id.Pack_Jui);
        Pack_Jui.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Pack_Drink.this,Pack_Soup.class);
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
