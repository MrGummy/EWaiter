package com.model;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class WaiterTest {
    /**
     * Тест создания Waiter.
     */
    @Test
    public void testCreateWaiter() {
        System.out.println("test Waiter createWaiter");
        ArrayList<WaiterComment> comments = new ArrayList<WaiterComment>();
        Company company = new Company();
        Waiter waiter = new Waiter(1, company, "firstName", "lastName", "login", "password", "photo", comments);
        assertEquals(waiter.getId(), 1);
        assertEquals(waiter.getCompany(), company);
        assertEquals(waiter.getFirstName(), "firstName");
        assertEquals(waiter.getLastName(), "lastName");
        assertEquals(waiter.getLogin(), "login");
        assertEquals(waiter.getPassword(), "password");
        assertEquals(waiter.getPhoto(), "photo");
        assertEquals(waiter.getComments(), comments);

        waiter.setId(2);
        assertEquals(waiter.getId(), 2);

        Company company2 = new Company();
        waiter.setCompany(company2);
        assertEquals(waiter.getCompany(), company2);

        waiter.setFirstName("firstName2");
        assertEquals(waiter.getFirstName(), "firstName2");

        waiter.setLastName("lastName2");
        assertEquals(waiter.getLastName(), "lastName2");

        waiter.setLogin("login2");
        assertEquals(waiter.getLogin(), "login2");

        waiter.setPassword("password2");
        assertEquals(waiter.getPassword(), "password2");

        waiter.setPhoto("photo2");
        assertEquals(waiter.getPhoto(), "photo2");

        ArrayList<WaiterComment> comments2 = new ArrayList<WaiterComment>();
        waiter.setComments(comments2);
        assertEquals(waiter.getComments(), comments2);
    }

    /**
     * Тест проверки равенства/неравенства Waiter.
     */
    @Test
    public void testEquals() {
        Company company = new Company();
        Company company2 = new Company();
        ArrayList<WaiterComment> comments = new ArrayList<WaiterComment>();
        ArrayList<WaiterComment> comments2 = new ArrayList<WaiterComment>();
        System.out.println("test Waiter equals");
        Waiter waiter1 = new Waiter(1, company, "firstName", "lastName", "login", "password", "photo", comments);
        Waiter waiter2 = new Waiter(1, company, "firstName", "lastName", "login", "password", "photo", comments);
        Waiter waiter3 = new Waiter(2, company2, "firstName2", "lastName2", "login2", "password2", "photo2", comments2);

        assertTrue( waiter1.equals(waiter2)   );
        assertFalse(waiter1.equals(waiter3)   );
    }
}
