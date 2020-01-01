package com.example.yazilimguncelkonular.Activity;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.navigation.NavigationView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.yazilimguncelkonular.Helper.Repository;
import com.example.yazilimguncelkonular.Models.YoklamaResponse;
import com.example.yazilimguncelkonular.R;
import com.example.yazilimguncelkonular.RestApi.ManagerAll;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class Anasayfa extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    FragmentManager manager;
    List<YoklamaResponse> responseList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anasayfa);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        getDers();
        manager = getFragmentManager();
    }
    private void getDers() {

        Call<List<YoklamaResponse>> servis= ManagerAll.getInstance().managerAllRestApiDers("Bearer "+Repository.responseReturn.getToken());
        servis.enqueue(new Callback<List<YoklamaResponse>>() {
            @Override
            public void onResponse(Call<List<YoklamaResponse>> call, Response<List<YoklamaResponse>> response) {
                if(response.isSuccessful())
                {
                    responseList=response.body();
                    if (response.body()!= null) {

                        Repository.yoklamaResponse=responseList;
                    }
                }
                else{
                    Toast.makeText(getApplicationContext(),"Kullanıcı bilgileri hatalı veya bulunmamaktadır.", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<YoklamaResponse>> call, Throwable t) {
                Log.i("meral","Hata Var");
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.anasayfa, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.derseKatil) {
            Intent intent = new Intent(this,DersListesi.class);
            startActivity(intent);
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
