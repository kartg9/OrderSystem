package com.example.ordersystem.ordersystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class Pack_Soup extends AppCompatActivity {
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

        Button Pack_Gipin = (Button)findViewById(R.id.Pack_Soup_Corn);
        Pack_Gipin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Pack_Soup.this,Pack_Rsult.class);
                startActivity(intent);
            }
        });

        Button Pack_Dakoai = (Button)findViewById(R.id.Pack_Soup_Beef);
        Pack_Dakoai.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Pack_Soup.this,Pack_Rsult.class);
                startActivity(intent);
            }
        });

        Button Pack_Dadin = (Button)findViewById(R.id.Pack_Soup_Seafood);
        Pack_Dadin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(Pack_Soup.this,Pack_Rsult.class);
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
