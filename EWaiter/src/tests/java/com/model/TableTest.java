package com.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class TableTest {
    /**
     * Тест создания Table.
     */
    @Test
    public void testCreateTable() {
        System.out.println("test Table createTable");
        Table table = new Table(1, "scheme");
        assertEquals(table.getId(), 1);
        assertEquals(table.getScheme(), "scheme");

        table.setId(2);
        assertEquals(table.getId(), 2);

        table.setScheme("scheme2");
        assertEquals(table.getScheme(), "scheme2");
    }

    /**
     * Тест проверки равенства/неравенства Table.
     */
    @Test
    public void testEquals() {
        System.out.println("test Table equals");
        Table table1 = new Table(1, "scheme");
        Table table2 = new Table(1, "scheme");
        Table table3 = new Table(2, "scheme2");

        assertTrue( table1.equals(table2)   );
        assertFalse(table1.equals(table3)   );
    }
}
