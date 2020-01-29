package com.hexaware.mlp178.util;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.hexaware.mlp178.model.Order;

/**
 * This class provides a REST interface for the employee entity.
 */
@Path("/Order")
public class OrderRest {
  /**
   * Returns Order details.
   * @return the Order details
   */
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public final Order[] listOrder() {
    final Order[] order = OrderFactory.showOrder();
    return order;
  }
//   /**
//    * Returns Menu details.
//    * @param custId to get name.
//    * @return the menu details
//    */
//   @GET
//   @Path("{custId}")
//   @Produces(MediaType.APPLICATION_JSON)
//   public final Order[] OrderName(@PathParam("custId") final int custId) {
//     final Order[] venName = OrderFactory.showCustomerHistory(custId);
//     return venName;
//   }
//     /**
//    * Returns Menu details.
//    * @param vendorId to get name.
//    * @return the menu details
//    */
//   @GET
//   @Path("{vendorId}")
//   @Produces(MediaType.APPLICATION_JSON)
//   public final Order[] VenHis(@PathParam("vendorId") final int vendorId) {
//     final Order[] venName = OrderFactory.showVendorHistory(vendorId);
//     return venName;
//   }
}
