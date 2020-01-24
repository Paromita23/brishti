package com.hexaware.MLP178.model;

import com.hexaware.MLP178.persistence.OrderDAO;
import com.hexaware.MLP178.factory.OrderFactory;
//import com.hexaware.MLP178.model.OrderStatus;
//import com.hexaware.MLP178.model.Orders;
//import com.hexaware.MLP178.model.WalletType;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotEquals;
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;
//import static org.junit.Assert.assertNotNull;
//import static org.junit.Assert.assertNull;

import java.text.ParseException;
import org.junit.Test;
//import org.junit.Before;
import org.junit.runner.RunWith;

import mockit.Expectations;
import mockit.MockUp;
import mockit.Mocked;
import mockit.Mock;
import mockit.integration.junit4.JMockit;
import java.util.ArrayList;
import java.util.Date;

import java.text.SimpleDateFormat;

/**
 * Test class for Order.
 */
@RunWith(JMockit.class)
public class OrderFactoryTest {
  /**
   * tests that empty employee list is handled correctly.
   * @param dao mocking the dao class
   */

  @Test
  public final void testListAllEmpty(@Mocked final OrderDAO dao) {
    new Expectations() {
      {
        dao.show(); result = new ArrayList<Orders>();
      }
    };
    new MockUp<OrderFactory>() {
      @Mock
      OrderDAO dao() {
        return dao;
      }
    };
    Orders[] o = OrderFactory.showOrder();
    assertEquals(0, o.length);
  }
    /**
   * Tests that a list with some employees is handled correctly.
   * @param dao mocking the dao class
   * @throws ParseException for date format validation.
   */
  @Test
  public final void testListAllSome(@Mocked final OrderDAO dao) throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String dt = new String("2020-03-18");
    Date odt = sdf.parse(dt);
    final Orders o2 = new Orders(1, 1201, 1100, 1, OrderStatus.ACCEPTED, "SPICY", 45.00000, odt, 1, WalletType.PAYTM);
    final Orders o3 = new Orders(2, 1202, 1101, 2, OrderStatus.PENDING, "CRISPY", 50.00000, odt, 1, WalletType.CREDIT_CARD);
    final ArrayList<Orders> or = new ArrayList<Orders>();
    new Expectations() {
      {
        or.add(o2);
        or.add(o3);
        dao.show(); result = or;
      }
    };
    new MockUp<OrderFactory>() {
      @Mock
      OrderDAO dao() {
        return dao;
      }
    };
    Orders[] or1 = OrderFactory.showOrder();
    assertEquals(2, or1.length);
    assertEquals(1, or1[0].getOrderId());
    assertEquals(2, or1[1].getOrderId());
    assertEquals(1201, or1[0].getOrderId());
    assertEquals(1202, or1[1].getOrderId());
    assertEquals(1100, or1[0].getVendorId());
    assertEquals(1101, or1[1].getVendorId());
    assertEquals(1, or1[0].getMenuId());
    assertEquals(2, or1[1].getMenuId());
    assertEquals(OrderStatus.ACCEPTED, or1[0].getOrderStatus());
    assertEquals(OrderStatus.PENDING, or1[1].getOrderStatus());
    assertEquals("SPICY", or1[0].getOrderComments());
    assertEquals("CRISPY", or1[1].getOrderComments());
    assertEquals(45.00000, or1[0].getOrderTotalamount(), 0);
    assertEquals(50.00000, or1[1].getOrderTotalamount(), 0);
    assertEquals(odt, or1[0].getOrderDate());
    assertEquals(odt, or1[1].getOrderDate());
    assertEquals(1, or1[0].getOrderQuantity());
    assertEquals(1, or1[1].getOrderQuantity());
    assertEquals(WalletType.PAYTM, or1[0].getWalletType());
    assertEquals(WalletType.CREDIT_CARD, or1[1].getWalletType());
  }
}
