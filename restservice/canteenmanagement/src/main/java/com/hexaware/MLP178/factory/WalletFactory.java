package com.hexaware.MLP178.factory;

import com.hexaware.MLP178.persistence.WalletDAO;
import com.hexaware.MLP178.persistence.DbConnection;
import java.util.List;

import com.hexaware.MLP178.model.Wallet;
/**
 * MenuFactory class used to fetch menu data from database.
 * @author hexware
 */
public class WalletFactory {
  /**
   *  Protected constructor.
   */
  protected WalletFactory() {

  }
  /**
   * Call the data base connection.
   * @return the connection object.
   */
  public static WalletDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(WalletDAO.class);
  }
    /**
   * Call the data base connection.
   * @param custId to cust id
   * @return the array of menu object.
   */
  public static Wallet[] showWallet(final int custId) {
    List<Wallet> wallet = dao().showByWalletId(custId);
    return wallet.toArray(new Wallet[wallet.size()]);
  }
   /**
   * Call the data base connection.
   * @return the array of menu object.
   */
  public static Wallet[] showWallet() {
    List<Wallet> wallet = dao().show();
    return wallet.toArray(new Wallet[wallet.size()]);
  }
}

