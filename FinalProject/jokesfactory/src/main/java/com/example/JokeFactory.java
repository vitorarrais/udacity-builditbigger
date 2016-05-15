package com.example;

import com.example.rest.JokeResponse;
import com.example.rest.JokeService;

import retrofit2.Callback;

public class JokeFactory {


    private static JokeFactory sInstance;

    public static JokeFactory newInstance(){
        if (sInstance == null){
            sInstance = new JokeFactory();
        }

        return sInstance;
    }


    public String tell() {
        return "Sorry, funny jokes aren't available in free version";
    }

    public void tellNiceJoke(Callback<JokeResponse> callback){
        JokeService.newInstance().api().random().enqueue(callback);
    }
}
