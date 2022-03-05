package com.example.rise.db;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

public interface UserDao {

    @Query("SELECT first_name FROM User")
    public List<UserDao> loadFullName();

    @Insert
    void insertUser(User... users);

    @Delete
    void delete(User user);


}
