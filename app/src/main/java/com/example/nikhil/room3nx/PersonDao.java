package com.example.nikhil.room3nx;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by NIKHIL on 25-02-2018.
 */

@Dao
public interface PersonDao {

    // Adds a person to the database
    @Insert
    void insertAll(Person... people);

    // Removes a person from the database
    @Delete
    void delete(Person person);

    // Gets all people in the database
    @Query("SELECT * FROM person")
    List<Person> getAllPeople();

    // Gets all people in the database with a favorite color
    @Query("SELECT * FROM person WHERE favoriteColor LIKE :color")
    List<Person> getAllPeopleWithFavoriteColor(String color);


}
