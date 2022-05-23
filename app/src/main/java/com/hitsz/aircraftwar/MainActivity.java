package com.hitsz.aircraftwar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button easyButton = (Button) findViewById(R.id.easyButton);
        Button normalButton = (Button) findViewById(R.id.normalButton);
        Button hardButton = (Button) findViewById(R.id.hardButton);
        //创建简单模式
        easyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,EasyActivity.class);
                startActivity(intent);
            }
        });
        //创建普通模式
        normalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,NormalActivity.class);
                startActivity(intent);
            }
        });
        hardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,HardActivity.class);
                startActivity(intent);
            }
        });

    }
}