package com.example.yazilimguncelkonular.Activity;

import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.yazilimguncelkonular.R;

public class GirisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris);
        Window window;
        window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        WindowManager wm = window.getWindowManager();
        Display ekran = wm.getDefaultDisplay();

        Point point = new Point();
        ekran.getSize(point);
    }

    public void ogrenciGirisi(View view) {
        Intent i=new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
