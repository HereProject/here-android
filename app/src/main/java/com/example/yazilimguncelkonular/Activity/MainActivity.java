package com.example.yazilimguncelkonular.Activity;

import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.example.yazilimguncelkonular.Models.Login;
import com.example.yazilimguncelkonular.Models.ResponseReturn;
import com.example.yazilimguncelkonular.R;
import com.example.yazilimguncelkonular.RestApi.ManagerAll;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
FloatingActionButton fab;
    ResponseReturn kisilerItem;
    TextInputEditText txtUserName,txtPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUserName = findViewById(R.id.txtUserName);
        txtPassword = findViewById(R.id.txtPassword);

        /*fUL Ekran yapma*/
        Window window;
        window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        WindowManager wm = window.getWindowManager();
        Display ekran = wm.getDefaultDisplay();

        Point point = new Point();
        ekran.getSize(point);
        /* fUL Ekran yapma**/
        fab=findViewById(R.id.btn_login);


    }

    public void Login(View view) {
        Log.e("meral","Login Fonksiyonu giriş");
        Login login = new Login();
        login.setEmail(txtUserName.getText().toString());
        login.setPassword(txtPassword.getText().toString());

        Call<ResponseReturn> servis= ManagerAll.getInstance().getirCall(login);
        servis.enqueue(new Callback<ResponseReturn>() {
            @Override
            public void onResponse(Call<ResponseReturn> call, Response<ResponseReturn> response) {
                if(response.isSuccessful())
                {
                    kisilerItem=response.body();
                    if (kisilerItem.getSuccess() == true) {
                        Intent i = new Intent(getApplicationContext(), SideMenu.class);
                        startActivity(i);
                    }else{
                        Toast.makeText(getApplicationContext(),kisilerItem.getErrors().get(0),Toast.LENGTH_LONG).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<ResponseReturn> call, Throwable t) {
                Log.i("meral","Hata Var");
            }
        });
    }
}
