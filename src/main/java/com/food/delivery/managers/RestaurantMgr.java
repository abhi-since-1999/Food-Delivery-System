package com.food.delivery.managers;

import com.food.delivery.entities.Restaurant;

import java.util.HashMap;

public class RestaurantMgr {
    private RestaurantMgr(){};

    private static RestaurantMgr restaurantMgrInstance;
    private HashMap<String, Restaurant> restaurantHashMap;

    public static RestaurantMgr getRestaurantMgrInstance() {
        if(restaurantMgrInstance == null){
            restaurantMgrInstance = new RestaurantMgr();
        }
        return restaurantMgrInstance;
    }
    public void addRestaurant(String restaurantName, Restaurant restaurant){
        restaurantHashMap = new HashMap<>();
        restaurantHashMap.put(restaurantName, restaurant);
    }

    public Restaurant getRestaurant(String restaurantName){
        return restaurantHashMap.get(restaurantName);
    }

}
