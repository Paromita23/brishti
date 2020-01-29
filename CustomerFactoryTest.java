package com.hexaware.MLP178.model;

import com.hexaware.MLP178.persistence.CustomerDAO;
import com.hexaware.MLP178.factory.CustomerFactory;
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
 * Test class for Customer.
 */
@RunWith(JMockit.class)
public class CustomerFactoryTest {
    /**
   * tests that empty employee list is handled correctly.
   * @param dao mocking the dao class
   */

  @Test
  public final void testListAllEmpty(@Mocked final CustomerDAO dao) {
    new Expectations() {
      {
        dao.show(); result = new ArrayList<Customer>();
      }
    };
    new MockUp<CustomerFactory>() {
      @Mock
      CustomerDAO dao() {
        return dao;
      }
    };
    Customer[] c = CustomerFactory.showCustomer();
    assertEquals(0, c.length);
  }
 /**
  * Tests that a list with some employees is handled correctly.
  * @param dao mocking the dao class
  */

  @Test
  public final void testListAllSome(@Mocked final CustomerDAO dao) {
    final Customer c2 = new Customer(1, "XYZ", "XYZ@GMAIL.COM",  "9999977654", "Chennai", "512", "xyz");
    final Customer c3 = new Customer(12, "WEZ", "WEZ@GMAIL.COM",  "9900077654", "Coimbatore", "502", "wez");
    final ArrayList<Customer> cus = new ArrayList<Customer>();
    new Expectations() {
      {
        cus.add(c2);
        cus.add(c3);
        dao.show(); result = cus;
      }
    };
    new MockUp<CustomerFactory>() {
      @Mock
      CustomerDAO dao() {
        return dao;
      }
    };
    Customer[] cus1 = CustomerFactory.showCustomer();
    assertEquals(2, cus1.length);
    assertEquals(1, cus1[0].getCustomerId());
    assertEquals(12, cus1[1].getCustomerId());
    assertEquals("XYZ", cus1[0].getCustomerName());
    assertEquals("WEZ", cus1[1].getCustomerName());
    assertEquals("XYZ@GMAIL.COM", cus1[0].getCustomerEmail());
    assertEquals("9900077654", cus1[1].getCustomerNumber());
    assertEquals("Chennai", cus1[0].getCustomerAddress());
    assertEquals("Coimbatore", cus1[1].getCustomerAddress());
    assertEquals("512", cus1[0].getCustomerPassword());
    assertEquals("502", cus1[1].getCustomerPassword());
    assertEquals("xyz", cus1[0].getCustomerUsername());
    assertEquals("wez", cus1[1].getCustomerUsername());
  }
}
