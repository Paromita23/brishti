package com.hexaware.MLP178.util;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.hexaware.MLP178.model.Freegift;
import com.hexaware.MLP178.factory.FreegiftFactory;
//import javax.ws.rs.PathParam;


/**
 * This class provides a REST interface for the employee entity.
 */
@Path("/freegift")
public class FreegiftRest {
  /**
   * Returns Menu details.
   * @return the menu details
   */
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public final Freegift[] listFreegift() {
    final Freegift[] menu = FreegiftFactory.showgft();
    return menu;
  }
}
