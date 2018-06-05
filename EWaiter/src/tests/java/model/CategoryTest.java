package model;

import com.model.Category;
import com.model.Dish;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class CategoryTest {
    /**
     * Тест создания Category.
     */
    @Test
    public void testCreateCategory() {
        System.out.println("test Category createCategory");
        ArrayList<Dish> dishes = new ArrayList<Dish>();
        Category category = new Category(1, "name", "description", dishes, "/photo/");
        assertEquals(category.getId(), 1);
        assertEquals(category.getName(), "name");
        assertEquals(category.getDescription(), "description");
        assertEquals(category.getDishes(), dishes);
        assertEquals(category.getPhoto(), "/photo/");

        category.setId(2);
        assertEquals(category.getId(), 2);

        category.setName("name2");
        assertEquals(category.getName(), "name2");

        category.setDescription("description2");
        assertEquals(category.getDescription(), "description2");

        ArrayList<Dish> dishes2 = new ArrayList<Dish>();
        category.setDishes(dishes2);
        assertEquals(category.getDishes(), dishes2);

        category.setPhoto("/photo2/");
        assertEquals(category.getPhoto(), "/photo2/");
    }

    /**
     * Тест проверки равенства/неравенства Category.
     */
    @Test
    public void testEquals() {
        ArrayList<Dish> dishes = new ArrayList<Dish>();
        ArrayList<Dish> dishes2 = new ArrayList<Dish>();
        System.out.println("test Category equals");
        Category category1 = new Category(1, "name", "description", dishes, "/photo/");
        Category category2 = new Category(1, "name", "description", dishes, "/photo/");
        Category category3 = new Category(2, "name2", "description2", dishes2, "/photo2/");

        assertTrue( category1.equals(category2)   );
        assertFalse(category1.equals(category3)   );
    }
}
