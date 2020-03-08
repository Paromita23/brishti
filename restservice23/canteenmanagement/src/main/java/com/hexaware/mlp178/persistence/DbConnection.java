package com.hexaware.MLP178.persistence;

import org.skife.jdbi.v2.DBI;

/**
 */
public class DbConnection {
    /**
     * Connecting to MYSQL DB.
     * @return database Connection.
     */
  public final DBI getConnect() {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      String dbc = System.getenv("DB_CONNECTION");
      if (dbc == null || dbc.equals("")) {
        dbc = "localhost:3306";
      }
<<<<<<< HEAD:restservice2/canteenmanagement/src/main/java/com/hexaware/mlp178/persistence/DbConnection.java
      DBI dbi = new DBI("jdbc:mysql://" + dbc + "/mlp178?useSSL=false", "root", "brishti23");
=======
      DBI dbi = new DBI("jdbc:mysql://" + dbc + "/MLP178?useSSL=false", "root", "Password123");
>>>>>>> 0af5db222be2a962cbf26fbe983a7928b86f19d9:restservice23/canteenmanagement/src/main/java/com/hexaware/mlp178/persistence/DbConnection.java
      return dbi;
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
