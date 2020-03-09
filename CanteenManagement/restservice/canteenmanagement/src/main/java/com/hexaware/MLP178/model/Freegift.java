package com.hexaware.MLP178.model;
import java.util.Objects;

/**
 * Menu class used to display menu information.
 * @author hexware
 */
public class Freegift {

/**
 * menuId to store menuId.
 */
  private int custId;
  /**
 * menuCat to store menu category.
 */
  private int venId;
  /**
 * menuItem to store food name.
 */
  private int giftStat;
   /**
   * Default Constructor.
   */
  public Freegift() {

  }
  /**
 * @param argCustId to initialize food id.
 * used to get details through constructor.
  * @param argVenId to initialize food price.
 * @param argGiftStat to initialize food Detail.
*/
public Freegift(final int argCustId, final int argVenId,final int argGiftStat) {
this.custId = argCustId;
this.venId = argVenId;
this.giftStat = argGiftStat;
}
@Override
    public final boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Freegift menu = (Freegift) obj;
    if (Objects.equals(custId, menu.custId) && Objects.equals(venId, menu.venId)
        && Objects.equals(giftStat, menu.giftStat) ) {
      return true;
    }
    return false;
  }
  @Override
    public final int hashCode() {
    return Objects.hash(custId);
  }
  @Override
    public final String toString() {
    return String.format("%10s %10s %10s", custId, venId, giftStat);
  }
/**
     * @return this food ID.
     */
    public final int getCustId() {
        return custId;
      }
        /**
         * @param argCustId gets the food id.
         */
      public final void setCustId(final int argCustId) {
        this.custId = argCustId;
      }
      
      /**
     * @return this food ID.
     */
    public final int getVenId() {
        return venId;
      }
        /**
         * @param argVenId gets the food id.
         */
      public final void setVenId(final int argVenId) {
        this.venId = argVenId;
      }
      
      /**
     * @return this food ID.
     */
    public final int getGiftStat() {
        return giftStat;
      }
        /**
         * @param argGiftStat gets the food id.
         */
      public final void setGiftStat(final int argGiftStat) {
        this.giftStat = argGiftStat;
      }
    }
    