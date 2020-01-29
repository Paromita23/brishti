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
public class CustomerTest {
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
    Customer customer1 = new Customer(1200, "MOHAN", "MOHAN101", "MOHANIPS@GMAIL.COM", "9704556474", "30,CHENNAI", "MOHAN12");
    String result = String.format("%10s %10s %10s %10s %10s %10s %10s",
        customer1.getCustomerId(), customer1.getCustomerName(), customer1.getCustomerUsername(), customer1.getCustomerEmail(),
        customer1.getCustomerNumber(), customer1.getCustomerAddress(),
        customer1.getCustomerPassword());
    assertEquals(result, customer1.toString());
  }
  /**
   * Tests the equals/hashcode methods of the Vendors class.
   */
  @Test
  public final void testEquals() {
    Customer p = new Customer();
    Customer customer3 = null;
    Customer customer1 = new Customer(1200, "MOHAN", "MOHANIPS@GMAIL.COM", "9704556474", "30,CHENNAI", "MOHAN12", "MOHAN101");
    Customer customer2 = new Customer(1200, "MOHAN", "MOHANIPS@GMAIL.COM", "9704556474", "30,CHENNAI", "MOHAN12", "MOHAN101");
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
   public final void testCustomer() {
    Customer m = new Customer();
    assertNotNull(m);
    Customer customer = new Customer(1200, "MOHAN", "MOHANIPS@GMAIL.COM", "9704556474", "30,CHENNAI", "MOHAN12", "MOHAN101");
    assertEquals(1200, customer.getCustomerId());
    assertEquals("MOHAN", customer.getCustomerName());
    assertEquals("MOHANIPS@GMAIL.COM", customer.getCustomerEmail());
    assertEquals("9704556474", customer.getCustomerNumber());
    assertEquals("30,CHENNAI", customer.getCustomerAddress());
    assertEquals("MOHAN12", customer.getCustomerPassword());
    assertEquals("MOHAN101", customer.getCustomerUsername());

    m.setCustomerId(1200);
    m.setCustomerName("MOHAN");
    m.setCustomerEmail("MOHANIPS@GMAIL.COM");
    m.setCustomerNumber("9704556474");
    m.setCustomerAddress("30,CHENNAI");
    m.setCustomerPassword("MOHAN12");
    m.setCustomerUsername("MOHAN101");

    assertEquals(1200, m.getCustomerId());
    assertEquals("MOHAN", m.getCustomerName());
    assertEquals("MOHANIPS@GMAIL.COM", m.getCustomerEmail());
    assertEquals("9704556474", m.getCustomerNumber());
    assertEquals("30,CHENNAI", m.getCustomerAddress());
    assertEquals("MOHAN12", m.getCustomerPassword());
    assertEquals("MOHAN101", m.getCustomerUsername());
  }
}
