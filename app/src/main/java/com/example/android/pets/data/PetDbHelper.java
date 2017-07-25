package com.example.android.pets.data;


import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import static android.R.attr.version;

public class PetDbHelper extends SQLiteOpenHelper{

    public static final String LOG_TAG = PetDbHelper.class.getSimpleName();
    private static final String DATABASE_NAME = "shelter.db";
    private static int DATABASE_VERSION =1;

    public PetDbHelper(Context context) {

        super(context,DATABASE_NAME,null,DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //create table was made in petContract, so im just using the same reference to allow for easier code refactor later
        String SQL_CREATE_PETS_TABLE = PetContract.getSQL_create_entries();

        try {
            db.execSQL(SQL_CREATE_PETS_TABLE);
        } catch (SQLException e) {
            Log.e(LOG_TAG,SQL_CREATE_PETS_TABLE,e);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //still at version 1 so nothing should need to be changed
    }
}
