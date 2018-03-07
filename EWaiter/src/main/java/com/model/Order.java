package com.model;

import java.security.Timestamp;
import java.util.List;
import java.util.Objects;

public class Order {
    private int id;
    private Table table;
    private Waiter waiter;
    private Timestamp dateTime;
    private List<Dish> dishes;

    public Order() {
    }

    public Order(int id, Table table, Waiter waiter, Timestamp dateTime, List<Dish> dishes) {
        this.id = id;
        this.table = table;
        this.waiter = waiter;
        this.dateTime = dateTime;
        this.dishes = dishes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public Waiter getWaiter() {
        return waiter;
    }

    public void setWaiter(Waiter waiter) {
        this.waiter = waiter;
    }

    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id &&
                Objects.equals(table, order.table) &&
                Objects.equals(waiter, order.waiter) &&
                Objects.equals(dateTime, order.dateTime) &&
                Objects.equals(dishes, order.dishes);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, table, waiter, dateTime, dishes);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", table=" + table +
                ", waiter=" + waiter +
                ", dateTime=" + dateTime +
                ", dishes=" + dishes +
                '}';
    }
}
