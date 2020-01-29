package com.hexaware.MLP178.model;

import com.hexaware.MLP178.persistence.VendorDAO;
import com.hexaware.MLP178.factory.VendorFactory;
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
 * Test class for Vendor.
 */
@RunWith(JMockit.class)
public class VendorFactoryTest {
    /**
   * tests that empty employee list is handled correctly.
   * @param dao mocking the dao class
   */

  @Test
  public final void testListAllEmpty(@Mocked final VendorDAO dao) {
    new Expectations() {
      {
        dao.show(); result = new ArrayList<Vendor>();
      }
    };
    new MockUp<VendorFactory>() {
      @Mock
      VendorDAO dao() {
        return dao;
      }
    };
    Vendor[] c = VendorFactory.showVendor();
    assertEquals(0, c.length);
  }
 /**
  * Tests that a list with some employees is handled correctly.
  * @param dao mocking the dao class
  */

  @Test
  public final void testListAllSome(@Mocked final VendorDAO dao) {
    final Vendor v2 = new Vendor(1102, "HARI", "HARI1102", "8854571228", "HARI@GMAIL.COM", "HARI123");
    final Vendor v3 = new Vendor(1103, "CHANDANA", "CHANDANA1103", "8845712428", "CHANDANA@GMAIL.COM", "CHANDANA123");
    final ArrayList<Vendor> vn = new ArrayList<Vendor>();
    new Expectations() {
      {
        vn.add(v2);
        vn.add(v3);
        dao.show(); result = vn;
      }
    };
    new MockUp<VendorFactory>() {
      @Mock
      VendorDAO dao() {
        return dao;
      }
    };
    Vendor[] vn1 = VendorFactory.showVendor();
    assertEquals(2, vn1.length);
    assertEquals(1102, vn1[0].getVendorId());
    assertEquals(1103, vn1[1].getVendorId());
    assertEquals("HARI", vn1[0].getVendorName());
    assertEquals("CHANDANA", vn1[1].getVendorName());
    assertEquals("HARI1102", vn1[0].getVendorUsername());
    assertEquals("CHANDANA1103", vn1[1].getVendorUsername());
    assertEquals("8854571228", vn1[0].getVendorNumber());
    assertEquals("8845712428", vn1[1].getVendorNumber());
    assertEquals("HARI@GMAIL.COM", vn1[0].getVendorEmail());
    assertEquals("CHANDANA@GMAIL.COM", vn1[1].getVendorEmail());
    assertEquals("HARI123", vn1[0].getVendorPassword());
    assertEquals("CHANDANA123", vn1[1].getVendorPassword());
  }
}
