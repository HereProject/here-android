package com.example.yazilimguncelkonular.RestApi;

import com.example.yazilimguncelkonular.Models.ResponseReturn;
import com.example.yazilimguncelkonular.Models.Login;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface RestApi {

    @POST("/api/v1/identity/login")
    Call<ResponseReturn> getir(@Body Login login);

}