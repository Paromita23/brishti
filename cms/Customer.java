<<<<<<< HEAD
package com.hexaware.MLP178.model;
import java.util.Objects;
/**
 * Menu class used to display menu information.
 * @author paromita
 */
public class Customer {
/**
 * cusId to store cutomer id.
 */
  private int cusId;
/**
 * cusName to store customer name.
 */
  private String cusName;
/**
 * cusEmail to store customer email.
 */
  private String cusEmail;
/**
 * cusPhno to store customer phn no.
 */
  private String cusPhno;
  /**
 * cusAddress to store customer address.
 */
  private String cusAddress;
  /**
 * cusPassword to customer password.
 */
  private String cusPassword;
   /**
 * cusUsername to store customer username.
 */
  private String cusUsername;
  /**
   * Default Constructor.
   */
  public Customer() {

  }
/**
 * @param argCusId to initialize food id.
 * used to get details through constructor.
 */
  public Customer(final int argCusId) {
    this.cusId = argCusId;
  }
  @Override
    public final boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Customer customer = (Customer) obj;
    if (Objects.equals(cusId, customer.cusId)) {
      return true;
    }
    return false;
  }
  @Override
    public final int hashCode() {
    return Objects.hash(cusId);
  }
   /**
     * @return this customer ID.
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
         * @return this Customer name.
         */
  public final String getCusName() {
    return cusName;
  }
      /**
         * @param argCusName gets the customer name.
         */
  public final void setCusName(final String argCusName) {
    this.cusName = argCusName;
  }
        /**
         * @return this customer email.
         */
  public final String getCusEmail() {
    return cusEmail;
  }
      /**
       * @param argCusEmail gets the customer email.
       */
  public final void setMenuItem(final String argCusEmail) {
    this.cusEmail = argCusEmail;
  }
       /**
         * @return this customer phn no.
         */
  public final String getCusPhno() {
    return cusPhno;
  }
      /**
       * @param argCusPhno gets the customer phn no.
       */
  public final void setCusPhno(final String argCusPhno) {
    this.cusPhno = argCusPhno;
  }
      /**
         * @return this customer address.
         */
  public final String getCusAddress() {
    return cusAddress;
  }
      /**
       * @param argCusAddress gets the customer address.
       */
  public final void setCusAddress(final String argCusAddress) {
    this.cusAddress = argCusAddress;
  }
      /**
         * @return this customer password.
         */
  public final String getCusPassword() {
    return cusPassword;
  }
      /**
       * @param argCusPassword gets the menu Quantity.
       */
  public final void setCusPassword(final String argCusPassword) {
    this.cusPassword = argCusPassword;
  }
      /**
         * @return this customer username.
         */
  public final String getCusUsername() {
    return cusUsername;
  }
      /**
       * @param argCusUsername gets the customer username.
       */
  public final void setCusUsername(final String argCusUsername) {
    this.cusUsername = argCusUsername;
  }
}
=======
package com.hexaware.MLP178.model;
import java.util.Objects;
/**
 * Menu class used to display menu information.
 * @author paromita
 */
public class Customer {
/**
 * cusId to store cutomer id.
 */
  private int cusId;
/**
 * cusName to store customer name.
 */
  private String cusName;
/**
 * cusEmail to store customer email.
 */
  private String cusEmail;
/**
 * cusPhno to store customer phn no.
 */
  private String cusPhno;
  /**
 * cusAddress to store customer address.
 */
  private String cusAddress;
  /**
 * cusPassword to customer password.
 */
  private String cusPassword;
   /**
 * cusUsername to store customer username.
 */
  private String cusUsername;
  /**
   * Default Constructor.
   */
  public Customer() {

  }
/**
 * @param argCusId to initialize food id.
 * used to get details through constructor.
 */
  public Customer(final int argCusId) {
    this.cusId = argCusId;
  }
  @Override
    public final boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Customer customer = (Customer) obj;
    if (Objects.equals(cusId, customer.cusId)) {
      return true;
    }
    return false;
  }
  @Override
    public final int hashCode() {
    return Objects.hash(cusId);
  }
   /**
     * @return this customer ID.
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
         * @return this Customer name.
         */
  public final String getCusName() {
    return cusName;
  }
      /**
         * @param argCusName gets the customer name.
         */
  public final void setCusName(final String argCusName) {
    this.cusName = argCusName;
  }
        /**
         * @return this customer email.
         */
  public final String getCusEmail() {
    return cusEmail;
  }
      /**
       * @param argCusEmail gets the customer email.
       */
  public final void setMenuItem(final String argCusEmail) {
    this.cusEmail = argCusEmail;
  }
       /**
         * @return this customer phn no.
         */
  public final String getCusPhno() {
    return cusPhno;
  }
      /**
       * @param argCusPhno gets the customer phn no.
       */
  public final void setCusPhno(final String argCusPhno) {
    this.cusPhno = argCusPhno;
  }
      /**
         * @return this customer address.
         */
  public final String getCusAddress() {
    return cusAddress;
  }
      /**
       * @param argCusAddress gets the customer address.
       */
  public final void setCusAddress(final String argCusAddress) {
    this.cusAddress = argCusAddress;
  }
      /**
         * @return this customer password.
         */
  public final String getCusPassword() {
    return cusPassword;
  }
      /**
       * @param argCusPassword gets the menu Quantity.
       */
  public final void setCusPassword(final String argCusPassword) {
    this.cusPassword = argCusPassword;
  }
      /**
         * @return this customer username.
         */
  public final String getCusUsername() {
    return cusUsername;
  }
      /**
       * @param argCusUsername gets the customer username.
       */
  public final void setCusUsername(final String argCusUsername) {
    this.cusUsername = argCusUsername;
  }
}
>>>>>>> 94efc40dcb80642c275cc9a8e864ed8eee42c31a
