package com.hexaware.mlp178.factory;

import java.util.List;

//import com.hexaware.mlp178.model;
import com.hexaware.mlp178.model.Agent;
import com.hexaware.mlp178.persistence.AgentDAO;
import com.hexaware.mlp178.persistence.DbConnection;

public class AgentFactory {
  
  protected AgentFactory() {

  }
  
  private static AgentDAO dao() {
    DbConnection db = new DbConnection();
    return db.getConnect().onDemand(AgentDAO.class);
  }
  public static Agent[] showAgent() {
    List<Agent> agent = dao().show();
    return agent.toArray(new Agent[agent.size()]);
  }
  public static String insertAgent(final Agent agent) {
    // Agent agent1 = dao().show(agent.getAgentId());
     dao().insertintoagent(agent);
     return "Agent inserted...";
  }
  public static Agent searchAgent(int agentId) {
     Agent agent = dao().searchById(agentId);
     return agent;
  }

}
