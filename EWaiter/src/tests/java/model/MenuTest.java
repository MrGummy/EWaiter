package model;

import com.model.Category;
import com.model.Menu;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.*;

public class MenuTest {
    /**
     * Тест создания Menu.
     */
    @Test
    public void testCreateMenu() {
        System.out.println("test Menu createMenu");
        ArrayList<Category> categories = new ArrayList<Category>();
        Date date = new Date(4, 11, 2018);
        Menu menu = new Menu(1, "name", "description", categories, date, "/photo/");
        assertEquals(menu.getId(), 1);
        assertEquals(menu.getName(), "name");
        assertEquals(menu.getDescription(), "description");
        assertEquals(menu.getCategories(), categories);
        assertEquals(menu.getDate(), date);
        assertEquals(menu.getPhoto(), "/photo/");

        menu.setId(2);
        assertEquals(menu.getId(), 2);

        menu.setName("name2");
        assertEquals(menu.getName(), "name2");

        menu.setDescription("description2");
        assertEquals(menu.getDescription(), "description2");

        ArrayList<Category> categories2 = new ArrayList<Category>();
        menu.setCategories(categories2);
        assertEquals(menu.getCategories(), categories2);

        Date date2 = new Date(16, 7, 2018);
        menu.setDate(date2);
        assertEquals(menu.getDate(), date2);

        menu.setPhoto("/photo2/");
        assertEquals(menu.getPhoto(), "/photo2/");
    }

    /**
     * Тест проверки равенства/неравенства Menu.
     */
    @Test
    public void testEquals() {
        ArrayList<Category> categories = new ArrayList<Category>();
        ArrayList<Category> categories2 = new ArrayList<Category>();
        Date date = new Date(4, 11, 2018);
        Date date2 = new Date(16, 7, 2018);
        System.out.println("test Menu equals");
        Menu menu1 = new Menu(1, "name", "description", categories, date, "/photo/");
        Menu menu2 = new Menu(1, "name", "description", categories, date, "/photo/");
        Menu menu3 = new Menu(2, "name2", "description2", categories2, date2, "/photo2/");

        assertTrue( menu1.equals(menu2)   );
        assertFalse(menu1.equals(menu3)   );
    }
}
