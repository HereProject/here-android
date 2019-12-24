package com.example.yazilimguncelkonular.RestApi;

import com.example.yazilimguncelkonular.Models.LoginsItem;

import java.util.List;

import retrofit2.Call;

public class ManagerAll extends BaseManager{

    private static  ManagerAll ourInstance=new ManagerAll();
    public  static synchronized ManagerAll getInstance()
    {
        return ourInstance;
    }
    public Call<List<LoginsItem>> getirCall()
    {
        Call<List<LoginsItem>> x=getRestApi().getir();
        return x;
    }
}
