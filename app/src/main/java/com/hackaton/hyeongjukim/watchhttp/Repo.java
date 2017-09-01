package com.hackaton.hyeongjukim.watchhttp;

import com.google.gson.annotations.SerializedName;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by hyeongjukim on 2017. 9. 2..
 */

public class Repo {
    @SerializedName("")
    String result;

    public String getResult(){
        return result;
    }

    public interface NoService{
        @GET("/")
        Call<Repo> result();
    }
}
