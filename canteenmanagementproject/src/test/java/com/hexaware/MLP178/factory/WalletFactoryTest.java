package com.hexaware.MLP178.factory;
import com.hexaware.MLP178.persistence.WalletDAO;
import com.hexaware.MLP178.model.Wallet;
import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;

//import com.hexaware.MLP178.model.Wallet;
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
 * tests that empty employee list is handled correctly.
 * @param dao mocking the dao class.
 */
  @Test
  public final void testListAllSome(@Mocked final WalletDAO dao) {
    final Wallet w1 = new Wallet(200, WalletType.PAYTM, 6000.00, 50);
    final Wallet w2 = new Wallet(201, WalletType.DEBIT_CARD, 8000.00, 51);
    final ArrayList<Wallet> wal1 = new ArrayList<Wallet>();
    new Expectations() {
      {
        wal1.add(w1);
        wal1.add(w2);
        dao.show(); result = wal1;
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
    assertEquals(200, wal1[0].getWalletId());
    assertEquals(300, wal1[1].getWalletId());
    assertEquals(WalletType.PAYTM, wal1[0].getWalletType());
    assertEquals(WalletType.DEBIT_CARD, wal1[1].getWalletType());
    assertEquals(6000.00, wal1[0].getWalletAmount(), 0);
    assertEquals(8000.00, wal1[1].getWalletAmount(), 0);
    assertEquals(50, wal1[0].getCustomerId());
    assertEquals(51, wal1[1].getCustomerId());
  }
}
