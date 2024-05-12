package com.food.delivery.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;

@AllArgsConstructor
@Getter
public class Order {
    Customer customer;
    Restaurant restaurant;
    HashMap<Dishes, Integer> dishesOrdered;
    double price;

}
