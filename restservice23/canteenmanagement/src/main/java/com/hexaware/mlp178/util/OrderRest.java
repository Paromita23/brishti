package com.hexaware.MLP178.util;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.hexaware.MLP178.model.Orders;
import com.hexaware.MLP178.factory.OrderFactory;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;


/**
 * This class provides a REST interface for the employee entity.
 */
@Path("/Orders")
public class OrderRest {
  /**
   * Returns Orders details.
   * @return the Orders details
   */
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public final Orders[] listOrders() {
    final Orders[] orders = OrderFactory.showOrder();
    return orders;
  }
  /**
   * Returns Menu details.
   * @param id to get name.
   * @return the menu details
   */
  @GET
  @Path("{id}")
  @Produces(MediaType.APPLICATION_JSON)
  public final Orders[] showCustomerHis(@PathParam("id") final int id) {
    final Orders[] cusid = OrderFactory.showCustomerHistory(id);
    return cusid;
  }
  /**
   * Returns Menu details.
   * @param venid to get name.
   * @return the menu details
   */
  @GET
  @Path("Ven/{venid}")
  @Produces(MediaType.APPLICATION_JSON)
  public final Orders[] showvendor(@PathParam("venid") final int venid) {
    final Orders[] vendorid = OrderFactory.showVendorHistory(venid);
    return vendorid;
  }
  /**
   * Returns Menu details.
   * @param ordid for cancel order.
   * @param custid for customer id.
   * @param status for status.
   * @return the cancelled order details
   */
  @POST
  @Path("CancelOrder/{ordid}/{custid}/{status}")
  @Produces(MediaType.APPLICATION_JSON)
  public final String cancelOrder(@PathParam("ordid") final int ordid, @PathParam("custid") final int custid,
                                  @PathParam("status") final String status) {
    String result = OrderFactory.cancelOrder(ordid, custid, status);
    return result;
  }
  /**
   * Returns Menu details.
   * @param order for cancel order.
   * @return the cancelled order details
   */
  @POST
  @Path("/placeOrder")
  @Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
  public final String placeorder(final Orders order) {
    String result = OrderFactory.placeOrder(order);
    return result;
  }
  /**
   * Approve or Deny order.
   * @return the Order details.
   * @param orderId for place order object.
   * @param vendorId for vendor id.
   * @param status for status
   */
  @POST
  @Path("/acceptOrRejectOrder/{orderId}/{vendorId}/{status}")
  @Produces(MediaType.APPLICATION_JSON)
   public final String acceptOrRejectOrder(@PathParam("orderId") final int orderId,
        @PathParam("vendorId") final int vendorId, @PathParam("status") final String status) {
    String result = OrderFactory.acceptOrRejectOrder(orderId, vendorId, status);
    return result;
  }
}
