package com.hexaware.MLP178.util;
import java.util.Scanner;
import java.io.Console;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.hexaware.MLP178.factory.MenuFactory;
import com.hexaware.MLP178.model.Menu;
import com.hexaware.MLP178.factory.VendorFactory;
import com.hexaware.MLP178.model.Vendor;
import com.hexaware.MLP178.factory.OrderFactory;
import com.hexaware.MLP178.model.Orders;
import com.hexaware.MLP178.factory.CustomerFactory;
import com.hexaware.MLP178.model.Customer;
import java.text.ParseException;
import com.hexaware.MLP178.factory.WalletFactory;
import com.hexaware.MLP178.model.Wallet;
import com.hexaware.MLP178.model.WalletType;
/**
 * CliMain used as Client interface for java coading.
 * @author hexware
 */
class CliMain {
  private Scanner option = new Scanner(System.in, "UTF-8");
/**
 * mainMenu method  used to display the option we had in the application.
 */
  private void mainMenu() {
    System.out.println("Canteen Management System");
    System.out.println("-----------------------");
    System.out.println("1. Show Menu");
    System.out.println("2. Show Vendor");
    System.out.println("3. Show orders");
    System.out.println("4. Pending Orders");
    System.out.println("5. Order History");
    System.out.println("6. Show customers");
    System.out.println("7. Show wallet");
    System.out.println("8. Place Order");
    System.out.println("9. accept reject");
    System.out.println("10. cancel order");
    System.out.println("11. Exit");
    mainMenuDetails();
  }
/**
 * mainMenuDetails method  process the option selected from main menu.
 */
  private void mainMenuDetails() {
    try {
      System.out.println("Enter your choice:");
      int menuOption = option.nextInt();
      switch (menuOption) {
        case 1:
          showFullMenu();
          break;
        case 2:
          showFullVendor();
          break;
        case 3:
          showFullOrders();
          break;
        case 4:
          pendingOrders();
          break;
        case 5:
          orderHistory();
          break;
        case 6:
          showFullCustomer();
          break;
        case 7:
          showFullWallet();
          break;
        case 8:
          placeOrder();
          break;
        case 9:
          acceptReject();
          break;
        case 10:
          cancelOrder();
          break;
        case 11:
          Runtime.getRuntime().halt(0);
        default:
          System.out.println("Choose either 1,2,3,4 ,5 or 6");
      }
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("enter a valid value");
    }
    option.nextLine();
    mainMenu();
  }
  private void cancelOrder() {
    int ordId;
    int custId;
    String status;
    System.out.println("Enter Order Id  ");
    ordId = option.nextInt();
    System.out.println("Enter Customer Id  ");
    custId = option.nextInt();
    System.out.println("Cancel (Yes/No)  ");
    status = option.next();
    if (status.toUpperCase().equals("YES")) {
      System.out.println(OrderFactory.cancelOrder(ordId, custId, status));
    }
  }
  private void acceptReject() {
    int ordId;
    int vendorId;
    String status;
    System.out.println("Enter Order Id  ");
    ordId = option.nextInt();
    System.out.println("Enter Vendor Id  ");
    vendorId = option.nextInt();
    System.out.println("ACCEPTED or REJECTED  ");
    status = option.next();
    System.out.println(OrderFactory.acceptOrRejectOrder(ordId, vendorId, status));
  }

  private void placeOrder() {
    Menu[] menu = MenuFactory.showMenu();
    System.out.println("Menu_Id Category Name Quantity Cost Calories");
    for (Menu m : menu) {
      System.out.println(m.getMenuId() + " " + m.getMenuCat() + " " + m.getMenuItem()
          + " " + m.getMenuQuantity() + " " + m.getMenuCost() + " " + m.getMenuCalories());
    }
    Orders order = new Orders();
    System.out.println("Enter Customer ID ");
    order.setCustomerId(option.nextInt());
    System.out.println("Enter Menu Id  ");
    order.setMenuId(option.nextInt());
    System.out.println("Enter Vendor Id ");
    order.setVendorId(option.nextInt());
    System.out.println("Enter Quantity ");
    order.setOrderQuantity(option.nextInt());
    System.out.println("Enter Wallet Source ");
    String ws = option.next();
    WalletType walSrc = WalletType.PAYTM;
    if (ws.equals("PAYTM")) {
      walSrc = WalletType.PAYTM;
    }
    if (ws.equals("CREDIT_CARD")) {
      walSrc = WalletType.CREDIT_CARD;
    }
    if (ws.equals("DEBIT_CARD")) {
      walSrc = WalletType.DEBIT_CARD;
    }
    order.setWalletType(walSrc);
    System.out.println("Enter Order Date (yyyy-MM-dd)  ");
    String ord = option.next();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    try {
      Date dt = sdf.parse(ord);
      order.setOrderDate(dt);
    } catch (ParseException e) {
      System.out.println(e);
    }
    System.out.println("Enter Order Comments ");
    order.setOrderComments(option.next());
    System.out.println(OrderFactory.placeOrder(order));
  }
  private void orderHistory() {
    System.out.println("Orders history:\n1. Customer\n2. Vendor");
    int choice = option.nextInt();
    int count = 0;
    if (choice == 1) {
      System.out.println("Enter customer Name");
      String username = option.next();
      Console console = System.console();
      char[] pwd = console.readPassword("Enter Customer password");
      String password = String.valueOf(pwd);
        //String password = option.next();
      try {
        count = CustomerFactory.validateCustomer(username, password);
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
        mainMenu();
      }
      if (count == 1) {
        Customer customer = CustomerFactory.findByCustomerName(username);
        int custId = customer.getCustomerId();
        Orders[] cusHistory = OrderFactory.showCustomerHistory(custId);
        System.out.println("-----------------------------------------------------------------"
            + "---------------------------------------------------------------------------------");
        System.out.printf("%10s %10s %10s %10s %10s %10s %10s %10s", "orderId", "customerId",
            "vendorid", "menuid", "Order status", "ordercomments", "Bill Amount",
            "Order quantity");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------"
            + "-----------------------------------------------------------------------");
        for (Orders order : cusHistory) {
          System.out.println(order);
          System.out.println();
        }
      } else {
        System.out.println("Invalid Credentials...");
      }
    }
    if (choice == 2) {
      System.out.println("Enter Vendor Name");
      String username = option.next();
      Console console = System.console();
      char[] pwd = console.readPassword("Enter Vendor password");
      String password = String.valueOf(pwd);
        //String password = option.next();
      try {
        count = VendorFactory.validateVendor(username, password);
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
        mainMenu();
      }
      if (count == 1) {
        Vendor vendor = VendorFactory.findByVendorName(username);
        int vendId = vendor.getVendorId();
        Orders[] venHistory = OrderFactory.showVendorHistory(vendId);
        System.out.println("----------------------------------------------------"
            + "----------------------------------------------");
        System.out.printf("%20s %20s %20s %20s %20s %20s %20s %20s", "Item Id", "Menu Id",
            "Order Status", "Order quantity", "Order id", "Customer ID", "Bill Amount",
            "Order Date");
        System.out.println();
        System.out.println("----------------------------------------------------"
            + "----------------------------------------------");
        for (Orders order : venHistory) {
          System.out.println(order);
          System.out.println();
        }
      } else {
        System.out.println("Invalid Credentials...");
      }
    }
  }
  private void pendingOrders() {
    System.out.println("Order history:\n1. Customer Orders\n2. Vendor Orders");
    int choice = option.nextInt();
    int count = 0;
    if (choice == 1) {
      System.out.println("Enter UserName");
      String username = option.next();
      Console console = System.console();
      char[] pwd = console.readPassword("Enter password");
      String password = String.valueOf(pwd);
        //String password = option.next();
      try {
        count = CustomerFactory.validateCustomer(username, password);
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
        mainMenu();
      }
      if (count == 1) {
        Customer customer = CustomerFactory.findByCustomerName(username);
        int custId = customer.getCustomerId();
        Orders[] cusHistory = OrderFactory.showpendingCustomerOrders(custId);
        System.out.println("------------------------------------------------------------------------"
            + "------------------------------------------------------------------------");
        System.out.printf("%15s %15s %15s %15s %15s %15s %15s %15s %15s", "Order Id", "Cus Id",
            "Vendor Id", "Menu ID", "Order Status", "Order Comments", "Bill Amount",
            "Order Date", "Order Qty");
        System.out.println();
        System.out.println("------------------------------------------------------------------------"
            + "------------------------------------------------------------------------");
        for (Orders order : cusHistory) {
          System.out.println(order);
          System.out.println();
        }
      } else {
        System.out.println("Invalid Credentials...");
      }
    }
    if (choice == 2) {
      System.out.println("Enter UserName");
      String username = option.next();
      Console console = System.console();
      char[] pwd = console.readPassword("Enter password");
      String password = String.valueOf(pwd);
        //String password = option.next();
      try {
        count = VendorFactory.validateVendor(username, password);
      } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
        mainMenu();
      }
      if (count == 1) {
        Vendor vendor = VendorFactory.findByVendorName(username);
        int vendId = vendor.getVendorId();
        Orders[] venHistory = OrderFactory.showpendingVendorOrders(vendId);
        System.out.println("------------------------------------------------------------------------"
            + "------------------------------------------------------------------------");
        System.out.printf("%15s %15s %15s %15s %15s %15s %15s %15s %15s", "Order Id", "Cus Id",
            "Vendor Id", "Menu ID", "Order Status", "Order Comments", "Bill Amount",
            "Order Date", "Order Qty");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------"
            + "---------------------------------------------------------------");
        for (Orders order : venHistory) {
          System.out.println(order);
          System.out.println();
        }
      } else {
        System.out.println("Invalid Credentials...");
      }
    }
  }

 /**
 * showFullMenu method  display the menu item stored in database.
 */
  private void showFullWallet() {
    System.out.println("Enter customer Name");
    int count = 0;
    String username = option.next();
    Console console = System.console();
    char[] pwd = console.readPassword("Enter Customer password");
    String password = String.valueOf(pwd);
  //String password = option.next();
    try {
      count = CustomerFactory.validateCustomer(username, password);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
      mainMenu();
    }
    if (count == 1) {
      Customer customer = CustomerFactory.findByCustomerName(username);
      int custId = customer.getCustomerId();
      Wallet[] wallet = WalletFactory.showWallet(custId);
      System.out.println("-------------------------------------------------------------------"
          + "---------------------------------------------------------------------------------");
      System.out.printf("%20s %20s %20s %20s", "WalletId", "WalletType",
          "WalletAmount", "CustomerId");
      System.out.println("");
      System.out.println("--------------------------------------------------------------------"
          + "-----------------------------------------------------------------------");
      for (Wallet m : wallet) {
        System.out.println(m.getWalletId() + "          " + m.getWalletType() + "         " + m.getWalletAmount()
            + "         " + m.getCustomerId());
        System.out.println();
      }
    } else {
      System.out.println("Invalid Credentials...");
    }
  }
/**
 * showFullMenu method  display the menu item stored in database.
 */
  private void showFullMenu() {
    Menu[] menu = MenuFactory.showMenu();
    System.out.println("Menu_Id Category name Quantity Cost Calories reviews");
    for (Menu m : menu) {
      System.out.println(m.getMenuId() + " " + m.getMenuCat() + " " + m.getMenuItem()
          + " " + m.getMenuQuantity() + " " + m.getMenuCost() + " " + m.getMenuCalories() + " " + m.getMenuReviews());
    }
  }
  /**
 * showFullMenu method  display the menu item stored in database.
 */
  private void showFullVendor() {
    String user;
    String password;
    System.out.println("enter the username");
    user = option.next();
    Console console = System.console();
    char[] pwd = console.readPassword("enter password");
    password = String.valueOf(pwd);
    int count = VendorFactory.validateVendor(user, password);
    System.out.println(count);
    if (count == 1) {
      Vendor vendorFound = VendorFactory.findByVendorName(user);
      System.out.println(vendorFound);
    } else {
      System.out.println("invalid credentials..");
    }
    //Vendor[] vendor = VendorFactory.showVendor();
    //System.out.println("vendorid name username number email password");
    //for (Vendor m : vendor) {
    //  System.out.println(m.getVendorId() + " " + m.getVendorName() + " " + m.getVendorUsername()
    //      + " " + m.getVendorNumber() + " " + m.getVendorEmail() + " " + m.getVendorPassword());
    //}
  }
  /**
 * showFullMenu method  display the menu item stored in database.
 */
  private void showFullOrders() {
    Orders[] order = OrderFactory.showOrder();
    System.out.println("vendorid name username number email password");
    for (Orders m : order) {
      System.out.println(m.getOrderId() + " " + m.getCustomerId() + " " + m.getVendorId()
          + " " + m.getMenuId() + " " + m.getOrderStatus() + " " + m.getOrderComments() + " " + m.getOrderTotalamount()
          + " " + m.getOrderDate() + " " + m.getOrderQuantity());
    }
  }
   /**
 * showFullMenu method  display the menu item stored in database.
 */
  private void showFullCustomer() {
    String user;
    String password;
    System.out.println("enter the username");
    user = option.next();
    Console console = System.console();
    char[] pwd = console.readPassword("enter password");
    password = String.valueOf(pwd);
    int count = CustomerFactory.validateCustomer(user, password);
    System.out.println(count);
    if (count == 1) {
      Customer customerFound = CustomerFactory.findByCustomerName(user);
      System.out.println(customerFound);
    } else {
      System.out.println("invalid credentials..");
    }
  }
/**
 * main method  is the basic entry point for the application.
 * @param args used to get the user input.
 */
  public static void main(final String[] args) {
    final CliMain mainObj = new CliMain();
    mainObj.mainMenu();
  }
}
