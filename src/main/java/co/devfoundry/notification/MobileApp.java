package co.devfoundry.notification;

import co.devfoundry.order.Order;

public class MobileApp implements Observer{

    public void update(Order order){
        System.out.println("Aplikacja mobilna - Zamówienie nr: " + order.getOrderNumber() + " zmieniono status na: " + order.getOrderStatus());
    }
}
