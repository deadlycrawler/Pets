package com.example.android.pets.data;


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


    private static final String SQL_create_entries = "CREATE TABLE " + TABLE_NAME +
            "(" +
            COLUMN_NAME_id + "INTEGER" + ", " +
            COLUMN_PET_NAME + "TEXT" + ", " +
            COLUMN_PET_BREED + "TEXT" + ", " +
            COLUMN_PET_GENDER + "INTEGER" + ", " +
            COLUMN_PET_WEIGHT + "INTEGER" + ")";


}
