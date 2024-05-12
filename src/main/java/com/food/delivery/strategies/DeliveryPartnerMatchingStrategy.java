package com.food.delivery.strategies;

import com.food.delivery.entities.DeliveryMetaData;
import com.food.delivery.entities.DeliveryPartner;

public interface DeliveryPartnerMatchingStrategy {
    DeliveryPartner matchDeliveryPartner(DeliveryMetaData deliveryMetaData);
}
