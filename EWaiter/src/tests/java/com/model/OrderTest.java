package com.model;

import org.junit.Test;

import java.sql.Timestamp;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class OrderTest {
    /**
     * Тест создания Order.
     */
    @Test
    public void testCreateOrder() {
        System.out.println("test Order createOrder");
        ArrayList<Dish> dishes = new ArrayList<Dish>();
        Timestamp dateTime = new Timestamp(2018, 4, 11, 4, 37, 43, 86);
        Order order = new Order(1, 1, 1, dateTime, dishes);
        assertEquals(order.getId(), 1);
        assertEquals(order.getTableId(), 1);
        assertEquals(order.getWaiterId(), 1);
        assertEquals(order.getDateTime(), dateTime);
        assertEquals(order.getDishes(), dishes);

        order.setId(2);
        assertEquals(order.getId(), 2);

        order.setTableId(2);
        assertEquals(order.getTableId(), 2);

        order.setWaiterId(2);
        assertEquals(order.getWaiterId(), 2);

        ArrayList<Dish> dishes2 = new ArrayList<Dish>();
        order.setDishes(dishes2);
        assertEquals(order.getDishes(), dishes2);

        Timestamp dateTime2 = new Timestamp(2018, 2, 5, 23, 53, 15, 34);
        order.setDateTime(dateTime2);
        assertEquals(order.getDateTime(), dateTime2);
    }

    /**
     * Тест проверки равенства/неравенства Order.
     */
    @Test
    public void testEquals() {
        ArrayList<Dish> dishes = new ArrayList<Dish>();
        ArrayList<Dish> dishes2 = new ArrayList<Dish>();
        Timestamp dateTime = new Timestamp(2018, 4, 11, 4, 37, 43, 86);
        Timestamp dateTime2 = new Timestamp(2018, 2, 5, 23, 53, 15, 34);
        System.out.println("test Order equals");
        Order order1 = new Order(1, 1, 1, dateTime, dishes);
        Order order2 = new Order(1, 1, 1, dateTime, dishes);
        Order order3 = new Order(2, 2, 2, dateTime2, dishes2);

        assertTrue( order1.equals(order2)   );
        assertFalse(order1.equals(order3)   );
    }
}
