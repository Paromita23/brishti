<<<<<<< HEAD:restservice/canteenmanagement/src/main/java/com/hexaware/MLP178/persistence/WalletDAO.java
package com.hexaware.MLP178.persistence;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import java.util.List;
import com.hexaware.MLP178.model.Wallet;
import org.skife.jdbi.v2.sqlobject.Bind;
/**
 * MenuDAO class used to fetch data from data base.
 * @author hexware
 */
public interface WalletDAO {
   /**
    * @return the all the Menu record.
    */
  @SqlQuery("Select * from Wallet")
    @Mapper(WalletMapper.class)
    List<Wallet> show();
        /**
     * @param cusId for input customer id.
     * @return the all the wallet records of customer.
     */
  @SqlQuery("SELECT * FROM WALLET WHERE CUS_ID=:cusId")
    @Mapper(WalletMapper.class)
    List<Wallet> showByWalletId(@Bind("cusId") int cusId);
}
=======
<<<<<<< HEAD
package com.hexaware.MLP178.persistence;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import java.util.List;
import com.hexaware.MLP178.model.Wallet;
import org.skife.jdbi.v2.sqlobject.Bind;
/**
 * MenuDAO class used to fetch data from data base.
 * @author hexware
 */
public interface WalletDAO {
    /**
     * @return the all the Menu record.
     */
  @SqlQuery("Select * from Wallet")
    @Mapper(WalletMapper.class)
    List<Wallet> show();
     /**
     * @param cusId for input customer id.
     * @return the all the wallet records of customer.
     */
  @SqlQuery("SELECT * FROM WALLET WHERE CUS_ID=:cusId")
  @Mapper(WalletMapper.class)
  List<Wallet> showByWalletId(@Bind("cusId") int cusId);
}
=======
package com.hexaware.MLP178.persistence;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import java.util.List;
import com.hexaware.MLP178.model.Wallet;
import org.skife.jdbi.v2.sqlobject.Bind;
/**
 * MenuDAO class used to fetch data from data base.
 * @author hexware
 */
public interface WalletDAO {
    /**
     * @return the all the Menu record.
     */
  @SqlQuery("Select * from Wallet")
    @Mapper(WalletMapper.class)
    List<Wallet> show();
     /**
     * @param cusId for input customer id.
     * @return the all the wallet records of customer.
     */
  @SqlQuery("SELECT * FROM WALLET WHERE CUS_ID=:cusId")
  @Mapper(WalletMapper.class)
  List<Wallet> showByWalletId(@Bind("cusId") int cusId);
}
>>>>>>> 94efc40dcb80642c275cc9a8e864ed8eee42c31a
>>>>>>> 22cc0e1bffcf3bc802af6909eb8eb2a884ff1ee4:WalletDAO.java
