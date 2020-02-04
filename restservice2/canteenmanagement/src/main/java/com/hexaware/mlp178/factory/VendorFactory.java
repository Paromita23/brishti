package com.hexaware.MLP178.factory;

import com.hexaware.MLP178.persistence.VendorDAO;
import com.hexaware.MLP178.persistence.DbConnection;
import java.util.List;

import com.hexaware.MLP178.model.Vendor;
/**
 * MenuFactory class used to fetch menu data from database.
 * @author hexware
 */
public class VendorFactory {
  /**
   *  Protected constructor.
   */
  protected VendorFactory() {

  }
  /**
   * Call the data base connection.
   * @return the connection object.
   */
  public static VendorDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(VendorDAO.class);
  }
  /**
   * Call the data base connection.
   * @return the array of menu object.
   */
  public static Vendor[] showVendor() {
    List<Vendor> vendor = dao().show();
    return vendor.toArray(new Vendor[vendor.size()]);
  }
  /**
   * Call the data base connection.
   * @param vendorName for getting Information.
   * @return the array of Customer object.
   */

  public static Vendor findByVendorName(final String vendorName) {
    Vendor vendor = dao().findByVendorName(vendorName);
    return vendor;
  }
  /**
   * Call the data base connection.
   * @param user for getting Information.
   * @param password for grting password.
   * @return the array of Customer object.
   */
  public static int validateVendor(final String user, final String password) {
    int count = dao().authenticate(user, password);
    return count;
  }
}
