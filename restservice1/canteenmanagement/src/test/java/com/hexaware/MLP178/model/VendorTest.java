package com.hexaware.MLP178.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

//import com.hexaware.MLP178.model.Menu;

// import com.hexaware.MLP175.persistence.MenuDAO;
// import com.hexaware.MLP175.factory.MenuFactory;
// import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
//import static org.junit.Assert.assertNull;


import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;

// import mockit.Expectations;
// import mockit.MockUp;
// import mockit.Mocked;
// import mockit.Mock;
import mockit.integration.junit4.JMockit;
import java.util.Date;

import java.text.SimpleDateFormat;
import java.text.ParseException;
// import java.util.ArrayList;
/**
 * Test class for Menu.
 */
@RunWith(JMockit.class)
public class VendorTest {
        /**
   * setup method.
   */
  @Before
  public void initInput() {

  }
  /**
   * Tests the toString() methods of the Vendor class.
   * @throws ParseException for date format validation.
   */
  @Test
  public final void testToString() throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String dt = new String("2020-03-18");
    Date odt = sdf.parse(dt);
    Vendor vendor1 = new Vendor(1100, "SUGUMARAN", "SUGUMARAN1100", "8870283988", "SUGUMARAN@GMAIL.COM", "SUGUMARAN123");
    String result = String.format("%15s %15s %15s %15s %15s %15s",
        vendor1.getVendorId(), vendor1.getVendorName(), vendor1.getVendorUsername(),
        vendor1.getVendorNumber(), vendor1.getVendorEmail(), vendor1.getVendorPassword());
    assertEquals(result, vendor1.toString());
  }
  /**
   * Tests for equals.
   */
  @Test
  public final void testEquals() {
    Vendor i = new Vendor();
    Vendor v1 = null;
    Vendor v2 = new Vendor(1100, "SUGUMARAN", "SUGUMARAN1100", "8870283988", "SUGUMARAN@GMAIL.COM", "SUGUMARAN123");
    Vendor v3 = new Vendor(1100, "SUGUMARAN", "SUGUMARAN1100", "8870283988", "SUGUMARAN@GMAIL.COM", "SUGUMARAN123");
    assertFalse(v2.equals(v1));
    assertTrue(v2.equals(v3));
    assertEquals(v2.hashCode(), v3.hashCode());
    Orders order = new Orders();
    assertFalse(v2.equals(order));
    assertFalse(v2.equals(i));
  }
  /**
   * Tests the equals/hashcode methods of the employee class.
   */
  @Test
  public final void testVendor() {
    Vendor v = new Vendor();
    assertNotNull(v);
    Vendor vendor = new Vendor(1100, "SUGUMARAN", "SUGUMARAN1100", "8870283988", "SUGUMARAN@GMAIL.COM", "SUGUMARAN123");
    assertEquals(1100, vendor.getVendorId());
    assertEquals("SUGUMARAN", vendor.getVendorName());
    assertEquals("SUGUMARAN1100", vendor.getVendorUsername());
    assertEquals("8870283988", vendor.getVendorNumber());
    assertEquals("SUGUMARAN@GMAIL.COM", vendor.getVendorEmail());
    assertEquals("SUGUMARAN123", vendor.getVendorPassword());

    v.setVendorId(1100);
    v.setVendorName("SUGUMARAN");
    v.setVendorUsername("SUGUMARAN1100");
    v.setVendorNumber("8870283988");
    v.setVendorEmail("SUGUMARAN@GMAIL.COM");
    v.setVendorPassword("SUGUMARAN123");

    assertEquals(1100, v.getVendorId());
    assertEquals("SUGUMARAN", v.getVendorName());
    assertEquals("SUGUMARAN1100", v.getVendorUsername());
    assertEquals("8870283988", v.getVendorNumber());
    assertEquals("SUGUMARAN@GMAIL.COM", v.getVendorEmail());
    assertEquals("SUGUMARAN123", v.getVendorPassword());
  }
}
