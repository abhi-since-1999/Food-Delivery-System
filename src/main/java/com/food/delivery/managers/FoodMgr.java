package com.food.delivery.managers;

import com.food.delivery.entities.Dishes;
import com.food.delivery.entities.Restaurant;

import java.util.HashMap;

public class FoodMgr {
    private FoodMgr(){};
    private static FoodMgr foodMgrInstance;

    public  static FoodMgr getFoodMgrInstance() {
        if(foodMgrInstance == null){
            foodMgrInstance = new FoodMgr();
        }
        return foodMgrInstance;
    }

    public void prepareFood(String orderId, String restaurantName, HashMap<Dishes, Integer> myOrder) throws InterruptedException {
        Restaurant restaurant = RestaurantMgr.getRestaurantMgrInstance().getRestaurant(restaurantName);
        System.out.println("Asked restaurant to prepare food");
        Thread.sleep(2000);
        restaurant.prepareFood(orderId, myOrder);
    }
}
