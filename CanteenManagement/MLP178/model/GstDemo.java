package com.hexaware.MLP178.model;

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
      public final void setMonth(final int argMonthNo) {
    
        this.monthNo = argMonthNo;
      }
}