package com.hexaware.MLP178.model;

import java.sql.Date;

/**
 * vendor class used to display vendor information.
 * @author hexware
 */
public class Promo {
  /**
 * cusId to store vendor id.
 */
  private int cusId;
  /**
 * wallType to store vendor Type.
 */
  private PromoCode promoCode;
 /**
 * DateOfCoupon to store Wall Status.
 */
  private Date dateOfCoupon;
  /**
 * promoStatus to store Wall Status.
 */
private int promoStatus;
  /**
   * Default Constructor.
   */
  public Promo() {


  }
/**
 * @param argPromoCode to initialize vendor Type.
 * @param argCusId to initialize vendor Amount.
 * @param argDateOfCoupon to initialize date of coupon.
 * @param argPromoStatus to initialize the status.
 * used to get details through constructor.
 */
  public Promo(final int argCusId, final PromoCode argPromoCode, final Date argDateOfCoupon, final int argPromoStatus) {
    this.cusId = argCusId;
    this.promoCode = argPromoCode;
    this.dateOfCoupon = argDateOfCoupon;
    this.promoStatus = argPromoStatus;
  }
  @Override
  public final String toString() {
    return String.format("%-15s %-15s %-15s %-15s", cusId, promoCode, dateOfCoupon, promoStatus);
  }
    /**
     * @return this vendor ID.
     */
  public final int getCusId() {
    return cusId;
  }
    /**
     * @param argCusId gets the vendor id.
     */
  public final void setCusId(final int argCusId) {
    this.cusId = argCusId;
  }
      /**
     * @return this vendor type.
     */
  public final PromoCode promoCode() {
    return promoCode;
  }
      /**
       * @param argpromoCode gets the vendor type.
       */
  public final void setpromoCode(final PromoCode argPromoCode) {
    this.promoCode = argPromoCode;
  }
  /**
     * @return this date of coupon.
     */
    public final Date getDateOfCoupon() {
      return dateOfCoupon;
    }
          /**
           * @param argDateOfCoupon gets the date of coupon.
           */
    public final void setDateOfCoupon(final Date argDateOfCoupon) {
      this.dateOfCoupon = argDateOfCoupon;
    }
    /**
     * @return this date of coupon.
     */
    public final int getPromoStatus() {
      return promoStatus;
    }
      /**
       * @param argPromoStatus gets the vendor type.
       */
  public final void setPromoStatus(final int argPromoStatus) {
    this.promoStatus = argPromoStatus;
  }
}

