package co.devfoundry.notification;

import co.devfoundry.order.Order;

public class TextMessage implements Observer{

    public void update(Order order){
        System.out.println("SMS - Zamówienie nr: " + order.getOrderNumber() + " zmieniono status na: " + order.getOrderStatus());

    }
}
