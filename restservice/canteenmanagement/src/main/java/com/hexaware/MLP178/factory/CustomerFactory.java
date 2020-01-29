package com.hexaware.MLP178.factory;

import com.hexaware.MLP178.persistence.CustomerDAO;
import com.hexaware.MLP178.persistence.DbConnection;
import java.util.List;

import com.hexaware.MLP178.model.Customer;
/**
 * MenuFactory class used to fetch menu data from database.
 * @author hexware
 */
public class CustomerFactory {
  /**
   *  Protected constructor.
   */
  protected CustomerFactory() {

  }
  /**
   * Call the data base connection.
   * @return the connection object.
   */
  public static CustomerDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(CustomerDAO.class);
  }
  /**
   * Call the data base connection.
   * @return the array of Customer object.
   */
  public static Customer[] showCustomer() {
    List<Customer> customer = dao().show();
    return customer.toArray(new Customer[customer.size()]);
  }
  /**
   * Call the data base connection.
   * @param customerName for getting Information.
   * @return the array of Customer object.
   */

  public static Customer findByCustomerName(final String customerName) {
    Customer customer = dao().findByCustomerName(customerName);
    return customer;
  }
  /**
   * Call the data base connection.
   * @param user for getting Information.
   * @param password for grting password.
   * @return the array of Customer object.
   */
  public static int validateCustomer(final String user, final String password) {
    int count = dao().authenticate(user, password);
    return count;
  }
}
