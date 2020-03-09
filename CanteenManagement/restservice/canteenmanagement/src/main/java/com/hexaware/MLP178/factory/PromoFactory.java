package com.hexaware.MLP178.factory;

import com.hexaware.MLP178.persistence.PromoDAO;
import com.hexaware.MLP178.persistence.DbConnection;
import java.util.List;


import com.hexaware.MLP178.model.Promo;
/**
 * WalletFactory class used to fetch menu data from database.
 * @author hexware
 */
public class PromoFactory {
  /**
   *  Protected constructor.
   */
  protected PromoFactory() {


  }
  /**
   * Call the data base connection.
   * @return the connection object.
   */
  public static PromoDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(PromoDAO.class);
  }
  /**
   * Call the data base connection.
   * @return the array of menu object.
   * @param cusID to show customer id.
   */
  public static Promo[] showPromo(final int cusID) {
    List<Promo> promo = dao().showByPromoId(cusID);
    return promo.toArray(new Promo[promo.size()]);
  }
  /**
   * Call the data base connection.
   * @return the array of menu object.
   */
  public static Promo[] showPromo() {
    List<Promo> promo = dao().show();
    return promo.toArray(new Promo[promo.size()]);
  }
  public static int validatePromo(final String promoCode, final int cusId) {
    int count = dao().authenticate(promoCode, cusId);
    return count;
  }
  public static Promo getPromoInfo(final int cusId, final String promoCode) {
    Promo count = dao().applyPromo(cusId, promoCode);
    return count;
  }
}