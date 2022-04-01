package com.example.rise.db;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;


@Dao
public interface PlannedDao {

    @Insert
    void insert(Planned planned);

    @Update
    void update(Planned planned);

    @Delete
    void delete(Planned planned);

    @Query("DELETE FROM planned")
    void deleteAllPlanned();

    @Query("SELECT * FROM planned")
    LiveData<List<Planned>> getAllPlanned();
}
