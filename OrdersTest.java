package com.hexaware.MLP178.model;
//import static org.junit.Assert.assertEquals;
// import com.hexaware.MLP175.persistence.MenuDAO;
// import com.hexaware.MLP175.factory.MenuFactory;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import java.util.Date;

import java.text.SimpleDateFormat;


import java.text.ParseException;
import org.junit.Test;
import org.junit.Before;
//import org.junit.runner.RunWith;

// import mockit.Expectations;
// import mockit.MockUp;
// import mockit.Mocked;
// import mockit.Mock;
//import mockit.integration.junit4.JMockit;

// import java.util.ArrayList;
    /**
   * test for orders.
   */
public class OrdersTest {
    /**
   * test for orders.
   */
  @Before
  public void initInput() {

  }
  /**
   * Tests the equals/hashcode methods of the orders class.
   *  @throws ParseException for date format validation.
   */
  @Test
  public final void testEquals() throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String dt = new String("2019-03-18");
    Date odt = sdf.parse(dt);
    Orders l = new Orders();
    Orders order3 = null;
    Orders order1 = new Orders(1, 1200, 1100, 1, OrderStatus.ACCEPTED, "SPICY", 45.00000, odt, 1, WalletType.PAYTM);
    Orders order2 = new Orders(1, 1200, 1100, 1, OrderStatus.ACCEPTED, "SPICY", 45.00000, odt, 1, WalletType.PAYTM);
    assertTrue(order1.equals(order2));
    assertFalse(order1.equals(order3));
    Orders o = null;
    assertFalse(order1.equals(o));
    Vendor v = new Vendor();
    assertFalse(order1.equals(v));
    assertFalse(order1.equals(l));
    assertEquals(order1.hashCode(), order2.hashCode());
  }
  /**
   * Tests the toString() methods of the Order class.
   * @throws ParseException for date format validation.
   */
  @Test
  public final void testToString() throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String dt = new String("2020-03-18");
    Date odt = sdf.parse(dt);
    Orders order1 = new Orders(1, 20, 11, 1, OrderStatus.ACCEPTED, "SPICY", 45.00000, odt, 1, WalletType.PAYTM);
    String result = String.format("%15s %15s %15s %15s %15s %15s %15s %15s %15s %15s",
        order1.getOrderId(), order1.getCustomerId(), order1.getVendorId(), order1.getMenuId(),
        order1.getOrderStatus(), order1.getOrderComments(), order1.getOrderTotalamount(),
        order1.getOrderDate(), order1.getOrderQuantity(), order1.getWalletType());
    assertEquals(result, order1.toString());
  }
  /**
   * test for orders.
   * @throws ParseException for Checking Date Format.
   */
  @Test
   public final void testOrders() throws ParseException {
    Orders m = new Orders();
    assertNotNull(m);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String dt = new String("2020-03-18");
    Date odt = sdf.parse(dt);
    Orders order = new Orders(1, 1200, 1100, 1, OrderStatus.ACCEPTED, "SPICY", 45.00000, odt, 1, WalletType.PAYTM);
    assertEquals(1, order.getOrderId());
    assertEquals(1200, order.getCustomerId());
    assertEquals(1100, order.getVendorId());
    assertEquals(1, order.getMenuId());
    assertEquals(OrderStatus.ACCEPTED, order.getOrderStatus());
    assertEquals("SPICY", order.getOrderComments());
    assertEquals(45.00000, order.getOrderTotalamount(), 0);
    assertEquals(odt, order.getOrderDate());
    assertEquals(1, order.getOrderQuantity());
    assertEquals(WalletType.PAYTM, order.getWalletType());

    m.setOrderId(1);
    m.setCustomerId(1200);
    m.setVendorId(1100);
    m.setMenuId(1);
    m.setOrderStatus(OrderStatus.ACCEPTED);
    m.setOrderComments("SPICY");
    m.setOrderTotalamount(45.00000);
    m.setOrderDate(odt);
    m.setOrderQuantity(1);
    m.setWalletType(WalletType.PAYTM);

    assertEquals(1, m.getOrderId());
    assertEquals(1200, m.getCustomerId());
    assertEquals(1100, m.getVendorId());
    assertEquals(1, m.getMenuId());
    assertEquals(OrderStatus.ACCEPTED, m.getOrderStatus());
    assertEquals("SPICY", m.getOrderComments());
    assertEquals(45.00000, m.getOrderTotalamount(), 0);
    assertEquals(odt, m.getOrderDate());
    assertEquals(1, m.getOrderQuantity());
    assertEquals(WalletType.PAYTM, m.getWalletType());

  }
}
