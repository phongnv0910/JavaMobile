package com.example.firstproject.dao;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.firstproject.entity.RestaurantEntity;

@Database(entities = {RestaurantEntity.class}, version = 1)
public abstract class RestaurantRoomDatabase extends RoomDatabase {
    public abstract RestaurantDAO restaurantDAO();
    private static RestaurantRoomDatabase INSTANCE = null;
    public  static RestaurantRoomDatabase getInstance(Context context){
        if(INSTANCE==null){
            synchronized (RestaurantRoomDatabase.class){
                INSTANCE = Room.databaseBuilder(context, RestaurantRoomDatabase.class,"RestaurantDB").fallbackToDestructiveMigration().allowMainThreadQueries().build();
            }
        }return  INSTANCE;
    }
}
