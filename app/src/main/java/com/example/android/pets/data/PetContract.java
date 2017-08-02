package com.example.android.pets.data;


import android.net.Uri;
import android.provider.BaseColumns;

import static com.example.android.pets.data.PetContract.PetEntry.COLUMN_PET_BREED;
import static com.example.android.pets.data.PetContract.PetEntry.COLUMN_PET_GENDER;
import static com.example.android.pets.data.PetContract.PetEntry.COLUMN_NAME_id;
import static com.example.android.pets.data.PetContract.PetEntry.COLUMN_PET_NAME;
import static com.example.android.pets.data.PetContract.PetEntry.COLUMN_PET_WEIGHT;
import static com.example.android.pets.data.PetContract.PetEntry.TABLE_NAME;

public final class PetContract {
    private PetContract() {
    }

    public static final class PetEntry implements BaseColumns {
        //content URI to access the petsProvider
        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_PETS);

        //table and column names as constraints
        public static final String TABLE_NAME = "pets";

        public static final String COLUMN_NAME_id = BaseColumns._ID;
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_GENDER= "gender";
        public static final String COLUMN_PET_WEIGHT = "weight";


        //Gender options below
        public static final int GENDER_MALE = 0;
        public static final int GENDER_FEMALE = 1;
        public static final int GENDER_UNKNOWN = 2;
    }
    //content constants
    public static final String CONTENT_AUTHORITY ="com.example.android.pets";
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    public static final String PATH_PETS = PetEntry.TABLE_NAME;


    private static final String SQL_create_entries = "CREATE TABLE " + TABLE_NAME +
            "(" +
            COLUMN_NAME_id + " INTEGER PRIMARY KEY AUTOINCREMENT" + ", " +
            COLUMN_PET_NAME + " TEXT NOT NULL" + ", " +
            COLUMN_PET_BREED + " TEXT" + ", " +
            COLUMN_PET_GENDER + " INTEGER NOT NULL" + ", " +
            COLUMN_PET_WEIGHT + " INTEGER NOT NULL DEFAULT 0" + ");";

    public static String getSQL_create_entries() {
        return SQL_create_entries;
    }


}
