package com.example.rise.db;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface UnplannedDao {
    @Insert
    void insert(Unplanned unplanned);

    @Update
    void update(Unplanned unplanned);

    @Delete
    void delete(Unplanned unplanned);

    @Query("DELETE FROM unplanned")
    void deleteAllUnplanned();

    @Query("SELECT * FROM unplanned")
    LiveData<List<Unplanned>> getAllUnplanned();
}
