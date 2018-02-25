package com.example.nikhil.room3nx;

import android.arch.persistence.room.Room;
import android.nfc.Tag;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private AppDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "populus-database").build();


        new DatabaseAsync().execute();
    }

    private class DatabaseAsync extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            //Perform pre-adding operation here.
        }

        @Override
        protected Void doInBackground(Void... voids) {
            //Let's add some dummy data to the database.
            //Let's add some dummy data
            Person person = new Person();
           // person.setId(1);
            //person.setAge(2);
            person.setFavoriteColor("Red");


            db.getPersonDao().insertAll(person);


            List<Person> everyone = db.getPersonDao().getAllPeople();
            String one = everyone.get(0).getFavoriteColor();
            int two = everyone.get(0).getId();

            String s=String.valueOf(two);//Now it will return "10"
            Log.d("FavouriteColor",one);
            Log.d("Number",s);


            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);

            //To after addition operation here.
        }
    }






}