package model;

import com.model.Company;
import com.model.Menu;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.*;

public class CompanyTest {
    /**
     * Тест создания Company.
     */
    @Test
    public void testCreateCompany() {
        System.out.println("test Company createCompany");
        ArrayList<Menu> menus = new ArrayList<Menu>();
        Date date = new Date(12, 6, 2018);
        Company company = new Company(1, "name", "login", "password", menus, date);
        assertEquals(company.getId(), 1);
        assertEquals(company.getName(), "name");
        assertEquals(company.getLogin(), "login");
        assertEquals(company.getPassword(), "password");
        assertEquals(company.getMenus(), menus);
        assertEquals(company.getRegDate(), date);

        company.setId(2);
        assertEquals(company.getId(), 2);

        company.setName("name2");
        assertEquals(company.getName(), "name2");

        company.setLogin("login2");
        assertEquals(company.getLogin(), "login2");

        company.setPassword("password2");
        assertEquals(company.getPassword(), "password2");

        ArrayList<Menu> menus2 = new ArrayList<Menu>();
        company.setMenus(menus2);
        assertEquals(company.getMenus(), menus2);

        Date date2 = new Date(4, 5, 2018);
        company.setRegDate(date2);
        assertEquals(company.getRegDate(), date2);
    }

    /**
     * Тест проверки равенства/неравенства Company.
     */
    @Test
    public void testEquals() {
        ArrayList<Menu> menus = new ArrayList<Menu>();
        ArrayList<Menu> menus2 = new ArrayList<Menu>();
        Date date = new Date(12, 6, 2018);
        Date date2 = new Date(4, 5, 2018);
        System.out.println("test Company equals");
        Company company1 = new Company(1, "name", "login", "password", menus, date);
        Company company2 = new Company(1, "name", "login", "password", menus, date);
        Company company3 = new Company(2, "name2", "login2", "password2", menus2, date2);

        assertTrue( company1.equals(company2)   );
        assertFalse(company1.equals(company3)   );
    }
}
