package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Created by User on 14/05/2016.
 */
public class JokeTest extends AndroidTestCase {

    String mJoke = null;

    public void testJokeResponse() throws InterruptedException {

        ApiAsyncTask task = new ApiAsyncTask();

        task.execute(getContext());
        try {
            mJoke = task.get(10, TimeUnit.SECONDS);
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }

        assertNotNull("Joke cannot be null", mJoke);
    }
}
