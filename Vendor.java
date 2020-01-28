package com.hexaware.MLP178.model;
import java.util.Objects;
/**
 * Menu class used to display menu information.
 * @author paromita
 */
public class Vendor {
/**
 * venId to store vendor id.
 */
  private int venId;
/**
 * venName to store vendor name.
 */
  private String venName;
/**
 * venUsername to store vendor username.
 */
  private String venUsername;
/**
 * venPhno to store vendor phn no.
 */
  private String venPhno;
  /**
 * venEmail to store vendor email.
 */
  private String venEmail;
  /**
 * venPassword to customer password.
 */
  private String venPassword;
  /**
   * Default Constructor.
   */
  public Vendor() {

  }
  /**
 * @param argVenId to initialize food id.
 * used to get details through constructor.
 */
  public Vendor(final int argVenId) {
    this.venId = argVenId;
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
    if (Objects.equals(venId, vendor.venId)) {
      return true;
    }
    return false;
  }
  @Override
    public final int hashCode() {
    return Objects.hash(venId);
  }
  /**
     * @return this customer ID.
     */
  public final int getVenId() {
    return venId;
  }
            /**
             * @param argVenId gets the vendor id.
             */
  public final void setVenId(final int argVenId) {
    this.venId = argVenId;
  }
          /**
             * @return this Vendor name.
             */
  public final String getVenName() {
    return venName;
  }
          /**
             * @param argVenName gets the vendor name.
             */
  public final void setVenName(final String argVenName) {
    this.venName = argVenName;
  }
            /**
             * @return this vendor username.
             */
  public final String getVenUsername() {
    return venUsername;
  }
          /**
           * @param argVenUsername gets the vendor username.
           */
  public final void setVenUsername(final String argVenUsername) {
    this.venUsername = argVenUsername;
  }
           /**
             * @return this vendor phn no.
             */
  public final String getVenPhno() {
    return venPhno;
  }
          /**
           * @param argVenPhno gets the vendor phn no.
           */
  public final void setVenPhno(final String argVenPhno) {
    this.venPhno = argVenPhno;
  }
/**
* @return this vendor username.
 */
  public final String getVenEmail() {
    return venEmail;
  }
    /**
     * @param argVenEmail gets the vendor username.
    */
  public final void setVenEmail(final String argVenEmail) {
    this.venEmail = argVenEmail;
  }
          /**
             * @return this vendor password.
             */
  public final String getVenPassword() {
    return venPassword;
  }
          /**
           * @param argVenPassword gets the Vendor password.
           */
  public final void setVenPassword(final String argVenPassword) {
    this.venPassword = argVenPassword;
  }
}
