package com.hexaware.MLP178.model;
import java.util.Objects;

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
 * @param argCustomerName to initialize food price.
 * @param argCustomerEmail to initialize food Detail.
 * @param argCustomerNumber to initialize food Status.
 * @param argCustomerAddress to initialize food Rating.
 * @param argCustomerPassword to initialize food Rating.
 * @param argCustomerUsername to initialize food Rating.
 * used to get details through constructor.
 */
  public Customer(final int argCustomerId, final String argCustomerName, final String argCustomerEmail,
        final String argCustomerNumber, final String argCustomerAddress, final String argCustomerPassword,
      final String argCustomerUsername) {
    this.customerId = argCustomerId;
    this.customerName = argCustomerName;
    this.customerEmail = argCustomerEmail;
    this.customerNumber = argCustomerNumber;
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
     customerNumber,  customerAddress, customerPassword, customerUsername);
  }
  @Override
  public final String toString() {
    return String.format("%10s %10s %10s %10s %10s %10s %10s", customerId, customerName,  customerUsername,
     customerEmail, customerNumber,  customerAddress, customerPassword);
  }
    /**
     * @return this food ID.
     */
  public final int getCustomerId() {
    return customerId;
  }
    /**
     * @param argCustomerId gets the food id.
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
