package model;

import com.model.Dish;
import com.model.DishComment;
import com.model.DishPhoto;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.*;

public class DishTest {
    /**
     * Тест создания Dish.
     */
    @Test
    public void testCreateDish() {
        System.out.println("test Dish createDish");
        ArrayList<DishPhoto> photos = new ArrayList<DishPhoto>();
        ArrayList<DishComment> comments = new ArrayList<DishComment>();
        Date date = new Date(12, 6, 2018);
        Dish dish = new Dish(1, "name", "description", 180, 199, "cookTime", photos, comments);
        assertEquals(dish.getId(), 1);
        assertEquals(dish.getName(), "name");
        assertEquals(dish.getDescription(), "description");
        assertEquals(dish.getWeight(), 180);
        assertEquals(dish.getPrice(), 199);
        assertEquals(dish.getCookTime(), "cookTime");
        assertEquals(dish.getPhotos(), photos);
        assertEquals(dish.getComments(), comments);

        dish.setId(2);
        assertEquals(dish.getId(), 2);

        dish.setName("name2");
        assertEquals(dish.getName(), "name2");

        dish.setDescription("description2");
        assertEquals(dish.getDescription(), "description2");

        dish.setWeight(150);
        assertEquals(dish.getWeight(), 150);

        dish.setPrice(299);
        assertEquals(dish.getPrice(), 299);

        dish.setCookTime("cookTime2");
        assertEquals(dish.getCookTime(), "cookTime2");

        ArrayList<DishPhoto> photos2 = new ArrayList<DishPhoto>();
        dish.setPhotos(photos2);
        assertEquals(dish.getPhotos(), photos2);

        ArrayList<DishComment> comments2 = new ArrayList<DishComment>();
        dish.setComments(comments2);
        assertEquals(dish.getComments(), comments2);
    }

    /**
     * Тест проверки равенства/неравенства Dish.
     */
    @Test
    public void testEquals() {
        ArrayList<DishPhoto> photos = new ArrayList<DishPhoto>();
        ArrayList<DishPhoto> photos2 = new ArrayList<DishPhoto>();
        ArrayList<DishComment> comments = new ArrayList<DishComment>();
        ArrayList<DishComment> comments2 = new ArrayList<DishComment>();
        System.out.println("test Dish equals");
        Dish dish1 = new Dish(1, "name", "description", 180, 199, "cookTime", photos, comments);
        Dish dish2 = new Dish(1, "name", "description", 180, 199, "cookTime", photos, comments);
        Dish dish3 = new Dish(2, "name2", "description2", 150, 299, "cookTime2", photos2, comments2);

        assertTrue( dish1.equals(dish2)   );
        assertFalse(dish1.equals(dish3)   );
    }
}
