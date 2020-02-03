package com.hexaware.ftptrainer;
//import java.util.Date;

import com.hexaware.ftptrainer.model.Employee;
import com.hexaware.ftptrainer.persistence.EmployeeDAO;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;

import mockit.Expectations;
import mockit.MockUp;
import mockit.Mocked;
import mockit.Mock;
import mockit.integration.junit4.JMockit;

import java.util.ArrayList;

@RunWith(JMockit.class)
public class EmployeeTest 
{
   /**
    * tests that empname running correctly  or not
    *@param dao 
    */
    @Test
    public final void testAllEmply(@Mocked final EmployeeDAO dao) { 
        final ArrayList<Employee> alist = new ArrayList<Employee>();
        new Expectations(){
            {
                dao.list(); result = alist;
            }
        };
        new MockUp<Employee>() 
        {
            @Mock
            EmployeeDAO dao() {
                return dao;
            }
        };
        Employee[] elist = Employee.listAll(); 
        assertEquals(0, elist.length);
    }

    @Test
    public final void testListSome(@Mocked final EmployeeDAO dao) { 
        final ArrayList<Employee> alist = new ArrayList<Employee>();
        alist.add(new Employee(1, "Malar","Dotnet","Programmer",88422));
        alist.add(new Employee(2, "Malar","Dotnet","Programmer",88422));
        alist.add(new Employee(3, "Malar","Dotnet","Programmer",88422));
        alist.add(new Employee(4, "Malar","Dotnet","Programmer",88422));
        alist.add(new Employee(5, "Malar","Dotnet","Programmer",88422));
        new Expectations(){
            {
                dao.list(); result = alist;
            }
        };
        new MockUp<Employee>() 
        {
            @Mock
            EmployeeDAO dao() {
                return dao;
            }
        };
        Employee[] elist = Employee.listAll(); 
        assertEquals(5, elist.length);
    }

    @Test 
    public final void testFindByEmpId(@Mocked final EmployeeDAO edao) {
        final Employee e1 = new Employee(1, "Malar","Dotnet","Programmer",88422);
        final Employee e2 = new Employee(2, "Malar","Dotnet","Programmer",88422);
        final Employee e3 = new Employee(3, "Malar","Dotnet","Programmer",88422);
        new Expectations() {
            {
                edao.find(1); result = e1;
                edao.find(2); result = e2; 
                edao.find(3); result = e3;
                edao.find(-1); result = null;
            }
        };
        new MockUp<Employee>() { 
                @Mock
                EmployeeDAO dao() {
                    return edao;
                }
        };
        Employee er1 = Employee.listById(1);
        assertEquals(er1, e1);
        Employee er2 = Employee.listById(2);
        assertEquals(er2, e2);
        Employee er3 = Employee.listById(3);
        assertEquals(er3, e3);
        Employee er4 = Employee.listById(-1);
        assertNull(er4);
    }

    @Test
    public final void checkgetEmpno(@Mocked final EmployeeDAO edao) {
        final Employee s = new Employee(20, "Malar","Dotnet","Programmer",88422);
        new Expectations(){
            {
               edao.find(20); result = s;
            }
        };
        new MockUp<Employee>() {
            @Mock
            EmployeeDAO dao() {
                return edao;
            }
        };
    Employee rs = Employee.listById(20);
    assertEquals(rs,s);
    }
}







