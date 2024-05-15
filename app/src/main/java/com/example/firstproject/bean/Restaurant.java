package com.example.firstproject.bean;

import java.util.Date;

public class Restaurant {
    private String restaurantId;
    private String code;

    private String name;
    private String phone;
    private String descrption;
    private int dishes;


    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getDishes() {
        return dishes;
    }

    public void setDishes(int dishes) {
        this.dishes = dishes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrption() {
        return descrption;
    }

    public void setDescrption(String descrption) {
        this.descrption = descrption;
    }

    public Restaurant(String restaurantId, String code, String name, String phone, String descrption, int dishes) {
        this.restaurantId = restaurantId;
        this.code = code;
        this.name = name;
        this.phone = phone;
        this.descrption = descrption;
        this.dishes = dishes;
    }

    public Restaurant() {
    }
}
