package com.hexaware.MLP178.factory;
import com.hexaware.MLP178.persistence.FreegiftDAO;
import com.hexaware.MLP178.model.Freegift;
import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotEquals;
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;
//import static org.junit.Assert.assertNull;
//import com.hexaware.MLP178.model.MenuCat;

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
public class FreegiftFactoryTest {
    /**
   * tests for constructor.
   */
  @Test
  public final void testConstructor() {
    assertNotNull(new FreegiftFactory());
    assertNotNull(FreegiftFactory.dao());
  }
     /**
   * Tests that a list with MenuHandled is handled correctly.
   * @param dao mocking the dao class
   */
  @Test
  public final void testListAllEmpty(@Mocked final FreegiftDAO dao) {
    new Expectations() {
      {
        dao.show(); result = new ArrayList<Freegift>();
      }
    };
    new MockUp<FreegiftFactory>() {
      @Mock
      FreegiftDAO dao() {
        return dao;
      }
    };
    Freegift[] m = FreegiftFactory.showgft();
    assertEquals(0, m.length);
  }

/**
 * tests that empty employee list is handled correctly.
 * @param dao mocking the dao class
 */
  @Test
  public final void testListAllSome(@Mocked final FreegiftDAO dao) {
    final Freegift m2 = new Freegift(1200,1100,0);
    final Freegift m3 = new Freegift(1201,1101,1);
    final ArrayList<Freegift> mn = new ArrayList<Freegift>();
    new Expectations() {
      {
        mn.add(m2);
        mn.add(m3);
        dao.show(); result = mn;
      }
    };
    new MockUp<FreegiftFactory>() {
      @Mock
      FreegiftDAO dao() {
        return dao;
      }
    };
    Freegift[] mn1 = FreegiftFactory.showgft();
    assertEquals(2, mn1.length);
    assertEquals(1200, mn1[0].getCustId());
    assertEquals(1201, mn1[1].getCustId());
    assertEquals(1100, mn1[0].getVenId());
    assertEquals(1101, mn1[1].getVenId());
    assertEquals(0, mn1[0].getGiftStat());
    assertEquals(1, mn1[1].getGiftStat());
  }
}

