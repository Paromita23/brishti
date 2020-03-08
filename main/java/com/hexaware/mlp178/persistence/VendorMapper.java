package com.hexaware.MLP178.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.hexaware.MLP178.model.Vendor;

import org.skife.jdbi.v2.tweak.ResultSetMapper;
import org.skife.jdbi.v2.StatementContext;
/**
 * MenuMapper class used to fetch menu data from database.
 * @author hexware
 */
public class VendorMapper implements ResultSetMapper<Vendor> {
    /**
     * @param idx the index
     * @param rs the resultset
     * @param ctx the context
     * @return the mapped customer object
     * @throws SQLException in case there is an error in fetching data from the resultset
     */
  public final Vendor map(final int idx, final ResultSet rs, final StatementContext ctx) throws SQLException {
      /**
       * @return Menu
       */
    //String category = rs.getString("MEN_CAT");
    //MenuCat mcat = MenuCat.valueOf(category);
    return new Vendor(rs.getInt("VEN_ID"), rs.getString("VEN_NAME"),
    rs.getString("VEN_USERNAME"), rs.getString("VEN_PHNO"), rs.getString("VEN_EMAIL"),
    rs.getString("VEN_PWD"));
  }
}
