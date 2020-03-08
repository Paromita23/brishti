package com.hexaware.MLP178.persistence;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import java.util.List;
import com.hexaware.MLP178.model.Menu;
import org.skife.jdbi.v2.sqlobject.Bind;

/**
 * MenuDAO class used to fetch data from data base.
 * @author hexware
 */
public interface MenuDAO {
    /**
     * @return the all the Menu record.
     */
  @SqlQuery("Select * from Menu")
    @Mapper(MenuMapper.class)
    List<Menu> show();

     /**
      *@param menuId fro reading name.
     * @return the all the Menu record.
     */
  @SqlQuery("Select * from Menu where MEN_ID = :menuId")
  @Mapper(MenuMapper.class)
  Menu findByMenuId(@Bind("menuId") int menuId);

}
