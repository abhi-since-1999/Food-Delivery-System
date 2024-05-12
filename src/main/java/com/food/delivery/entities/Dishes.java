package com.food.delivery.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Dishes {
    private String dishName;
    private int rating;
    private double price;

}
