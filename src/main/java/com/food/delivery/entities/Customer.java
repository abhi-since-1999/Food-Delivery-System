package com.food.delivery.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;

@AllArgsConstructor
@Getter
public class Customer {
    private String name;
    private String customerLoc;
    private int rating;
//    private Restaurant restaurant;
//    private HashMap<Dishes, Integer> myOrder;

    public Restaurant selectRestaurant(List<Restaurant> restaurantList){
        return restaurantList.getFirst();
    }
//    public HashMap<Dishes, Integer> addOrder(Restaurant selectedRestaurant, Menu menu){
//        return myOrder;
//    }
}
