<<<<<<< HEAD
package com.hexaware.mlp178.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.hexaware.mlp178.model.AgentCat;
import com.hexaware.mlp178.model.Agent;

import org.skife.jdbi.v2.tweak.ResultSetMapper;
import org.skife.jdbi.v2.StatementContext;

public class AgentMapper implements ResultSetMapper<Agent> {
    /**
     * @param idx the index
     * @param rs the resultset
     * @param ctx the context
     * @return the mapped customer object
     * @throws SQLException in case there is an error in fetching data from the resultset
     */
  public final Agent map(final int idx, final ResultSet rs, final StatementContext ctx) throws SQLException {
      /**
       * @return Menu
       */
    String gender = rs.getString("GENDER");
    AgentCat mcat = AgentCat.valueOf(gender);
    return new Agent(rs.getInt("AgentId"), rs.getString("Name"),
    rs.getString("City"), mcat, rs.getInt("MaritalStatus"),rs.getDouble("Premium")
    );
  }
}

=======
package com.hexaware.mlp178.persistence;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.hexaware.mlp178.model.AgentCat;
import com.hexaware.mlp178.model.Agent;

import org.skife.jdbi.v2.tweak.ResultSetMapper;
import org.skife.jdbi.v2.StatementContext;

public class AgentMapper implements ResultSetMapper<Agent> {
    /**
     * @param idx the index
     * @param rs the resultset
     * @param ctx the context
     * @return the mapped customer object
     * @throws SQLException in case there is an error in fetching data from the resultset
     */
  public final Agent map(final int idx, final ResultSet rs, final StatementContext ctx) throws SQLException {
      /**
       * @return Menu
       */
    String gender = rs.getString("GENDER");
    AgentCat mcat = AgentCat.valueOf(gender);
    return new Agent(rs.getInt("AgentId"), rs.getString("Name"),
    rs.getString("City"), mcat, rs.getInt("MaritalStatus"),rs.getDouble("Premium")
    );
  }
}

>>>>>>> 94efc40dcb80642c275cc9a8e864ed8eee42c31a
