package com.example.yazilimguncelkonular.RestApi;

import com.example.yazilimguncelkonular.Models.ResponseReturn;
import com.example.yazilimguncelkonular.Models.Login;

import retrofit2.Call;

public class ManagerAll extends BaseManager{

    private static  ManagerAll ourInstance=new ManagerAll();
    public  static synchronized ManagerAll getInstance()
    {
        return ourInstance;
    }
    public Call<ResponseReturn> getirCall(Login login)
    {
        Call<ResponseReturn> x=getRestApi().getir(login);
        return x;
    }
}
