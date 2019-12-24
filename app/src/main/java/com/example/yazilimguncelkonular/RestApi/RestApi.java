package com.example.yazilimguncelkonular.RestApi;

import com.example.yazilimguncelkonular.Models.LoginsItem;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestApi {

    @GET("/comments")
    Call<List<LoginsItem>> getir();

}
