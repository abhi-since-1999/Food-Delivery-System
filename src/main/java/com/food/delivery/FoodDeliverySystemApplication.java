package com.food.delivery;

import com.food.delivery.entities.*;
import com.food.delivery.managers.OrderMgr;
import com.food.delivery.managers.RestaurantMgr;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FoodDeliverySystemApplication {

	public static void main(String[] args) throws InterruptedException {


		Customer customer = new Customer("Itachi","Nadiya is paar", 5);

		Dishes dish1 = new Dishes("Daal", 5, 50);
		Dishes dish2 = new Dishes("Bhaat", 5, 50);
		Dishes dish3 = new Dishes("Chokha", 5, 50);

		List<Dishes> availDishes = new ArrayList<>();
		availDishes.add(dish1);
		availDishes.add(dish2);
		availDishes.add(dish3);

		Menu menu = new Menu(availDishes);
		HashMap<Dishes, Integer> myOrder = new HashMap<>();
		myOrder.put(availDishes.getFirst(), 2);
		myOrder.put(availDishes.getLast(), 2);

		Restaurant restaurant1 = new Restaurant("Sukuna ka Dhaba", "Nadiya k paar", menu);

		RestaurantMgr restaurantMgr = RestaurantMgr.getRestaurantMgrInstance();
		restaurantMgr.addRestaurant("Sukuna ka Dhaba", restaurant1);
		OrderMgr orderMgr = OrderMgr.getOrderMgrInstance();
		Order order = new Order(customer, restaurantMgr.getRestaurant("Sukuna ka Dhaba"), myOrder, 150 );
		orderMgr.createOrder("1", order);
	}

}
