package com.example.finalproject;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;

public class deafdumb implements Serializable {
    public String name ;
    public  int image ;
    public int imsge1 ;
    public String ratings;


    public deafdumb(String name, int image, int imsge1, String ratings) {
        this.name = name;
        this.image = image;
        this.imsge1 = imsge1;
        this.ratings = ratings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getImsge1() {
        return imsge1;
    }

    public void setImsge1(int imsge1) {
        this.imsge1 = imsge1;
    }

    public String getRatings() {
        return ratings;
    }

    public void setRatings(String ratings) {
        this.ratings = ratings;
    }
}

