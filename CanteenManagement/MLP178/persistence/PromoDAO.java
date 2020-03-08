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
     * @return the all the Menu record.
     * @param cusId for showing customer id.
     */
  @SqlQuery("SELECT * FROM promo WHERE CUS_ID=:cusID and PROMO_STATUS='ACTIVE'")
    @Mapper(PromoMapper.class)
    List<Promo> showByPromoId(@Bind("cusID") int cusId);
   /**
     * @return the all the Wallet record.
     */
  @SqlQuery("SELECT * FROM promo")
    @Mapper(PromoMapper.class)
    List<Promo> show();


    @SqlQuery("SELECT COUNT(*) FROM PROMO WHERE PROMO_CODE=:promoCode and CUS_ID=:cusId")
    int authenticate(@Bind("promoCode") String promoCode, @Bind("cusId") int cusId);


    @SqlQuery("select * FROM PROMO P where P.PROMO_CODE = :promoCode and CUS_ID=:cusId;")
    @Mapper(PromoMapper.class)
    Promo validatePromo(@Bind("promoCode") String promoCode, @Bind("cusId") int cusId);


    @SqlQuery("SELECT * FROM PROMO WHERE CUS_ID=:cusId AND PROMO_STATUS='ACTIVE' AND PROMO_CODE=:promo")
    @Mapper(PromoMapper.class)
    Promo applyPromo(@Bind("cusId") int cusId, @Bind("promo") String promo);
    
}
