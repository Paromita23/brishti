package com.hexaware.MLP178.util;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.hexaware.MLP178.model.Vendor;
import com.hexaware.MLP178.factory.VendorFactory;

/**
 * This class provides a REST interface for the employee entity.
 */
@Path("/vendor")
public class VendorRest {
  /**
   * Returns Menu details.
   * @return the menu details
   */
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public final Vendor[] listVendor() {
    final Vendor[] vendor = VendorFactory.showVendor();
    return vendor;
  }
  /**
   * Returns Menu details.
   * @param name to get name.
   * @return the menu details
   */
  @GET
  @Path("{name}")
  @Produces(MediaType.APPLICATION_JSON)
  public final Vendor vendorName(@PathParam("name") final String name) {
    final Vendor venName = VendorFactory.findByVendorName(name);
    return venName;
  }
  /**
   * Returns Menu details.
   * @param user to get name.
   * @param password to get name.
   * @return the menu details
   */
  @GET
  @Path("/{user}/{password}")
  @Produces(MediaType.APPLICATION_JSON)
  public final int vendorID(@PathParam("user") final String user, @PathParam("password") final String password) {
    final int venName = VendorFactory.validateVendor(user, password);
    return venName;
  }
}

