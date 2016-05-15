package com.example.jokeslib;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by User on 14/05/2016.
 */
public class JokeActivity extends AppCompatActivity {

    public static final String EXTRA_JOKE = "extra_joke";

    protected TextView mJoke;

    protected String mJokeExtra;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_joke);

        mJokeExtra = getIntent().getStringExtra(EXTRA_JOKE);

        mJoke = (TextView) findViewById(R.id.joke);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        if (mJokeExtra!=null){
            mJoke.setText(mJokeExtra);
        }
    }
}
