package com.hexaware.mlp178.persistence;

import java.util.List;

import com.hexaware.mlp178.model.Agent;

import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.GetGeneratedKeys;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

public interface AgentDAO {
  @SqlQuery("Select * from Agent")
    @Mapper(AgentMapper.class)
    List<Agent> show();

    @SqlQuery("Select * from Agent WHERE AgentId =:agentid")
     @Mapper(AgentMapper.class)
     Agent searchById(@Bind("agentid") int agentid);

    @SqlUpdate("INSERT INTO Agent(Agentid, name, city, gender, maritalStatus, premium)"
    + " VALUES(:agentId, :name, :city, :gender, :maritalStatus, :premium);")
    @GetGeneratedKeys
  int insertintoagent(@BindBean Agent Agent);
}
