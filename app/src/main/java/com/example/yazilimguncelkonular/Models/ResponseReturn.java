package com.example.yazilimguncelkonular.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ResponseReturn implements Serializable {
    @SerializedName("token")
    private Object token;
    @SerializedName("success")
    private Boolean success;
    @SerializedName("errors")
    @Expose
    private List<String> errors = new ArrayList<>();

    public Object getToken() {
        return token;
    }

    public void setToken(Object token) {
        this.token = token;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}
