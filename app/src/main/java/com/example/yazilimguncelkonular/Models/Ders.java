package com.example.yazilimguncelkonular.Models;

import com.google.gson.annotations.SerializedName;

public class Ders {

    @SerializedName("dersAdi")
    private String dersAdi;
    @SerializedName("bolumId")
    private Integer bolumId;
    @SerializedName("bolum")
    private Object bolum;
    @SerializedName("ogretmenId")
    private Integer ogretmenId;
    @SerializedName("ogretmen")
    private Object ogretmen;
    @SerializedName("id")
    private Integer id;

    public String getDersAdi() {
        return dersAdi;
    }

    public void setDersAdi(String dersAdi) {
        this.dersAdi = dersAdi;
    }

    public Integer getBolumId() {
        return bolumId;
    }

    public void setBolumId(Integer bolumId) {
        this.bolumId = bolumId;
    }

    public Object getBolum() {
        return bolum;
    }

    public void setBolum(Object bolum) {
        this.bolum = bolum;
    }

    public Integer getOgretmenId() {
        return ogretmenId;
    }

    public void setOgretmenId(Integer ogretmenId) {
        this.ogretmenId = ogretmenId;
    }

    public Object getOgretmen() {
        return ogretmen;
    }

    public void setOgretmen(Object ogretmen) {
        this.ogretmen = ogretmen;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}


