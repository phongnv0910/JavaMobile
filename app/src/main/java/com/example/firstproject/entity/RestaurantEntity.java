package com.example.firstproject.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Restaurant_table")
public class RestaurantEntity {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "Restaurant_ID",index = true)
    private int id;

    @NonNull
    @ColumnInfo(name = "Code")
    private String code;

    @NonNull
    @ColumnInfo(name = "Restaurant_Name")
    private String name;

    @NonNull
    @ColumnInfo(name = "Description")
    private String description;

    @NonNull
    @ColumnInfo(name = "Phone")
    private String phone;


    @NonNull
    @ColumnInfo(name = "Dishes")
    private int dishes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NonNull
    public String getCode() {
        return code;
    }

    public void setCode(@NonNull String code) {
        this.code = code;
    }

    @NonNull
    public String getPhone() {
        return phone;
    }

    public void setPhone(@NonNull String phone) {
        this.phone = phone;
    }

    public int getDishes() {
        return dishes;
    }

    public void setDishes(int dishes) {
        this.dishes = dishes;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    @NonNull
    public String getDescription() {
        return description;
    }

    public void setDescription(@NonNull String description) {
        this.description = description;
    }
}
