package com.example.rise.db;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Unplanned {
    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo(name = "due_date")
    public String dueDate;

    @ColumnInfo(name = "due_time")
    public String dueTime;

    @ColumnInfo(name = "duration")
    public String duration;

    @ColumnInfo(name = "task_name")
    public String taskName;
}