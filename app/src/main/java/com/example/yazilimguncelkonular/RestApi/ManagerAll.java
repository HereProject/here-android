package com.example.yazilimguncelkonular.RestApi;

import com.example.yazilimguncelkonular.Models.ResponseReturn;
import com.example.yazilimguncelkonular.Models.Login;
import com.example.yazilimguncelkonular.Models.YoklamaResponse;

import java.util.List;

import retrofit2.Call;

public class ManagerAll extends BaseManager{

    private static  ManagerAll ourInstance=new ManagerAll();
    public  static synchronized ManagerAll getInstance()
    {
        return ourInstance;
    }
    public Call<ResponseReturn> managerAllRestApiLogin(Login login)
    {
        Call<ResponseReturn> x=getRestApi().restApiLogin(login);
        return x;
    }
    public Call<List<YoklamaResponse>> managerAllRestApiDers(String token)
    {
        Call<List<YoklamaResponse>> x=getRestApi().restApiDers(token);
        return x;
    }

}
