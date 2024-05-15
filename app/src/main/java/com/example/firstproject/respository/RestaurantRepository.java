package com.example.firstproject.respository;

import android.content.Context;

import com.example.firstproject.dao.RestaurantDAO;
import com.example.firstproject.dao.RestaurantRoomDatabase;
import com.example.firstproject.entity.RestaurantEntity;

import java.util.List;

public class RestaurantRepository {
    private RestaurantDAO restaurantDAO;
    public RestaurantRepository(Context context){
        RestaurantRoomDatabase restaurantRoomDatabase = RestaurantRoomDatabase.getInstance(context);
        restaurantDAO = restaurantRoomDatabase.restaurantDAO();

    }
    public void createRestaurant(RestaurantEntity restaurant){
        restaurantDAO.insert(restaurant);
    }
    public RestaurantEntity getRestaurant(int restaurantId){
        return restaurantDAO.select(restaurantId);
    }
    public  void updateRestaurant(RestaurantEntity restaurant){
        restaurantDAO.Update(restaurant);
    }
    public List<RestaurantEntity> getAllRestaurant(){
        return restaurantDAO.selectALl();
    }
}
