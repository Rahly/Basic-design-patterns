package co.devfoundry.order;

import co.devfoundry.notification.Observer;

import java.util.HashSet;
import java.util.Set;

public class Order implements Observable {

    private Long orderNumber;
    private OrderStatus orderStatus;
    private Set<Observer> registeredObserver = new HashSet<Observer>();

    public Order(Long orderNumber, OrderStatus orderStatus) {
        this.orderNumber = orderNumber;
        this.orderStatus = orderStatus;
    }

    public void registerObserver(Observer observer) {
        registeredObserver.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        registeredObserver.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : registeredObserver) {
            observer.update(this);
        }
    }

    public void changeOrderStatus(OrderStatus orderStatus) {
        setOrderStatus(orderStatus);
        notifyObservers();
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    private void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }


}
