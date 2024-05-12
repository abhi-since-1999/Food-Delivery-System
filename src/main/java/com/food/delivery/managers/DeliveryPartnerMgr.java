package com.food.delivery.managers;

import com.food.delivery.entities.DeliveryPartner;

import java.util.HashMap;

public class DeliveryPartnerMgr {
    private HashMap<String, DeliveryPartner> deliveryPartnerHashMap;
    private static DeliveryPartnerMgr deliveryPartnerMgrInstance;

    private DeliveryPartnerMgr(){};

    public static DeliveryPartnerMgr getDeliveryPartnerMgrInstance() {
        if (deliveryPartnerMgrInstance == null) {
            deliveryPartnerMgrInstance = new DeliveryPartnerMgr();
        }
        return deliveryPartnerMgrInstance;
    }
}
