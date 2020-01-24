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
