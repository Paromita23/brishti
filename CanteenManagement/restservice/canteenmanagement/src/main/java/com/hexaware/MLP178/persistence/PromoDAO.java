package com.hexaware.MLP178.persistence;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import java.util.List;
import org.skife.jdbi.v2.sqlobject.Bind;
import com.hexaware.MLP178.model.Promo;
/**
 * WalletDAO class used to fetch data from data base.
 * @author hexware
 */
public interface PromoDAO {
   /**
     * @return the all the Wallet record.
     */
  @SqlQuery("SELECT * FROM promo")
    @Mapper(PromoMapper.class)
    List<Promo> show();


    // @SqlQuery("SELECT COUNT(*) FROM PROMO WHERE PROMO_CODE=:promoCode and VEN_ID=:cusId")
    // int authenticate(@Bind("promoCode") String promoCode, @Bind("cusId") int cusId);


    // @SqlQuery("select * FROM PROMO P where P.PROMO_CODE = :promoCode and VEN_ID=:cusId;")
    // @Mapper(PromoMapper.class)
    // Promo validatePromo(@Bind("promoCode") String promoCode, @Bind("cusId") int cusId);

  /**
   * @param cusId to store customer id.
   * @param promocode to show the promo code.
   * @return apply the coupon code.
   */
    @SqlQuery("SELECT * FROM PROMO WHERE VEN_ID=:cusId AND PROMO_CODE=:promocode")
    @Mapper(PromoMapper.class)
    Promo applyPromo(@Bind("cusId") int cusId, @Bind("promocode") String promocode);


    
}
