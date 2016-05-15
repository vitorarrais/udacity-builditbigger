package com.example.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by User on 15/05/2016.
 */
public class JokeService {

    public static final String BASE_URL = "http://api.icndb.com/";

    private Retrofit mRetrofit;

    private static JokeService sInstance;

    public static JokeService newInstance(){
        if (sInstance == null){
            sInstance = new JokeService();
        }

        return sInstance;
    }

    public JokeService() {
        mRetrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public JokeInterface api(){
        return mRetrofit.create(JokeInterface.class);
    }
}
