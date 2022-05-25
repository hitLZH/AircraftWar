package com.hitsz.aircraftwar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.DisplayMetrics;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        float screenWidth = dm.widthPixels;
        float screenHeight = dm.heightPixels;

    }
    public void drawImage(){
        canvas = mSurfaceHolder.lockCanvas();
    }


}