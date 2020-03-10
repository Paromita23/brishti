package com.hexaware.MLP178.model;

import java.util.Objects;

public class GstDemo {
    private int venId;
    private double cgst;
    private double sgst;
    private int monthNo;

    public GstDemo(){

    }
    /**
 * @param argVenId to initialize vendor id.
 * @param argCgst to initialize Cgst.
 * @param argSgst to initialize Sgst.
 * @param argMonthNo to initialize Month No.
 */
  public GstDemo(final int argVenId, final double argCgst, final double argSgst,
  final int argMonthNo) {
this.venId = argVenId;
this.cgst = argCgst;
this.sgst = argSgst;
this.monthNo = argMonthNo;
}

@Override
    public final boolean equals(final Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    GstDemo gst = (GstDemo) obj;
    if (Objects.equals(venId, gst.venId) && Objects.equals(cgst, gst.cgst)
        && Objects.equals(sgst, gst.sgst) && Objects.equals(monthNo, gst.monthNo)) {
      return true;
    }
    return false;
  }
  @Override
    public final int hashCode() {
    return Objects.hash(venId);
  }
  @Override
    public final String toString() {
    return String.format("%10s %10s %10s %10s", venId, cgst, sgst, monthNo);
  }
    /**
     * @return this vendor ID.
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
     * @return this cgst.
     */
    public final double getCgst() {
        return cgst;
      }
        /**
         * @param argCgst gets the cgst.
         */
      public final void setCgst(final double argCgst) {
    
        this.cgst = argCgst;
      }
             /**
     * @return this cgst.
     */
    public final double getSgst() {
        return sgst;
      }
        /**
         * @param argSgst gets the sgst.
         */
      public final void setSgst(final double argSgst) {
    
        this.sgst = argSgst;
      }
             /**
     * @return this cgst.
     */
    public final int getMonthNo() {
        return monthNo;
      }
        /**
         * @param argMonthNo gets the month no.
         */
      public final void setMonthNo(final int argMonthNo) {
    
        this.monthNo = argMonthNo;
      }
}