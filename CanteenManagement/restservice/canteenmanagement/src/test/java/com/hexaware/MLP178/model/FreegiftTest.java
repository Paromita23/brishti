package com.hexaware.MLP178.model;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;
import org.junit.Before;

    /**
   * test for Vendors.
   */
public class FreegiftTest {
    /**
   * test for Vendors.
   */
  @Before
  public void initInput() {

  }
   /**
   * test for Vendors.
   */
  @Test
  public final void testToString() {
    Freegift customer1 = new Freegift(1200,1100,0);
    String result = String.format("%10s %10s %10s",
        customer1.getCustId(), customer1.getVenId(), customer1.getGiftStat());
        assertEquals(result,customer1.toString());
  }
  /**
   * Tests the equals/hashcode methods of the Vendors class.
   */
  @Test
  public final void testEquals() {
    Freegift p = new Freegift();
    Freegift customer3 = null;
    Freegift customer1 = new Freegift(1200,1100,0);
    Freegift customer2 = new Freegift(1200,1100,0);
    assertTrue(customer1.equals(customer2));
    assertFalse(customer1.equals(customer3));
    Customer o = null;
    assertFalse(customer1.equals(o));
    Vendor v = new Vendor();
    assertFalse(customer1.equals(v));
    assertFalse(customer1.equals(p));
    assertEquals(customer1.hashCode(), customer1.hashCode());
  }
  /**
   * Tests the equals/hashcode methods of the Vendors class.
   */
  @Test
   public final void testFreegift() {
    Freegift m = new Freegift();
    assertNotNull(m);
    Freegift customer = new Freegift(1200,1100,0);
    assertEquals(1200, customer.getCustId());
    assertEquals(1100, customer.getVenId());
    assertEquals(0, customer.getGiftStat());


    m.setCustId(1200);
    m.setVenId(1100);
    m.setGiftStat(0);
    

    assertEquals(1200, m.getCustId());
    assertEquals(1100, m.getVenId());
    assertEquals(0, m.getGiftStat());
  }
}
