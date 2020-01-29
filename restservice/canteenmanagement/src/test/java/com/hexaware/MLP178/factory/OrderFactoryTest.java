package com.hexaware.MLP178.factory;
import com.hexaware.MLP178.model.MenuCat;
import com.hexaware.MLP178.persistence.OrderDAO;
//import com.hexaware.MLP178.fact.OrderFactory;
import com.hexaware.MLP178.model.OrderStatus;
import com.hexaware.MLP178.model.Orders;
import com.hexaware.MLP178.model.Menu;
import com.hexaware.MLP178.model.Wallet;
//import com.hexaware.MLP178.model.Vendor;
import com.hexaware.MLP178.model.WalletType;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotEquals;
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;
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
   * tests for constructor.
   */
  @Test
  public final void testConstructor() {
    assertNotNull(new OrderFactory());
    assertNotNull(OrderFactory.dao());
  }
   /**
   * Tests that a list with some employees is handled correctly.
   * @param dao mocking the dao class.
   * @throws ParseException for date format validation.
   */
  @Test
  public final void showCustomerHistory(@Mocked final OrderDAO dao) throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String dt = new String("2020-03-18");
    Date odt = sdf.parse(dt);
    final Orders v2 = new Orders(2, 1, 4, 3, OrderStatus.ACCEPTED, "SPICY", 456.00000, odt, 1, WalletType.PAYTM);
    final Orders v3 = new Orders(3, 2, 1, 5, OrderStatus.ACCEPTED, "SPICY", 56.00000, odt, 4, WalletType.PAYTM);
    new Expectations() {
      {
        dao.customerHistory(1); result = v2;
        dao.customerHistory(5); result = v3;
        //dao.customerHistory(123); result = null;
      }
    };
    new MockUp<OrderFactory>() {
      @Mock
      OrderDAO dao() {
        return dao;
      }
    };
    Orders[] vendor1 = OrderFactory.showCustomerHistory(1);
    assertNotNull(vendor1);
    Orders[] vendor2 = OrderFactory.showCustomerHistory(5);
    assertNotNull(vendor2);
    // Orders[] vendor3 = OrderFactory.showCustomerHistory(3);
    // assertNull(vendor3);
  }
  /**
   * Tests that a list with some employees is handled correctly.
   * @param dao mocking the dao class.
   * @throws ParseException for date format validation.
   */
  @Test
  public final void showVendorHistory(@Mocked final OrderDAO dao) throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String dt = new String("2020-03-18");
    Date odt = sdf.parse(dt);
    final Orders v2 = new Orders(2, 1, 4, 3, OrderStatus.ACCEPTED, "SPICY", 456.00000, odt, 1, WalletType.PAYTM);
    final Orders v3 = new Orders(3, 2, 1, 5, OrderStatus.ACCEPTED, "SPICY", 56.00000, odt, 4, WalletType.PAYTM);
    new Expectations() {
      {
        dao.vendorHistory(1); result = v2;
        dao.vendorHistory(5); result = v3;
        //dao.customerHistory(3); result = null;
      }
    };
    new MockUp<OrderFactory>() {
      @Mock
      OrderDAO dao() {
        return dao;
      }
    };
    Orders[] vendor1 = OrderFactory.showVendorHistory(1);
    assertNotNull(vendor1);
    Orders[] vendor2 = OrderFactory.showVendorHistory(5);
    assertNotNull(vendor2);
    //Orders[] vendor3 = OrderFactory.showCustomerHistory(3);
    //assertNull(vendor3);
  }
/**
   * Tests that a list with some employees is handled correctly.
   * @param dao mocking the dao class.
   * @throws ParseException for date format validation.
   */
  @Test
  public final void showpendingCustomerOrders(@Mocked final OrderDAO dao) throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String dt = new String("2020-03-18");
    Date odt = sdf.parse(dt);
    final Orders v2 = new Orders(2, 1, 4, 3, OrderStatus.ACCEPTED, "SPICY", 456.00000, odt, 1, WalletType.PAYTM);
    final Orders v3 = new Orders(3, 2, 1, 5, OrderStatus.ACCEPTED, "SPICY", 56.00000, odt, 4, WalletType.PAYTM);
    new Expectations() {
      {
        dao.pendingCustomer(1); result = v2;
        dao.pendingCustomer(5); result = v3;
        //dao.customerHistory(3); result = null;
      }
    };
    new MockUp<OrderFactory>() {
      @Mock
      OrderDAO dao() {
        return dao;
      }
    };
    Orders[] vendor1 = OrderFactory.showpendingCustomerOrders(1);
    assertNotNull(vendor1);
    Orders[] vendor2 = OrderFactory.showpendingCustomerOrders(5);
    assertNotNull(vendor2);
    //Orders[] vendor3 = OrderFactory.showCustomerHistory(3);
    //assertNull(vendor3);
  }
  /**
   * Tests that a list with some employees is handled correctly.
   * @param dao mocking the dao class.
   * @throws ParseException for date format validation.
   */
  @Test
  public final void showpendingVendorOrders(@Mocked final OrderDAO dao) throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String dt = new String("2020-03-18");
    Date odt = sdf.parse(dt);
    final Orders v2 = new Orders(2, 1, 4, 3, OrderStatus.ACCEPTED, "SPICY", 456.00000, odt, 1, WalletType.PAYTM);
    final Orders v3 = new Orders(3, 2, 1, 5, OrderStatus.ACCEPTED, "SPICY", 56.00000, odt, 4, WalletType.PAYTM);
    new Expectations() {
      {
        dao.pendingVendor(1); result = v2;
        dao.pendingVendor(5); result = v3;
        //dao.customerHistory(3); result = null;
      }
    };
    new MockUp<OrderFactory>() {
      @Mock
      OrderDAO dao() {
        return dao;
      }
    };
    Orders[] vendor1 = OrderFactory.showpendingVendorOrders(1);
    assertNotNull(vendor1);
    Orders[] vendor2 = OrderFactory.showpendingVendorOrders(5);
    assertNotNull(vendor2);
    //Orders[] vendor3 = OrderFactory.showCustomerHistory(3);
    //assertNull(vendor3);
  }
   /**
  * @param dao for mockingAcceptOrRejectOrde Mock Test.
  * @throws ParseException for converting date to string.
   */
  @Test
  public final void testAcceptOrRejectOrder(@Mocked final OrderDAO dao) throws ParseException {
    final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    final String dt = new String("2020-03-18");
    final Date odt = sdf.parse(dt);
    final Orders order1 = new Orders(1, 1, 4, 3, OrderStatus.ACCEPTED, "SPICY", 456.00000, odt, 1, WalletType.PAYTM);
    new Expectations() {
        {
          dao.findByOrderId(1); result = order1;
          dao.findByOrderId(2); result = null;
          dao.acceptOrReject("ACCEPTED", 1);
          dao.acceptOrReject("REJECTED", 1);
        }
      };
    new MockUp<OrderFactory>() {
        @Mock
        OrderDAO dao() {
          return dao;
        }
      };
    String result1 = OrderFactory.acceptOrRejectOrder(1, 4, "ACCEPTED");
    assertEquals(result1, "Order Accepted Successfully...");
    String result2 = OrderFactory.acceptOrRejectOrder(1, 4, "REJECTED");
    assertEquals(result2, "Order Rejected and Amount Refunded...");
    String result3 = OrderFactory.acceptOrRejectOrder(1, 301, "REJECTED");
    assertEquals(result3, "You are Unauthorized Vendor for this order...");
    String result4 = OrderFactory.acceptOrRejectOrder(2, 300, "REJECTED");
    assertEquals(result4, "Invalid OrderId...");
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
    final Orders o2 = new Orders(1, 1200, 1100, 1, OrderStatus.ACCEPTED, "SPICY", 45.00000, odt, 1, WalletType.PAYTM);
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
    assertEquals(1200, or1[0].getCustomerId());
    assertEquals(1202, or1[1].getCustomerId());
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
   /**
  * @param dao for mocking cancleorder Mock Test.
  * @throws ParseException for converting date to string.
   */
  @Test
  public final void testCancelOrder(@Mocked final OrderDAO dao) throws ParseException {
    final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    final String dt = new String("2020-03-18");
    final Date odt = sdf.parse(dt);
    final Orders o2 = new Orders(1, 1200, 1100, 1, OrderStatus.ACCEPTED, "SPICY", 45.00000, odt, 1, WalletType.PAYTM);
    final Orders o3 = new Orders(2, 1202, 1101, 2, OrderStatus.PENDING, "CRISPY", 50.00000, odt, 1, WalletType.CREDIT_CARD);
    new Expectations() {
        {
          dao.findByOrderId(1); result = o2;
          dao.findByOrderId(2); result = o3;
          // dao.findByOrderId(103); result = null;
          dao.acceptOrReject("REJECTED", 2);
        }
      };
    new MockUp<OrderFactory>() {
        @Mock
        OrderDAO dao() {
          return dao;
        }
      };
    String result5 = OrderFactory.cancelOrder(1, 1200, "YES");
    assertEquals(result5, "you cant cancel the order");
    String result6 = OrderFactory.cancelOrder(2, 1201, "YES");
    assertEquals(result6, "you are unauhtorized to cancel...");
    String result7 = OrderFactory.cancelOrder(2, 1202, "YES");
    assertEquals(result7, "Order Cancelled Successfully and Amount refunded to CREDIT_CARD");
  }
   /**
  * @param dao for mocking PlaceOrder Mock Test.
  * @throws ParseException for converting date to string.
   */
  @Test
  public final void testPlaceOrder(@Mocked final OrderDAO dao) throws ParseException {
    final Menu m2 = new Menu(101, MenuCat.VEG, "PODI DOSA", 1, 80, 105, "**");
    final Menu m3 = new Menu(102, MenuCat.NONVEG, "Biryani", 1, 1500, 110, "****");
    final Wallet w1 = new Wallet(1, WalletType.CREDIT_CARD, 1500.45, 1);
    final Wallet w2 = new Wallet(2, WalletType.DEBIT_CARD, 2000.65, 2);
    final Wallet w3 = new Wallet(3, WalletType.PAYTM, 2500.45, 1);
    final Wallet w4 = new Wallet(4, WalletType.PAYTM, 3000.65, 2);
    final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    final String ord1 = new String("2020-03-18");
    final Date orDate1 = sdf.parse(ord1);
    final String ord2 = new String("2020-01-18");
    final Date orDate2 = sdf.parse(ord2);
    final String ord3 = new String("2020-01-18");
    final Date orDate3 = sdf.parse(ord3);
    final Orders order1 = new Orders();
    order1.setOrderId(1);
    order1.setCustomerId(1);
    order1.setVendorId(1000);
    order1.setMenuId(102);
    order1.setOrderStatus(OrderStatus.ACCEPTED);
    order1.setOrderComments("Spicy");
    order1.setOrderTotalamount(45.00);
    order1.setOrderDate(orDate1);
    order1.setOrderQuantity(1);
    order1.setWalletType(WalletType.PAYTM);

    final Orders order2 = new Orders();
    order2.setOrderId(2);
    order2.setCustomerId(1);
    order2.setVendorId(1000);
    order2.setMenuId(102);
    order2.setOrderStatus(OrderStatus.PENDING);
    order2.setOrderComments("Spicy");
    order2.setOrderTotalamount(4500.00);
    order2.setOrderDate(orDate1);
    order2.setOrderQuantity(3);
    order2.setWalletType(WalletType.PAYTM);

    final Orders order3 = new Orders();
    order3.setOrderId(1);
    order3.setCustomerId(1);
    order3.setVendorId(1000);
    order3.setMenuId(101);
    order3.setOrderStatus(OrderStatus.ACCEPTED);
    order3.setOrderComments("Spicy");
    order3.setOrderTotalamount(4500.00);
    order3.setOrderDate(orDate2);
    order3.setOrderQuantity(3);
    order3.setWalletType(WalletType.CREDIT_CARD);

    final Orders order4 = new Orders();
    order4.setOrderId(1);
    order4.setCustomerId(1);
    order4.setVendorId(1000);
    order4.setMenuId(101);
    order4.setOrderStatus(OrderStatus.ACCEPTED);
    order4.setOrderComments("Spicy");
    order4.setOrderTotalamount(100.00);
    order4.setOrderDate(orDate3);
    order4.setOrderQuantity(3);
    order4.setWalletType(WalletType.PAYTM);
    new Expectations() {
        {
          dao.findByMenuId(101); result = m2;
        // dao.findByMenuId(20); result = m3;
          dao.getWalletInfo(WalletType.PAYTM, 1); result = w3;
        //   dao.getWallentInfo("NETBANKING", 100); result = w1;
        //   dao.getWallentInfo("PAYTM", 200); result = w4;
        //   dao.getWallentInfo("NETBANKING", 200); result = w2;
          dao.placeOrder(order1);
          dao.placeOrder(order2);
          dao.placeOrder(order3);
        }
      };
    new MockUp<OrderFactory>() {
        @Mock
        OrderDAO dao() {
          return dao;
        }
      };
    String result1 = OrderFactory.placeOrder(order1);
    assertEquals(result1,
        "Order Placed Successfully For the Registered Address...\nSoon you will be notified by our Vendor...");
    String result2 = OrderFactory.placeOrder(order2);
    assertEquals(result2,
        "Order Placed Successfully For the Registered Address...\nSoon you will be notified by our Vendor...");
    String result3 = OrderFactory.placeOrder(order3);
    assertEquals(result3, "Insufficient Funds To Place the Order...");
    String result4 = OrderFactory.placeOrder(order4);
    assertEquals(result4, "Order Cannot be Placed yesterday...");
  }
}
