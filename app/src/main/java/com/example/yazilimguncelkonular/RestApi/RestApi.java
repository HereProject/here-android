package com.example.yazilimguncelkonular.RestApi;

import com.example.yazilimguncelkonular.Models.ResponseReturn;
import com.example.yazilimguncelkonular.Models.Login;
import com.example.yazilimguncelkonular.Models.YoklamaResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface RestApi {

    @POST("/api/v1/identity/login")
    Call<ResponseReturn> getir(@Body Login login);
    @GET("/api/v1/ogrenci/derslerim")
    Call<List<YoklamaResponse>> getDers(@Header("Authorization") String token);
}