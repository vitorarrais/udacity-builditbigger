package com.example.rest;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by User on 15/05/2016.
 */
public interface JokeInterface {

    @GET("jokes/random")
    Call<JokeResponse> random();
}
