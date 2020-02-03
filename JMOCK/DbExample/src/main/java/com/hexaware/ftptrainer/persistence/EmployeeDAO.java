package com.hexaware.ftptrainer.persistence;

import com.hexaware.ftptrainer.model.Employee;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

import java.util.List;
import java.util.Date;

/**
 * The DAO class for employee.
 */
public interface EmployeeDAO  {
  /**
   * return all the details of all the employees.
   * @return the employee array
   */
  @SqlQuery("SELECT * FROM EMP")
  @Mapper(EmployeeMapper.class)
  List<Employee> list();

  /**
   * return all the details of the selected employee.
   * @param empID the id of the employee
   * @return the employee object
   */
  @SqlQuery("SELECT * FROM EMP WHERE EMPNO = :empno")
  @Mapper(EmployeeMapper.class)
  Employee find(@Bind("empno") int empno);

  @SqlUpdate("INSERT INTO EMP(EMPNO, NAME, DEPT, DESIG, BASIC) "
  + "VALUES(:empno, :name, :dept, :desig, :basic)") 
  void insert(@Bind("empno") int empno, 
            @Bind("name") String name, 
            @Bind("dept") String dept, 
        @Bind("desig") String desig, 
        @Bind("basic") int basic);
  
  /**
  * close with no args is used to close the connection.
  */
  void close();
}
