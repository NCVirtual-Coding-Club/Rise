package com.example.rise.db;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "planned")
public class Planned {

    @PrimaryKey(autoGenerate = true)
    private int id;

    private String date;

    private String startTime;

    private String endTime;

    private String eventName;

    public Planned(String date, String startTime, String endTime, String eventName) {
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.eventName = eventName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public String getEventName() {
        return eventName;
    }

    /*
    @PrimaryKey(autoGenerate = true)
    public int uid;

    @ColumnInfo(name = "date")
    public String date;

    @ColumnInfo(name = "start_time")
    public String startTime;

    @ColumnInfo(name = "end_time")
    public String endTime;

    @ColumnInfo(name = "event_name")
    public String eventName;

     */
}