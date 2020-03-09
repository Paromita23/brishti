package com.hexaware.MLP178.factory;

import com.hexaware.MLP178.persistence.FreegiftDAO;
import com.hexaware.MLP178.persistence.DbConnection;
import java.util.List;

import com.hexaware.MLP178.model.Freegift;
/**
 * MenuFactory class used to fetch menu data from database.
 * @author hexware
 */
public class FreegiftFactory {
  /**
   *  Protected constructor.
   */
  protected FreegiftFactory() {

  }
  /**
   * Call the data base connection.
   * @return the connection object.
   */
  public static FreegiftDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(FreegiftDAO.class);
  }
   /**
   * Call the data base connection.
   * @return the array of menu object.
   */
  public static Freegift[] showgft() {
    List<Freegift> menu = dao().show();
    return menu.toArray(new Freegift[menu.size()]);
  }
    
}

