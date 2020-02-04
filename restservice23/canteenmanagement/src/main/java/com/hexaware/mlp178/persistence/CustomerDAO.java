package com.hexaware.MLP178.persistence;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import java.util.List;
import com.hexaware.MLP178.model.Customer;
import org.skife.jdbi.v2.sqlobject.Bind;
/**
 * MenuDAO class used to fetch data from data base.
 * @author hexware
 */
public interface CustomerDAO {
    /**
     * @return the all the Menu record.
     */
  @SqlQuery("Select * from CUSTOMER")
    @Mapper(CustomerMapper.class)
    List<Customer> show();
    /**
    * @param customerName fro reading name.
    @return the selected record.
    */
  @SqlQuery("Select * from CUSTOMER WHERE CUS_NAME =:customerName")
    @Mapper(CustomerMapper.class)
    Customer findByCustomerName(@Bind("customerName")String customerName);
    /**
    @param customerName for accepting name
    @param customerPassword fro pass.
    @return count for authentication.
     */
  @SqlQuery("SELECT COUNT(*) FROM CUSTOMER WHERE CUS_NAME =:customerName AND CUS_PASSWORD=:customerPassword")
     int authenticate(@Bind("customerName") String customerName, @Bind("customerPassword") String customerPassword);
}


