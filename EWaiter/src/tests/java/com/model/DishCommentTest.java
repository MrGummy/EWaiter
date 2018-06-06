package com.model;

import org.junit.Test;

import java.sql.Timestamp;

import static org.junit.Assert.*;

public class DishCommentTest {
    /**
     * Тест создания DishComment.
     */
    @Test
    public void testCreateDishComment() {
        System.out.println("test DishComment createDishComment");
        Timestamp dateTime = new Timestamp(2018, 3, 23, 12, 35, 56, 23);
        DishComment dishComment = new DishComment(1, "comment", dateTime, 1);
        assertEquals(dishComment.getId(), 1);
        assertEquals(dishComment.getComment(), "comment");
        assertEquals(dishComment.getDateTime(), dateTime);
        assertEquals(dishComment.getDishId(), 1);

        dishComment.setId(2);
        assertEquals(dishComment.getId(), 2);

        dishComment.setComment("comment2");
        assertEquals(dishComment.getComment(), "comment2");

        Timestamp dateTime2 = new Timestamp(2018, 6, 14, 16, 2, 43, 11);
        dishComment.setDateTime(dateTime2);
        assertEquals(dishComment.getDateTime(), dateTime2);

        dishComment.setDishId(2);
        assertEquals(dishComment.getDishId(), 2);
    }

    /**
     * Тест проверки равенства/неравенства DishComment.
     */
    @Test
    public void testEquals() {
        Timestamp dateTime = new Timestamp(2018, 3, 23, 12, 35, 56, 23);
        Timestamp dateTime2 = new Timestamp(2018, 6, 14, 16, 2, 43, 11);
        System.out.println("test DishComment equals");
        DishComment dishComment1 = new DishComment(1, "comment", dateTime, 1);
        DishComment dishComment2 = new DishComment(1, "comment", dateTime, 1);
        DishComment dishComment3 = new DishComment(2, "comment2", dateTime2, 2);

        assertTrue( dishComment1.equals(dishComment2)   );
        assertFalse(dishComment1.equals(dishComment3)   );
    }
}
