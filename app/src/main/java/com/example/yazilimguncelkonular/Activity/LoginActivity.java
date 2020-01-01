package com.example.yazilimguncelkonular.Activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

import com.example.yazilimguncelkonular.Helper.Repository;
import com.example.yazilimguncelkonular.Models.Ders;
import com.example.yazilimguncelkonular.Models.Login;
import com.example.yazilimguncelkonular.Models.ResponseReturn;
import com.example.yazilimguncelkonular.R;
import com.example.yazilimguncelkonular.RestApi.ManagerAll;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {
    FloatingActionButton fab;
    ResponseReturn kisilerItem;
    Ders ders;
    private ProgressDialog progressDialog;
    TextInputEditText txtUserName, txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txtUserName = findViewById(R.id.txtUserName);
        txtPassword = findViewById(R.id.txtPassword);
        /*fUL Ekran yapma*/
        Window window;
        window = getWindow();
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,                   WindowManager.LayoutParams.FLAG_FULLSCREEN);
        WindowManager wm = window.getWindowManager();
        Display ekran = wm.getDefaultDisplay();
        Point point = new Point();
        ekran.getSize(point);
        fab = findViewById(R.id.btn_login);


    }
    private boolean isEmpty(EditText edittext) {
        if (edittext.getText().toString().trim().length() > 0)
            return false;

        return true;
    }

    public void Login(View view) {

        if (!isEmpty(txtUserName) && !isEmpty(txtPassword)) {

            postRequestLoginMethod();

        } else if (isEmpty(txtUserName)) {
            txtUserName.requestFocus();
            txtUserName.setError("Lütfen kullanıcı adınızı giriniz!");
        } else {
            txtPassword.requestFocus();
            txtPassword.setError("Lütfen şifrenizi giriniz!");
        }
    }
    private void postRequestLoginMethod() {
        progressDialog = new ProgressDialog(LoginActivity.this);
        progressDialog.setMessage("Lütfen Bekleyiniz");
        progressDialog.show();
        Login login = new Login();
        Log.e("meral","Login Fonksiyonu giriş");
        login.setEmail(txtUserName.getText().toString());
        login.setPassword(txtPassword.getText().toString());
        Call<ResponseReturn> servis= ManagerAll.getInstance().managerAllRestApiLogin(login);
        servis.enqueue(new Callback<ResponseReturn>() {
            @Override
            public void onResponse(Call<ResponseReturn> call, Response<ResponseReturn> response) {
                progressDialog.dismiss();
                if(response.isSuccessful())
                {
                    kisilerItem=response.body();
                    if (response.body()!= null) {
                        Toast.makeText(LoginActivity.this,
                                "Giriş Başarılı", Toast.LENGTH_SHORT).show();
                        Repository.responseReturn=kisilerItem;
                        Intent i = new Intent(getApplicationContext(), Anasayfa.class);
                        startActivity(i);
                    }
                }
                else{
                    Toast.makeText(getApplicationContext(),"Kullanıcı bilgileri hatalı veya bulunmamaktadır.", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ResponseReturn> call, Throwable t) {

                Log.i("meral","Hata Var");
            }
        });
    }
}
