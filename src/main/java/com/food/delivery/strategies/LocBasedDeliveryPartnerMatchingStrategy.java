package com.food.delivery.strategies;

import com.food.delivery.entities.DeliveryMetaData;
import com.food.delivery.entities.DeliveryPartner;

public class LocBasedDeliveryPartnerMatchingStrategy implements DeliveryPartnerMatchingStrategy{

    @Override
    public DeliveryPartner matchDeliveryPartner(DeliveryMetaData deliveryMetaData) {
        return new DeliveryPartner("Shambhu", true, 5);
    }
}
