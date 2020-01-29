package com.hexaware.MLP178.model;
import com.hexaware.MLP178.persistence.MenuDAO;
import com.hexaware.MLP178.factory.MenuFactory;
import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotEquals;
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;
//import static org.junit.Assert.assertNotNull;
//import static org.junit.Assert.assertNull;

//import java.text.ParseException;
import org.junit.Test;
//import org.junit.Before;
import org.junit.runner.RunWith;

import mockit.Expectations;
import mockit.MockUp;
import mockit.Mocked;
import mockit.Mock;
import mockit.integration.junit4.JMockit;
import java.util.ArrayList;

/**
 * Test class for Menu.
 */
@RunWith(JMockit.class)
public class MenuFactoryTest {
    /**
   * Tests that a list with some employees is handled correctly.
   * @param dao mocking the dao class
   */

  @Test
  public final void testListAllSome(@Mocked final MenuDAO dao) {
    final Menu m2 = new Menu(101, MenuCat.VEG, "PODI DOSA", 1, 80, 105, "**");
    final Menu m3 = new Menu(102, MenuCat.NONVEG, "Biriyani", 1, 150, 110, "****");
    final ArrayList<Menu> mn = new ArrayList<Menu>();
    new Expectations() {
      {
        mn.add(m2);
        mn.add(m3);
        dao.show(); result = mn;
      }
    };
    new MockUp<MenuFactory>() {
      @Mock
      MenuDAO dao() {
        return dao;
      }
    };
    Menu[] mn1 = MenuFactory.showMenu();
    assertEquals(2, mn1.length);
    assertEquals(101, mn1[0].getMenuId());
    assertEquals(102, mn1[1].getMenuId());
    assertEquals(MenuCat.VEG, mn1[0].getMenuCat());
    assertEquals(MenuCat.NONVEG, mn1[1].getMenuCat());
    assertEquals("PODI DOSA", mn1[0].getMenuItem());
    assertEquals("Biriyani", mn1[1].getMenuItem());
    assertEquals(80, mn1[0].getMenuCost(), 0);
    assertEquals(150, mn1[1].getMenuCost(), 0);
  }
}
