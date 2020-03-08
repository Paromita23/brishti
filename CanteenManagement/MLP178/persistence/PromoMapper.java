package com.hexaware.MLP178.persistence;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.hexaware.MLP178.model.Promo;
import com.hexaware.MLP178.model.PromoCode;
import com.hexaware.MLP178.model.PromoStatus;


import org.skife.jdbi.v2.tweak.ResultSetMapper;
import org.skife.jdbi.v2.StatementContext;
/**
 * WalletMapper class used to fetch menu data from database.
 * @author hexware
 */
public class PromoMapper implements ResultSetMapper<Promo> {
    /**
     * @param idx the index
     * @param rs the resultset
     * @param ctx the context
     * @return the mapped customer object
     * @throws SQLException in case there is an error in fetching data from the resultset
     */
  public final Promo map(final int idx, final ResultSet rs, final StatementContext ctx) throws SQLException {
      /**
       * @return Wallet
       */
    String status = rs.getString("PROMO_CODE");
    PromoCode mstatus = PromoCode.valueOf(status);
    String status1 = rs.getString("PROMO_STATUS");
    PromoStatus mstatus1 = PromoStatus.valueOf(status1);
    return new Promo(rs.getInt("PROMO_ID"), mstatus, rs.getInt("PROMO_AMOUNT"), rs.getInt("CUS_ID"), mstatus1);
  }
}
