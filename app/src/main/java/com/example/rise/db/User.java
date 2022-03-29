package com.example.rise.db;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {
    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo(name = "first_name")
    public String firstName = "Jonathan";

    @ColumnInfo(name = "last_name")
    public String lastName = "Rogers";
}