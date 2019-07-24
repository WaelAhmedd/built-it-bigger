package com.udacity.gradle.builditbigger.backend;

import com.example.JokeTelling;

/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {
        return (String) JokeTelling.getRandomJoke();
    }

    public void setData(String data) {
        myData = data;
    }
}