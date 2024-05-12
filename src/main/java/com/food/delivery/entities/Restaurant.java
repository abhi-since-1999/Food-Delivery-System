package com.food.delivery.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;

@AllArgsConstructor
@Getter
public class Restaurant {
    private String name;
    private String restaurantLoc;
    private Menu menu;

    public void prepareFood(String orderId, HashMap<Dishes, Integer> receivedOrder) throws InterruptedException {
        System.out.println("Restaurant accepted the order and starting to prepare it");
        Thread.sleep(5000);
        System.out.println("Order prepared.");
    }

    public void addMenu(Menu menu){
        this.menu = menu;
    }

}
