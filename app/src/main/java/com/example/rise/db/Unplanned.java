package com.example.rise.db;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "unplanned")
public class Unplanned {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String dueDate;

    private String dueTime;

    private String duration;

    private String taskName;

    public Unplanned(String dueDate, String dueTime, String duration, String taskName) {
        this.dueDate = dueDate;
        this.dueTime = dueTime;
        this.duration = duration;
        this.taskName = taskName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDueDate() {
        return dueDate;
    }

    public String getDueTime() {
        return dueTime;
    }

    public String getDuration() {
        return duration;
    }

    public String getTaskName() {
        return taskName;
    }

    /*
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

     */
}