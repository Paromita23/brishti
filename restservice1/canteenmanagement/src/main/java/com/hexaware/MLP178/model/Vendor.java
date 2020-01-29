package com.hexaware.MLP178.model;
import java.util.Objects;

/**
 * Menu class used to display menu information.
 * @author hexware
 */
public class Vendor {

/**
 * vendorId to store vendorId.
 */
  private int vendorId;
  /**
 * vendorName to store vendorname.
 */
  private String vendorName;
  /**
 * vendorUsername to store username.
 */
  private String vendorUsername;
  /**
 * vendorNumber to store phone number.
 */
  private String vendorNumber;
  /**
 * vendorEmail to store email.
 */
  private String vendorEmail;
  /**
 * vendorPassword to store password.
 */
  private String vendorPassword;
  /**
   * Default Constructor.
   */
  public Vendor() {

  }
/**
 * @param argVendorId to initialize vendor id.
 * used to get details through constructor.
  * @param argVendorName to initialize food price.
 * @param argVendorUsername to initialize food Detail.
 * @param argVendorNumber to initialize food Status.
 * @param argVendorEmail to initialize food Rating.
 * @param argVendorPassword to initialize food Rating.
 */
  public Vendor(final int argVendorId, final String argVendorName, final String argVendorUsername, final String argVendorNumber,
      final String argVendorEmail, final String argVendorPassword) {
    this.vendorId = argVendorId;
    this.vendorName = argVendorName;
    this.vendorUsername = argVendorUsername;
    this.vendorNumber = argVendorNumber;
    this.vendorEmail = argVendorEmail;
    this.vendorPassword = argVendorPassword;
  }
  @Override
    public final boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Vendor vendor = (Vendor) obj;
    if (Objects.equals(vendorId, vendor.vendorId)) {
      return true;
    }
    return false;
  }
  @Override
    public final int hashCode() {
    return Objects.hash(vendorId);
  }
  @Override
    public final String toString() {
    return String.format("%15s %15s %15s %15s %15s %15s", vendorId, vendorName, vendorUsername,
    vendorNumber, vendorEmail, vendorPassword);
  }
    /**
     * @return this food ID.
     */
  public final int getVendorId() {
    return vendorId;
  }
    /**
     * @param argVendorId gets the food id.
     */
  public final void setVendorId(final int argVendorId) {
    this.vendorId = argVendorId;
  }
  /**
     * @return this vendorname.
     */
  public final String getVendorName() {
    return vendorName;
  }
  /**
     * @param argVendorName gets the NAME.
     */
  public final void setVendorName(final String argVendorName) {
    this.vendorName = argVendorName;
  }
    /**
     * @return this username.
     */
  public final String getVendorUsername() {
    return vendorUsername;
  }
  /**
   * @param argVendorUsername gets the username.
   */
  public final void setVendorUsername(final String argVendorUsername) {
    this.vendorUsername = argVendorUsername;
  }
   /**
     * @return this NUMBER.
     */
  public final String getVendorNumber() {
    return vendorNumber;
  }
  /**
   * @param argVendorNumber gets the number.
   */
  public final void setVendorNumber(final String argVendorNumber) {
    this.vendorNumber = argVendorNumber;
  }
  /**
     * @return this eamil adderss.
     */
  public final String getVendorEmail() {
    return vendorEmail;
  }
  /**
   * @param argVendorEmail gets the email address.
   */
  public final void setVendorEmail(final String argVendorEmail) {
    this.vendorEmail = argVendorEmail;
  }
  /**
     * @return this password.
     */
  public final String getVendorPassword() {
    return vendorPassword;
  }
  /**
   * @param argVendorPassword gets the password.
   */
  public final void setVendorPassword(final String argVendorPassword) {
    this.vendorPassword = argVendorPassword;
  }
}
