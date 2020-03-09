package com.hexaware.MLP178.persistence;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import java.util.List;
import com.hexaware.MLP178.model.Freegift;
//import org.skife.jdbi.v2.sqlobject.Bind;

/**
 * MenuDAO class used to fetch data from data base.
 * @author hexware
 */
public interface FreegiftDAO {
    /**
     * @return the all the Menu record.
     */
  @SqlQuery("Select * from FREEGIFT")
    @Mapper(FreegiftMapper.class)
    List<Freegift> show();
}