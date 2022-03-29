package com.example.rise.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Planned.class, Unplanned.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract PlannedDao plannedDao();
    public abstract UnplannedDao unplannedDao();

    private static AppDatabase INSTANCE;

    public static AppDatabase getDbInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, "DB_NAME").allowMainThreadQueries().build();


        }
        return INSTANCE;

    }
}
