package com.example.rest;

import com.google.gson.annotations.SerializedName;

/**
 * Created by User on 15/05/2016.
 */
public class JokeResponse {

    String type;

    @SerializedName("value")
    Joke joke;

    public String getType() {
        return type;
    }

    public Joke getJoke() {
        return joke;
    }

    public class Joke{
        Integer id;

        @SerializedName("joke")
        String value;

        public Integer getId() {
            return id;
        }

        public String getValue() {
            return value;
        }
    }
}
