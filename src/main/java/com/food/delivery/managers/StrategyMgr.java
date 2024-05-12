package com.food.delivery.managers;

import com.food.delivery.entities.DeliveryMetaData;
import com.food.delivery.strategies.DeliveryPartnerMatchingStrategy;
import com.food.delivery.strategies.LocBasedDeliveryPartnerMatchingStrategy;

public class StrategyMgr {
    private StrategyMgr(){};
    private static StrategyMgr strategyMgrInstance;

    public  static StrategyMgr getStrategyMgrInstance(){
        if(strategyMgrInstance == null){
            strategyMgrInstance = new StrategyMgr();
        }
        return strategyMgrInstance;
    }

    public DeliveryPartnerMatchingStrategy determineDeliveryPartnerMatchingStrategy(DeliveryMetaData deliveryMetaData){
        return new LocBasedDeliveryPartnerMatchingStrategy();
    }
}
