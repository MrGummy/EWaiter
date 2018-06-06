package com.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class DishPhotoTest {
    /**
     * Тест создания DishPhoto.
     */
    @Test
    public void testCreateDishPhoto() {
        System.out.println("test DishPhoto createDishPhoto");
        DishPhoto dishPhoto = new DishPhoto(1, "url", 1);
        assertEquals(dishPhoto.getId(), 1);
        assertEquals(dishPhoto.getUrl(), "url");
        assertEquals(dishPhoto.getDishId(), 1);

        dishPhoto.setId(2);
        assertEquals(dishPhoto.getId(), 2);

        dishPhoto.setUrl("url2");
        assertEquals(dishPhoto.getUrl(), "url2");

        dishPhoto.setDishId(2);
        assertEquals(dishPhoto.getDishId(), 2);
    }

    /**
     * Тест проверки равенства/неравенства DishPhoto.
     */
    @Test
    public void testEquals() {
        System.out.println("test DishPhoto equals");
        DishPhoto dishPhoto1 = new DishPhoto(1, "url",1);
        DishPhoto dishPhoto2 = new DishPhoto(1, "url", 1);
        DishPhoto dishPhoto3 = new DishPhoto(2, "url2", 2);

        assertTrue( dishPhoto1.equals(dishPhoto2)   );
        assertFalse(dishPhoto1.equals(dishPhoto3)   );
    }
}
