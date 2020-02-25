<<<<<<< HEAD:restservice/canteenmanagement/src/test/java/com/hexaware/MLP178/factory/VendorFactoryTest.java
package com.hexaware.MLP178.factory;

import com.hexaware.MLP178.persistence.VendorDAO;
import com.hexaware.MLP178.model.Vendor;
import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;

//import com.hexaware.MLP176.model.Vendor;
//import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
//import java.util.Date;
//import java.text.SimpleDateFormat;
//import java.text.ParseException;
import org.junit.Test;
//import org.junit.Before;
import org.junit.runner.RunWith;
import java.util.ArrayList;

import mockit.Expectations;
import mockit.MockUp;
import mockit.Mocked;
import mockit.Mock;
import mockit.integration.junit4.JMockit;
//import java.util.ArrayList;
/**
 * Test class for Vendor.
 */
@RunWith(JMockit.class)
public class VendorFactoryTest {
    /**
   * tests for constructor.
   */
  @Test
  public final void testConstructor() {
    assertNotNull(new VendorFactory());
    assertNotNull(VendorFactory.dao());
  }


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
    Vendor[] v = VendorFactory.showVendor();
    assertEquals(0, v.length);
  }
  /**
   * Tests that a list with some employees is handled correctly.
   * @param dao mocking the dao class
   */

  @Test
  public final void testListAllSome(@Mocked final VendorDAO dao) {
    final Vendor v2 = new Vendor(101, "XYZ", "xyz", "9999977654", "XYZ@GMAIL.COM", "512");
    final Vendor v3 = new Vendor(102, "RKP", "rkp", "9988877654", "RKP@GMAIL.COM", "507");
    final ArrayList<Vendor> ven = new ArrayList<Vendor>();
    new Expectations() {
      {
        ven.add(v2);
        ven.add(v3);
        dao.show(); result = ven;
      }
    };
    new MockUp<VendorFactory>() {
      @Mock
      VendorDAO dao() {
        return dao;
      }
    };
    Vendor[] ven1 = VendorFactory.showVendor();
    assertEquals(2, ven1.length);
    assertEquals(101, ven1[0].getVendorId());
    assertEquals(102, ven1[1].getVendorId());
    assertEquals("XYZ", ven1[0].getVendorName());
    assertEquals("RKP", ven1[1].getVendorName());
    assertEquals("xyz", ven1[0].getVendorUsername());
    assertEquals("rkp", ven1[1].getVendorUsername());
    assertEquals("9999977654", ven1[0].getVendorNumber());
    assertEquals("9988877654", ven1[1].getVendorNumber());
    assertEquals("XYZ@GMAIL.COM", ven1[0].getVendorEmail());
    assertEquals("RKP@GMAIL.COM", ven1[1].getVendorEmail());
    assertEquals("512", ven1[0].getVendorPassword());
    assertEquals("507", ven1[1].getVendorPassword());
  }
   /**
   * Tests that a list with some employees is handled correctly.
   * @param dao mocking the dao class
   */
  @Test
  public final void testFindByVendorId(@Mocked final VendorDAO dao) {
    final Vendor v2 = new Vendor(101, "XYZ", "xyz", "9999977654", "XYZ@GMAIL.COM", "512");
    final Vendor v3 = new Vendor(102, "RKP", "rkp", "9988877654", "RKP@GMAIL.COM", "507");
    new Expectations() {
      {
        dao.findByVendorName("XYZ"); result = v2;
        dao.findByVendorName("RKP"); result = v3;
        dao.findByVendorName("TEZ"); result = null;
      }
    };
    new MockUp<VendorFactory>() {
      @Mock
      VendorDAO dao() {
        return dao;
      }
    };
    Vendor vendor1 = VendorFactory.findByVendorName("XYZ");
    assertNotNull(vendor1);
    Vendor vendor2 = VendorFactory.findByVendorName("RKP");
    assertNotNull(vendor2);
    Vendor vendor3 = VendorFactory.findByVendorName("TEZ");
    assertNull(vendor3);
  }
  /**
   * Tests that a list Employ Search by Vendor id.
   * @param dao mocking the dao class.
   */
  @Test
  public final void testListByVendorId(@Mocked final VendorDAO dao) {
    final Vendor v2 = new Vendor(101, "XYZ", "xyz", "9999977654", "XYZ@GMAIL.COM", "512");
    final Vendor v3 = new Vendor(102, "RKP", "rkp", "9988877654", "RKP@GMAIL.COM", "507");
    new Expectations() {
      {
        dao.findByVendorName("XYZ"); result = v2;
        dao.findByVendorName("RKP"); result = v3;
      }
    };
    new MockUp<VendorFactory>() {
      @Mock
      VendorDAO dao() {
        return dao;
      }
    };
    Vendor ven1 = VendorFactory.findByVendorName("XYZ");
    Vendor ven2 = VendorFactory.findByVendorName("RKP");
    assertEquals(101, ven1.getVendorId());
    assertEquals(102, ven2.getVendorId());
  }
  /**
   * Tests that a list Employ Search by Vendor id.
   * @param dao mocking the dao class.
   */
  @Test
  public final void testValidateVendor(@Mocked final VendorDAO dao) {
    new Expectations() {
      {
        dao.authenticate("XYZ", "512"); result = 1;
        dao.authenticate("RKP", "507"); result = 1;
        dao.authenticate("TEZ", "123"); result = 0;
      }
    };
    new MockUp<VendorFactory>() {
      @Mock
      VendorDAO dao() {
        return dao;
      }
    };
    assertEquals(1, VendorFactory.validateVendor("XYZ", "512"));
    assertEquals(1, VendorFactory.validateVendor("RKP", "507"));
    assertEquals(0, VendorFactory.validateVendor("TEZ", "123"));
  }
}

=======
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
>>>>>>> 22cc0e1bffcf3bc802af6909eb8eb2a884ff1ee4:VendorFactoryTest.java
