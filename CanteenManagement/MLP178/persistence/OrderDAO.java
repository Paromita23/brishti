package com.hexaware.MLP178.persistence;

import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import java.util.List;
import org.skife.jdbi.v2.sqlobject.Bind;
import com.hexaware.MLP178.model.Orders;
import com.hexaware.MLP178.model.Menu;
import com.hexaware.MLP178.model.Wallet;
import com.hexaware.MLP178.model.Freegift;
import com.hexaware.MLP178.model.GstDemo;
import com.hexaware.MLP178.model.WalletType;
import org.skife.jdbi.v2.sqlobject.GetGeneratedKeys;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.BindBean;
/**
 * MenuDAO class used to fetch data from data base.
 * @author hexware
 */
public interface OrderDAO {
    /**
     * @return the all the Menu record.
     */
  @SqlQuery("Select * from Orders")
    @Mapper(OrderMapper.class)
    List<Orders> show();
  /**
     * @param custId for pending orders.
     * @return the all the Pending Customer Orders.
     */
  @SqlQuery("Select * from ORDERS WHERE CUS_ID=:custId")
    @Mapper(OrderMapper.class)
    List<Orders> customerHistory(@Bind("custId") int custId);
  /**
     * @param vendId for pending orders.
     * @return the all the Vendor Orders.
     */
  @SqlQuery("Select * from ORDERS WHERE VEN_ID=:vendId")
    @Mapper(OrderMapper.class)
    List<Orders> vendorHistory(@Bind("vendId") int vendId);
     /**
     * @param custId for pending orders.
     * @return the all the Pending Customer Orders.
     */
  @SqlQuery("Select * from ORDERS WHERE CUS_ID=:custId AND ORD_STATUS='PENDING'")
    @Mapper(OrderMapper.class)
    List<Orders> pendingCustomer(@Bind("custId") int custId);
    /**
     * @param vendId for pending orders.
     * @return the all the Pending Vendor Orders.
     */
  @SqlQuery("Select * from ORDERS WHERE VEN_ID=:vendId AND ORD_STATUS='PENDING'")
    @Mapper(OrderMapper.class)
    List<Orders> pendingVendor(@Bind("vendId") int vendId);
    /**
     * @param menId for menu details.
     * @return the all the Menu record.
     */
  @SqlQuery("Select * from MENU WHERE MEN_ID=:menId")
    @Mapper(MenuMapper.class)
    Menu findByMenuId(@Bind("menId") int menId);
    /**
     * @param ordId for Order details.
     * @return the all the Order single record.
     */
  @SqlQuery("Select * from ORDERS WHERE ORD_ID=:ordId")
    @Mapper(OrderMapper.class)
    Orders findByOrderId(@Bind("ordId") int ordId);
     /**
    * @param ordStatus for Status Update.
    * @param ordId for Order to Update.
    * @return the status.
    */

  @SqlUpdate("UPDATE ORDERS SET ORD_STATUS=:ordStatus WHERE ORD_ID=:ordId")
  int acceptOrReject(@Bind("ordStatus") String ordStatus, @Bind("ordId") int ordId);
    /**
     * @param walType for walet Info.
     * @param cusId for read customer info.
     * @return the all the Menu record.
     */
  @SqlQuery("Select * from WALLET WHERE WAL_TYPE=:walType AND CUS_ID=:cusId")
    @Mapper(WalletMapper.class)
    Wallet getWalletInfo(@Bind("walType") WalletType walType, @Bind("cusId") int cusId);

  /**
 * @param venId for Order details.
 * @return the all the Order single record.
 */
  @SqlQuery("select sum((ORD_TOTAL_AMT*5)/100) from ORDERS where ven_id=:venId and month(ORD_DATE)=month(curdate())")
    double findByGst(@Bind("venId") int venId);

  /**
   * 
   * @param order for order details.
   * @return the order single record.
   */
    @SqlUpdate("INSERT INTO GstDemo(venId, Cgst, Sgst, monthNo) VALUES(:venId, :cgst, :sgst, :monthNo)")
@GetGeneratedKeys
int payGst(@BindBean GstDemo order);
    /**
   * @param walAmount for Updated Balance.
   * @param walType for Which walet to update.
   * @param cusId for which customer to update.
   * @return the showPrice.
   */
  @SqlUpdate("UPDATE WALLET SET WAL_AMOUNT=:walAmount WHERE WAL_TYPE=:walType AND CUS_ID=:cusId")
  int updateBalance(@Bind("walAmount") double walAmount, @Bind("walType") String walType,
          @Bind("cusId") int cusId);
     /**
    * @param order to initialize order.
     * @return the showPrice.
     */

  @SqlUpdate("INSERT INTO ORDERS(ORD_ID, CUS_ID, VEN_ID, MEN_ID,"
      + "ORD_STATUS, ORD_COMMENTS, ORD_TOTAL_AMT, ORD_DATE, ORD_QTY , WAL_TYPE) "
      + " VALUES(:orderId, :customerId, :vendorId, :menuId, :orderStatus,"
      + ":orderComments, :orderTotalamount, :orderDate, :orderQuantity, :walletType);")
    @GetGeneratedKeys
  int placeOrder(@BindBean Orders order);

   /**
    * @param walAmount for Updated Balance.
    * @param walType for Which walet to update.
    * @param cusId for which customer to update.
     * @return the showPrice.
     */
  @SqlUpdate("UPDATE WALLET SET WAL_AMOUNT=:walAmount WHERE WAL_TYPE=:walType AND CUS_ID=:cusId")
  int updateBalance(@Bind("walAmount") double walAmount, @Bind("walType") WalletType walType,
          @Bind("cusId") int cusId);
  /**
    * @param refundAmount for refund canceled order.
    * @param walType for Which walet to refund.
    * @param cusId for which refund to update.
     * @return the refund status.
     */
  @SqlUpdate("UPDATE WALLET SET WAL_AMOUNT=WAL_AMOUNT+:refundAmount WHERE WAL_TYPE=:walType AND CUS_ID=:cusId")
  int refundAmount(@Bind("refundAmount") double refundAmount, @Bind("walType") WalletType walType,
      @Bind("cusId") int cusId);
      
  /**
    * @param order to initialize order.
    * @return the showPrice.
  */

  @SqlUpdate("insert into Freegift(CUS_ID,VEN_ID,GIFTSTAT) values(:custId,:venId,:giftStat);")
  @GetGeneratedKeys
int place(@BindBean Freegift fregft);

 /**
    * @param gftstats for Which walet to refund.
    * @param cusId for which refund to update.
     * @return the refund status.
     */
    
  @SqlUpdate("UPDATE FREEGIFT SET giftstat=:gftstats WHERE CUS_ID=:cusId")
  int updategft(@Bind("gftstats") int gftstats, @Bind("cusId") int cusId);
        /**
    @param cusid for accepting cusid
    @return count for authentication.
     */
     @SqlQuery("select count(*) from Orders where Cus_id=:cusid AND Ord_date=curdate() and Ord_date between '2020-02-26' AND '2020-03-04';")
     int counts(@Bind("cusid") int cusid);
     /**
    @param cusid for accepting cusid
    @return count for authentication.
     */
    @SqlQuery("select count(*) from orders where Ord_date=curdate() and cus_id =:cusid;")
    int placecount(@Bind("cusid") int cusid);

     /**
     * @param CUSid for read customer info.
     * @return the all the Menu record.
     */
  @SqlQuery("select Sum(ORD_TOTAL_AMT) from Orders where Cus_id=:CUSid  AND Ord_date=curdate() AND Ord_date between '2020-02-26' AND '2020-03-04';")
  double sumofamnt(@Bind("CUSid") int CUSid);
  
  /**
   * @param cusId for customer id.
   * @param promoCode for promo code.
   * @return the promo codes.
   */
  @SqlUpdate("UPDATE Promo SET PROMO_STATUS='INACTIVE' WHERE PROMO_CODE=:promoCode AND CUS_ID=:cusId")
  int updatePromo(@Bind("cusId") int cusId,@Bind("promoCode") String promoCode);
}

