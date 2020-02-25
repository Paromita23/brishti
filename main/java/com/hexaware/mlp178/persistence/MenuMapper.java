package com.hexaware.MLP178.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.hexaware.MLP178.model.MenuCat;
import com.hexaware.MLP178.model.Menu;

import org.skife.jdbi.v2.tweak.ResultSetMapper;
import org.skife.jdbi.v2.StatementContext;
/**
 * MenuMapper class used to fetch menu data from database.
 * @author hexware
 */
public class MenuMapper implements ResultSetMapper<Menu> {
    /**
     * @param idx the index
     * @param rs the resultset
     * @param ctx the context
     * @return the mapped customer object
     * @throws SQLException in case there is an error in fetching data from the resultset
     */
  public final Menu map(final int idx, final ResultSet rs, final StatementContext ctx) throws SQLException {
      /**
       * @return Menu
       */
    String category = rs.getString("MEN_CAT");
    MenuCat mcat = MenuCat.valueOf(category);
    return new Menu(rs.getInt("MEN_ID"), mcat, rs.getString("Men_Item"),
    rs.getInt("Men_Quantity"), rs.getInt("Men_Cost"), rs.getInt("Men_Calories"),
    rs.getString("Men_Reviews"));
  }
}
