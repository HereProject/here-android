package com.example.yazilimguncelkonular.Models;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class YoklamaResponse {
    @SerializedName("ders")
    private Ders ders;
    @SerializedName("yoklama")
    private Object yoklama;

    public Ders getDers() {
        return ders;
    }

    public void setDers(Ders ders) {
        this.ders = ders;
    }

    public Object getYoklama() {
        return yoklama;
    }

    public void setYoklama(Object yoklama) {
        this.yoklama = yoklama;
    }

}
