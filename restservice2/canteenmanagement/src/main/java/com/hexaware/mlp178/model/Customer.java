package com.hexaware.mlp178.model;
import java.util.Objects;
import java.util.Date;

/**
 * Menu class used to display menu information.
 * @author hexware
 */
public class Customer {

/**
 * customerId to store customerId.
 */
  private int customerId;
  /**
 * customerName to store customer name.
 */
  private String customerName;
  /**
 * customerEmail to store mailid.
 */
  private String customerEmail;
  /**
 * customerNumber to store phone number.
 */
  private String customerNumber;
  /**
 * customerDOB to store customer date of birth.
 */
  private Date customerDOB;
  /**
 * customerAddress to store address.
 */
  private String customerAddress;
  /**
 * customerPassword to store password.
 */
  private String customerPassword;
   /**
 * customerUsername to store username.
 */
  private String customerUsername;
  /**
   * Default Constructor.
   */
  public Customer() {

  }
/**
 * @param argCustomerId to initialize customer id.
 * used to get details through constructor.
 * @param argCustomerName to initialize customer name.
 * @param argCustomerEmail to initialize customer email.
 * @param argCustomerNumber to initialize customer phn no.
 * @param argCustomerDOB to initialize customer date of birth
 * @param argCustomerAddress to initialize customer address.
 * @param argCustomerPassword to initialize customer password.
 * @param argCustomerUsername to initialize customer username.
 * used to get details through constructor.
 */
  public Customer(final int argCustomerId, final String argCustomerName, final String argCustomerEmail,
        final String argCustomerNumber, final Date argCustomerDOB, final String argCustomerAddress, final String argCustomerPassword,
      final String argCustomerUsername) {
    this.customerId = argCustomerId;
    this.customerName = argCustomerName;
    this.customerEmail = argCustomerEmail;
    this.customerNumber = argCustomerNumber;
    this.customerDOB = argCustomerDOB;
    this.customerAddress = argCustomerAddress;
    this.customerPassword = argCustomerPassword;
    this.customerUsername = argCustomerUsername;
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
    if (Objects.equals(customerId, customer.customerId)) {
      return true;
    }
    return false;
  }
  @Override
    public final int hashCode() {
    return Objects.hash(customerId, customerName, customerEmail,
     customerNumber, customerDOB, customerAddress, customerPassword, customerUsername);
  }
  @Override
  public final String toString() {
    return String.format("%10s %10s %10s %10s %10s %10s %10s %10s", customerId, customerName,  customerUsername,
     customerEmail, customerNumber, customerDOB, customerAddress, customerPassword);
  }
    /**
     * @return this customer ID.
     */
  public final int getCustomerId() {
    return customerId;
  }
    /**
     * @param argCustomerId gets the customer id.
     */
  public final void setCustomerId(final int argCustomerId) {
    this.customerId = argCustomerId;
  }
  /**
     * @return this cus name.
     */
  public final String getCustomerName() {
    return customerName;
  }
  /**
     * @param argCustomerName gets the NAME.
     */
  public final void setCustomerName(final String argCustomerName) {
    this.customerName = argCustomerName;
  }
    /**
     * @return this EMAIL.
     */
  public final String getCustomerEmail() {
    return customerEmail;
  }
  /**
   * @param argCustomerEmail gets the EMAIL.
   */
  public final void setCustomerEmail(final String argCustomerEmail) {
    this.customerEmail = argCustomerEmail;
  }
   /**
     * @return this NUMBER.
     */
  public final String getCustomerNumber() {
    return customerNumber;
  }
  /**
   * @param argCustomerNumber gets the number.
   */
  public final void setCustomerNumber(final String argCustomerNumber) {
    this.customerNumber = argCustomerNumber;
  }
  /**
     * @return this customer date of birth.
     */
    public final Date getCustomerDOB() {
      return customerDOB;
    }
      /**
       * @param argCustomerDOB gets the customer date of birth.
       */
    public final void setCustomerDOB(final Date argCustomerDOB) {
      this.customerDOB = argCustomerDOB;
    }
  /**
     * @return this adderss.
     */
  public final String getCustomerAddress() {
    return customerAddress;
  }
  /**
   * @param argCustomerAddress gets the address.
   */
  public final void setCustomerAddress(final String argCustomerAddress) {
    this.customerAddress = argCustomerAddress;
  }
  /**
     * @return this password.
     */
  public final String getCustomerPassword() {
    return customerPassword;
  }
  /**
   * @param argCustomerPassword gets the password.
   */
  public final void setCustomerPassword(final String argCustomerPassword) {
    this.customerPassword = argCustomerPassword;
  }
  /**
     * @return this username.
     */
  public final String getCustomerUsername() {
    return customerUsername;
  }
  /**
   * @param argCustomerUsername gets the USERNAME.
   */
  public final void setCustomerUsername(final String argCustomerUsername) {
    this.customerUsername = argCustomerUsername;
  }
}
