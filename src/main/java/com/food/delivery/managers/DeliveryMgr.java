package com.food.delivery.managers;

import com.food.delivery.entities.DeliveryMetaData;
import com.food.delivery.entities.DeliveryPartner;
import com.food.delivery.strategies.DeliveryPartnerMatchingStrategy;

public class DeliveryMgr {
    private DeliveryMgr(){};
    private static DeliveryMgr deliveryMgrInstance;

    public static DeliveryMgr getDeliveryMgrInstance() {
        if(deliveryMgrInstance == null){
            deliveryMgrInstance = new DeliveryMgr();
        }
        return deliveryMgrInstance;
    }

    public void manageDelivery(String orderId, DeliveryMetaData deliveryMetaData) throws InterruptedException {
        StrategyMgr strategyMgr = StrategyMgr.getStrategyMgrInstance();
        DeliveryPartnerMatchingStrategy deliveryPartnerMatchingStrategy = strategyMgr.determineDeliveryPartnerMatchingStrategy(deliveryMetaData);
        DeliveryPartner assignedDeliveryPartner = deliveryPartnerMatchingStrategy.matchDeliveryPartner(deliveryMetaData);
        Thread.sleep(3000);
        System.out.println(assignedDeliveryPartner.getName() + " is your delivery partner.");
        Thread.sleep(10000);
        System.out.println("Shambhu has picked up your order");
        Thread.sleep(5000);
        System.out.println("Order delivered");
    }
}
