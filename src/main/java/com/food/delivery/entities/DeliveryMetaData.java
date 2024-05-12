package com.food.delivery.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class DeliveryMetaData {
    private String customerLoc;
    private String restaurantLoc;
    private String orderId;

}
