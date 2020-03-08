package com.hexaware.MLP178.util;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.hexaware.MLP178.model.Menu;
import com.hexaware.MLP178.factory.MenuFactory;
import javax.ws.rs.PathParam;


/**
 * This class provides a REST interface for the employee entity.
 */
@Path("/menu")
public class MenuRest {
  /**
   * Returns Menu details.
   * @return the menu details
   */
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public final Menu[] listMenu() {
    final Menu[] menu = MenuFactory.showMenu();
    return menu;
  }
  /**
   * Returns Menu details.
   * @param menuId tp read menu id.
   * @return the menu details
   */
  @GET
  @Path("showmenu/{menuId}")
  @Produces(MediaType.APPLICATION_JSON)
  public final Menu listMenu(@PathParam("menuId") final int menuId) {
    final Menu menu = MenuFactory.showMenu(menuId);
    return menu;
  }
}
