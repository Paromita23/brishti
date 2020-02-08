package com.hexaware.MLP178.util;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.hexaware.MLP178.model.Customer;
import com.hexaware.MLP178.factory.CustomerFactory;

/**
 * This class provides a REST interface for the employee entity.
 */
@Path("/Customer")
public class CustomerRest {
  /**
   * Returns Customer details.
   * @return the Customer details
   */
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public final Customer[] listCustomer() {
    final Customer[] customer = CustomerFactory.showCustomer();
    return customer;
  }
  /**
   * Returns Menu details.
   * @param name to get name.
   * @return the menu details
   */
  @GET
  @Path("{name}")
  @Produces(MediaType.APPLICATION_JSON)
  public final Customer customerName(@PathParam("name") final String name) {
    final Customer venName = CustomerFactory.findByCustomerName(name);
    return venName;
  }
  /**
   * Returns Menu details.
   * @param user to get name.
   * @param password to get name.
   * @return the menu details
   */
  @GET
  @Path("{user}/{password}")
  @Produces(MediaType.APPLICATION_JSON)
  public final int customerID(@PathParam("user") final String user, @PathParam("password") final String password) {
    final int venName = CustomerFactory.validateCustomer(user, password);
    return venName;
  }
}
