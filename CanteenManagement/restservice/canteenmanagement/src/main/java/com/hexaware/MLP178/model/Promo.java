package com.hexaware.MLP178.model;
/**
 * Wallet class used to display wallet information.
 * @author hexware
 */
public class Promo {
/**
 * wallId to store walletId.
 */
  private int promoId;
  /**
 * wallType to store Wallet Type.
 */
  private PromoCode promoCode;
   /**
 * wallAmount to store wallet Amount.
 */
  private int promoAmount;
  /**
 * cusId to store customer id.
 */
  private int cusId;
 /**
 * wallStatus to store Wall Status.
 */
  private PromoStatus promoStatus;
  /**
   * Default Constructor.
   */
  public Promo() {


  }
/**
 * @param argPromoId to initialize wallet id.
 * @param argPromoCode to initialize wallet Type.
 * @param argPromoAmount to initialize wallet Amount.
 * @param argCusId to initialize customer id.


 * used to get details through constructor.
 */
  public Promo(final int argPromoId, final PromoCode argPromoCode, final int argPromoAmount,
      final int argCusId, final PromoStatus argPromoStatus) {
    this.promoId = argPromoId;
    this.promoCode = argPromoCode;
    this.promoAmount = argPromoAmount;
    this.cusId = argCusId;
    this.promoStatus = argPromoStatus;
  }
  @Override
  public final String toString() {
    return String.format("%-15s %-15s %-15s %-15s %-15s", promoId, promoCode, promoAmount, cusId, promoStatus);
  }
    /**
     * @return this wallet ID.
     */
  public final int getpromoId() {
    return promoId;
  }
    /**
     * @param argPromoId gets the wallet id.
     */
  public final void setPromoId(final int argPromoId) {
    this.promoId = argPromoId;
  }
      /**
     * @return this wallet type.
     */
  public final PromoCode promoCode() {
    return promoCode;
  }
      /**
       * @param argpromoCode gets the wallet type.
       */
  public final void setpromoCode(final PromoCode argPromoCode) {
    this.promoCode = argPromoCode;
  }
       /**
     * @return this WallAmount.
     */
  public final int getpromoAmount() {
    return promoAmount;
  }
        /**
         * @param argpromoAmount gets the customer id.
         */
  public final void setpromoAmount(final int argpromoAmount) {
    this.promoAmount = argpromoAmount;
  }
     /**
     * @return this customer id.
     */
  public final int getCusId() {
    return cusId;
  }
        /**
         * @param argCusId gets the customer id.
         */
  public final void setCusId(final int argCusId) {
    this.cusId = argCusId;
  }
  /**
     * @return this customer id.
     */
    public final PromoStatus getPromoStatus() {
      return promoStatus;
    }
          /**
           * @param argPromostatus gets the customer id.
           */
    public final void setPromoStatus(final PromoStatus argPromoStatus) {
      this.promoStatus = argPromoStatus;
    }
}

