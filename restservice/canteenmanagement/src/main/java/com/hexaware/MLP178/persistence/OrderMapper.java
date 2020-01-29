package com.hexaware.MLP178.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;
import com.hexaware.MLP178.model.WalletType;

import com.hexaware.MLP178.model.OrderStatus;
import com.hexaware.MLP178.model.Orders;

import org.skife.jdbi.v2.tweak.ResultSetMapper;
import org.skife.jdbi.v2.StatementContext;
/**
 * MenuMapper class used to fetch menu data from database.
 * @author hexware
 */
public class OrderMapper implements ResultSetMapper<Orders> {
    /**
     * @param idx the index
     * @param rs the resultset
     * @param ctx the context
     * @return the mapped customer object
     * @throws SQLException in case there is an error in fetching data from the resultset
     */
  public final Orders map(final int idx, final ResultSet rs, final StatementContext ctx) throws SQLException {
      /**
       * @return Menu
       */
    String status = rs.getString("ORD_STATUS");
    OrderStatus ostat = OrderStatus.valueOf(status);
    String type = rs.getString("WAL_TYPE");
    WalletType wtype = WalletType.valueOf(type);
    return new Orders(rs.getInt("ORD_ID"), rs.getInt("CUS_ID"),
    rs.getInt("VEN_ID"), rs.getInt("MEN_ID"), ostat, rs.getString("ORD_COMMENTS"),
    rs.getDouble("ORD_TOTAL_AMT"), rs.getDate("ORD_DATE"), rs.getInt("ORD_QTY"), wtype);
  }
}
