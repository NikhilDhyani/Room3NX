package com.example.nikhil.room3nx;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by NIKHIL on 25-02-2018.
 */


    @Database(entities = {Person.class /*, AnotherEntityType.class, AThirdEntityType.class */}, version = 1)
    public abstract class AppDatabase extends RoomDatabase {
        public abstract PersonDao getPersonDao();
    }

