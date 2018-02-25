package com.example.nikhil.room3nx;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by NIKHIL on 25-02-2018.
 */

@Entity
public class Person {

    @PrimaryKey(autoGenerate = true)
    int id;
    int age;
    String favoriteColor;



    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getFavoriteColor() {

        return favoriteColor;

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }
}
