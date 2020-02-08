package com.hexaware.MLP178.model;

//import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

//import com.hexaware.MLP178.model.Menu;

// import com.hexaware.MLP175.persistence.MenuDAO;
// import com.hexaware.MLP175.factory.MenuFactory;
import static org.junit.Assert.assertEquals;
// import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
//import static org.junit.Assert.assertNull;


import org.junit.Test;
import org.junit.Before;
// import org.junit.runner.RunWith;

// import mockit.Expectations;
// import mockit.MockUp;
// import mockit.Mocked;
// import mockit.Mock;
//import mockit.integration.junit4.JMockit;
// import java.util.ArrayList;

/**
 * Test class for Menu.
 */
//@RunWith(JMockit.class)
public class WalletTest {
    /**
   * setup method.
   */
  @Before
  public void initInput() {

  }
  /**
   * Tests for equals.
   */
  @Test
  public final void testEquals() {
    Vendor wa = new Vendor();
    Wallet m1 = null;
    Wallet m2 = new Wallet(1000, WalletType.CREDIT_CARD, 500.00, 1200);
    Wallet m3 = new Wallet(1000, WalletType.CREDIT_CARD, 500.00, 1200);
    assertFalse(m2.equals(m1));
    assertTrue(m2.equals(m3));
    assertEquals(m2.hashCode(), m3.hashCode());
    Wallet wallet = new Wallet();
    assertFalse(m2.equals(wallet));
    assertFalse(m2.equals(wa));
  }
  /**
   * Tests the equals hashcode methods of the employee class.
   */
  @Test
  public final void testWallet() {
    Wallet m = new Wallet();
    assertNotNull(m);
    Wallet wallet = new Wallet(1000, WalletType.CREDIT_CARD, 500.00, 1200);
    assertEquals(1000, wallet.getWalletId());
    assertEquals(WalletType.CREDIT_CARD, wallet.getWalletType());
    assertEquals(500.00, wallet.getWalletAmount(), 0);
    assertEquals(1200, wallet.getCustomerId());


    m.setWalletId(1000);
    m.setWalletType(WalletType.CREDIT_CARD);
    m.setWalletAmount(500.00);
    m.setCustomerId(1200);

    assertEquals(1000, m.getWalletId());
    assertEquals(WalletType.CREDIT_CARD, m.getWalletType());
    assertEquals(500.00, m.getWalletAmount(), 0);
    assertEquals(1200, m.getCustomerId());
  }
  /**
   * Tests the toString() methods of the Vendor class.
   */
  @Test
  public final void testToString() {
    Wallet m = new Wallet(1000, WalletType.CREDIT_CARD, 500.00, 1200);
    String result = String.format("%20s %20s %20s %20s", m.getCustomerId(), m.getWalletId(), m.getWalletType(),
        m.getWalletAmount());
    assertEquals(result, m.toString());
  }
}
