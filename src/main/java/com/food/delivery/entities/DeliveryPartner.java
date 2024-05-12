package com.food.delivery.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class DeliveryPartner {
    private String name;
    private boolean availability;
    private int rating;

    public void performDelivery(String orderId, DeliveryMetaData deliveryMetaData) throws InterruptedException {
        System.out.println("I'll pick up the order");
        Thread.sleep(5000);
        System.out.println("I've picked  up the order");
        Thread.sleep(10000);
        System.out.println("Delivered");
    }
}
