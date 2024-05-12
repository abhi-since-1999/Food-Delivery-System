package com.food.delivery.managers;

import com.food.delivery.entities.DeliveryMetaData;
import com.food.delivery.entities.Order;

import java.util.HashMap;

public class OrderMgr {
    private OrderMgr(){};
    private HashMap<String, Order> orderHashMap;
    private DeliveryMgr deliveryMgr;
    private FoodMgr foodMgr;

    private static OrderMgr orderMgrInstance;

    public static OrderMgr getOrderMgrInstance() {
        if(orderMgrInstance == null){
            orderMgrInstance = new OrderMgr();
        }
        return orderMgrInstance;
    }
    private void manageDelivery(String orderId, Order order) throws InterruptedException {
        DeliveryMetaData deliveryMetaData = new DeliveryMetaData(order.getCustomer().getCustomerLoc(), order.getRestaurant().getRestaurantLoc(),orderId);
        DeliveryMgr deliveryMgr1 = DeliveryMgr.getDeliveryMgrInstance();
        System.out.println("Matching you with a delivery partner");
        deliveryMgr1.manageDelivery(orderId, deliveryMetaData);
    }
    private void manageFood(String orderId, Order order) throws InterruptedException {
        foodMgr = FoodMgr.getFoodMgrInstance();
        foodMgr.prepareFood(orderId, order.getRestaurant().getName(), order.getDishesOrdered());
    }
    public void createOrder(String orderId, Order order) throws InterruptedException {
//        manageFood(orderId, order);
//        manageDelivery(orderId, order);

        Thread foodThread = new Thread(() -> {
            try {
                manageFood(orderId, order);
            } catch (InterruptedException e) {
                // Handle interruption if needed
                e.printStackTrace();
            }
        });

        Thread deliveryThread = new Thread(() -> {
            try {
                manageDelivery(orderId, order);
            } catch (InterruptedException e) {
                // Handle interruption if needed
                e.printStackTrace();
            }
        });

        // Start both threads
        foodThread.start();
        deliveryThread.start();

        // Wait for both threads to finish
        foodThread.join();
        deliveryThread.join();

    }
    public Order getOrder(String orderID){
        return orderHashMap.get(orderID);
    }


}
