<<<<<<< HEAD:restservice/canteenmanagement/src/test/java/com/hexaware/MLP178/factory/WalletFactoryTest.java

package com.hexaware.MLP178.factory;
import com.hexaware.MLP178.persistence.WalletDAO;
import com.hexaware.MLP178.model.Wallet;
import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;

//import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
//import static org.junit.Assert.assertNull;
//import java.util.Date;
//import java.text.SimpleDateFormat;
//import java.text.ParseException;
import org.junit.Test;
//import org.junit.Before;
import org.junit.runner.RunWith;
import java.util.ArrayList;
import com.hexaware.MLP178.model.WalletType;

import mockit.Expectations;
import mockit.MockUp;
import mockit.Mocked;
import mockit.Mock;
import mockit.integration.junit4.JMockit;
//import java.util.ArrayList;
/**
 * Test class for Wallet.
 */
@RunWith(JMockit.class)
public class WalletFactoryTest {
    /**
   * tests for constructor.
   */
  @Test
  public final void testConstructor() {
    assertNotNull(new WalletFactory());
    assertNotNull(WalletFactory.dao());
  }
/**
   * tests that empty wallet list is handled correctly.
   * @param dao mocking the dao class
   */

  @Test
   public final void testListAllEmpty(@Mocked final WalletDAO dao) {
    new Expectations() {
      {
        dao.show(); result = new ArrayList<Wallet>();
      }
    };
    new MockUp<WalletFactory>() {
      @Mock
      WalletDAO dao() {
        return dao;
      }
    };
    Wallet[] w = WalletFactory.showWallet();
    assertEquals(0, w.length);
  }
  /**
 * tests that empty wallet list is handled correctly.
 * @param dao mocking the dao class.
 */
  @Test
 public final void testListAllSome(@Mocked final WalletDAO dao) {
    final Wallet w1 = new Wallet(200, WalletType.PAYTM, 6000.00, 50);
    final Wallet w2 = new Wallet(201, WalletType.DEBIT_CARD, 8000.00, 51);
    final ArrayList<Wallet> wal = new ArrayList<Wallet>();
    wal.add(w1);
    wal.add(w2);
    new Expectations() {
      {
        dao.show(); result = wal;
      }
    };
    new MockUp<WalletFactory>() {
      @Mock
    WalletDAO dao() {
        return dao;
      }
    };
    Wallet[] wal1 = WalletFactory.showWallet();
    assertEquals(2, wal1.length);
  }
    // assertEquals(2, wal1.length);
    // assertEquals(200, wal1[0].getWalletId());
    // assertEquals(201, wal1[1].getWalletId());
    // assertEquals(WalletType.PAYTM, wal1[0].getWalletType());
    // assertEquals(WalletType.DEBIT_CARD, wal1[1].getWalletType());
    // assertEquals(6000.00, wal1[0].getWalletAmount(), 0);
    // assertEquals(8000.00, wal1[1].getWalletAmount(), 0);
    // assertEquals(50, wal1[0].getCustomerId());
    // assertEquals(51, wal1[1].getCustomerId());
     /**
   * Tests that a list Employ Search by customer id.
   * @param dao mocking the dao class.
   */
  @Test
  public final void testwalletId(@Mocked final WalletDAO dao) {
    final Wallet w1 = new Wallet(500, WalletType.CREDIT_CARD, 6000.00, 100);
    final Wallet w2 = new Wallet(500, WalletType.DEBIT_CARD, 8000.00, 100);
    final Wallet w3 = new Wallet(501, WalletType.CREDIT_CARD, 1000.12, 101);
    final Wallet w4 = new Wallet(501, WalletType.DEBIT_CARD, 8000.00, 101);
    final ArrayList<Wallet> list1 = new ArrayList<Wallet>();
    list1.add(w1);
    list1.add(w2);
    final ArrayList<Wallet> list2 = new ArrayList<Wallet>();
    list2.add(w3);
    list2.add(w4);
    new Expectations() {
      {
        dao.showByWalletId(1); result = list1;
        dao.showByWalletId(2); result = list2;
      }
    };
    new MockUp<WalletFactory>() {
      @Mock
      WalletDAO dao() {
        return dao;
      }
    };
    Wallet[] e1 = WalletFactory.showWallet(1);
    Wallet[] e2 = WalletFactory.showWallet(2);
    assertEquals(2, e1.length);
    assertEquals(2, e2.length);
  }
}

=======
package com.hexaware.MLP178.model;

import com.hexaware.MLP178.persistence.WalletDAO;
import com.hexaware.MLP178.factory.WalletFactory;
//import com.hexaware.MLP178.model.WalletType;

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
 * Test class for Wallet.
 */
@RunWith(JMockit.class)
public class WalletFactoryTest {
    /**
   * tests that empty employee list is handled correctly.
   * @param dao mocking the dao class
   */

  @Test
  public final void testListAllEmpty(@Mocked final WalletDAO dao) {
    new Expectations() {
      {
        dao.show(); result = new ArrayList<Wallet>();
      }
    };
    new MockUp<WalletFactory>() {
      @Mock
      WalletDAO dao() {
        return dao;
      }
    };
    Wallet[] w = WalletFactory.showWallet();
    assertEquals(0, w.length);
  }
 /**
  * Tests that a list with some employees is handled correctly.
  * @param dao mocking the dao class
  */

  @Test
  public final void testListAllSome(@Mocked final WalletDAO dao) {
    final Wallet w2 = new Wallet(1001, WalletType.CREDIT_CARD, 600.00, 1201);
    final Wallet w3 = new Wallet(1002, WalletType.PAYTM, 1000.00, 1202);
    final ArrayList<Wallet> wl = new ArrayList<Wallet>();
    new Expectations() {
      {
        wl.add(w2);
        wl.add(w3);
        dao.show(); result = wl;
      }
    };
    new MockUp<WalletFactory>() {
      @Mock
      WalletDAO dao() {
        return dao;
      }
    };
    Wallet[] wl1 = WalletFactory.showWallet();
    assertEquals(2, wl1.length);
    assertEquals(1001, wl1[0].getWalletId());
    assertEquals(1002, wl1[1].getWalletId());
    assertEquals(WalletType.CREDIT_CARD, wl1[0].getWalletType());
    assertEquals(WalletType.PAYTM, wl1[1].getWalletType());
    assertEquals(600.00, wl1[0].getWalletAmount(), 0);
    assertEquals(1000.00, wl1[1].getWalletAmount(), 0);
    assertEquals(1201, wl1[0].getCustomerId());
    assertEquals(1202, wl1[1].getCustomerId());
  }
}
>>>>>>> 22cc0e1bffcf3bc802af6909eb8eb2a884ff1ee4:WalletFactoryTest.java
