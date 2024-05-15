package com.example.firstproject.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.firstproject.entity.RestaurantEntity;

import java.util.List;

@Dao
public interface RestaurantDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(RestaurantEntity restaurant);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(RestaurantEntity... restaurantEntities);

    @Update(onConflict = OnConflictStrategy.IGNORE)
    void Update(RestaurantEntity restaurant);

    @Query("SELECT * FROM RESTAURANT_TABLE B WHERE B.Restaurant_ID=:id")
    RestaurantEntity select(int id);

    @Query("SELECT * FROM RESTAURANT_TABLE B ORDER BY B.dishes asc")
    List<RestaurantEntity> selectALl();
}
