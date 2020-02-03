package com.hexaware.ftptrainer.util;
import java.util.Scanner;

import com.hexaware.ftptrainer.model.Employee;
import java.text.SimpleDateFormat;
import java.text.ParseException;

/**
 * Class CliMain provides the command line interface to the leavemanagement
 * application.
 */
public class CliMainSearch {
  public static void main(final String[] ar) {
    Employee e = Employee.listById(1);
    if (e != null) {
        System.out.println("Empno " + e.getEmpno());
        System.out.println("Name " + e.getName());
        System.out.println("Department " + e.getDept());
        System.out.println("Designation " + e.getDesig());
        System.out.println("Basic " + e.getBasic());
    }
    else {
        System.out.println("*** Record Not Found");
    }
  }
}
