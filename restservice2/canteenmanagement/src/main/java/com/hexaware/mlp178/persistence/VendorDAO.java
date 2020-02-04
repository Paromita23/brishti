package com.hexaware.MLP178.persistence;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import java.util.List;
import com.hexaware.MLP178.model.Vendor;
import org.skife.jdbi.v2.sqlobject.Bind;
/**
 * MenuDAO class used to fetch data from data base.
 * @author hexware
 */
public interface VendorDAO {
    /**
     * @return the all the Menu record.
     */
  @SqlQuery("Select * from Vendor")
    @Mapper(VendorMapper.class)
    List<Vendor> show();
     /**
    * @param vendorName fro reading name.
    @return the selected record.
    */
  @SqlQuery("Select * from VENDOR WHERE VEN_NAME =:vendorName")
    @Mapper(VendorMapper.class)
    Vendor findByVendorName(@Bind("vendorName")String vendorName);
    /**
    @param vendorName for accepting name
    @param vendorPassword fro pass.
    @return count for authentication.
     */
  @SqlQuery("SELECT COUNT(*) FROM VENDOR WHERE VEN_NAME =:vendorName AND VEN_PWD=:vendorPassword")
     int authenticate(@Bind("vendorName") String vendorName, @Bind("vendorPassword") String vendorPassword);
}
