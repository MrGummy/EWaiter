package com.model;

import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

public class Order {
    private int id;
    private int tableId;
    private int waiterId;
    private Timestamp dateTime;
    private List<Dish> dishes;

    public Order() {
    }

    public Order(int id, int tableId, int waiterId, Timestamp dateTime, List<Dish> dishes) {
        this.id = id;
        this.tableId = tableId;
        this.waiterId = waiterId;
        this.dateTime = dateTime;
        this.dishes = dishes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTableId() {
        return tableId;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public int getWaiterId() {
        return waiterId;
    }

    public void setWaiterId(int waiterId) {
        this.waiterId = waiterId;
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
                tableId == order.tableId &&
                waiterId == order.waiterId &&
                Objects.equals(dateTime, order.dateTime) &&
                Objects.equals(dishes, order.dishes);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, tableId, waiterId, dateTime, dishes);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", tableId=" + tableId +
                ", waiterId=" + waiterId +
                ", dateTime=" + dateTime +
                ", dishes=" + dishes +
                '}';
    }
}