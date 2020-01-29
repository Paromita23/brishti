package com.hexaware.MLP178.factory;
import com.hexaware.MLP178.model.Customer;

import com.hexaware.MLP178.persistence.CustomerDAO;
import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotEquals;
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

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
   * tests for constructor.
   */
  @Test
  public final void testConstructor() {
    assertNotNull(new CustomerFactory());
    assertNotNull(CustomerFactory.dao());
  }
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
  /**
   * Tests that a list with some employees is handled correctly.
   * @param dao mocking the dao class
   */
  @Test
  public final void testFindByCustomerId(@Mocked final CustomerDAO dao) {
    final Customer m2 = new Customer(1, "Aman", "Password", "abc@xyz.com", "6207701328", "1997-03-18", "Chennai");
    final Customer m3 = new Customer(2, "Raj", "Password1", "abc@xyz.com1", "6207701329", "1997-03-19", "Cbe");
    new Expectations() {
      {
        dao.findByCustomerName("Aman"); result = m2;
        dao.findByCustomerName("Raj"); result = m3;
        dao.findByCustomerName("Arjun"); result = null;
      }
    };
    new MockUp<CustomerFactory>() {
      @Mock
      CustomerDAO dao() {
        return dao;
      }
    };
    Customer customer1 = CustomerFactory.findByCustomerName("Aman");
    assertNotNull(customer1);
    Customer customer2 = CustomerFactory.findByCustomerName("Raj");
    assertNotNull(customer2);
    Customer customer3 = CustomerFactory.findByCustomerName("Arjun");
    assertNull(customer3);
  }
  /**
   * Tests that a list Employ Search by customer id.
   * @param dao mocking the dao class.
   */
  @Test
  public final void testListByCustomerId(@Mocked final CustomerDAO dao) {
    final Customer c2 = new Customer(1, "XYZ", "XYZ@GMAIL.COM",  "9999977654", "Chennai", "512", "xyz");
    final Customer c3 = new Customer(12, "WEZ", "WEZ@GMAIL.COM",  "9900077654", "Coimbatore", "502", "wez");
    new Expectations() {
      {
        dao.findByCustomerName("XYZ"); result = c2;
        dao.findByCustomerName("WEZ"); result = c3;
      }
    };
    new MockUp<CustomerFactory>() {
      @Mock
      CustomerDAO dao() {
        return dao;
      }
    };
    Customer cus1 = CustomerFactory.findByCustomerName("XYZ");
    Customer cus2 = CustomerFactory.findByCustomerName("WEZ");
    assertEquals(1, cus1.getCustomerId());
    assertEquals(12, cus2.getCustomerId());
  }
  /**
   * Tests that a list Employ Search by customer id.
   * @param dao mocking the dao class.
   */
  @Test
  public final void testValidateCustomer(@Mocked final CustomerDAO dao) {
    new Expectations() {
      {
        dao.authenticate("XYZ", "512"); result = 1;
        dao.authenticate("WEZ", "502"); result = 1;
        dao.authenticate("TEZ", "123"); result = 0;
      }
    };
    new MockUp<CustomerFactory>() {
      @Mock
      CustomerDAO dao() {
        return dao;
      }
    };
    assertEquals(1, CustomerFactory.validateCustomer("XYZ", "512"));
    assertEquals(1, CustomerFactory.validateCustomer("WEZ", "502"));
    assertEquals(0, CustomerFactory.validateCustomer("TEZ", "123"));
  }
}
