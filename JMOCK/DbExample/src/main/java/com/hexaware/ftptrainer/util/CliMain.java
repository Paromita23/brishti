package com.hexaware.ftptrainer.util;
import java.util.Scanner;

import com.hexaware.ftptrainer.model.Employee;
import java.text.SimpleDateFormat;
import java.text.ParseException;

/**
 * Class CliMain provides the command line interface to the leavemanagement
 * application.
 */
public class CliMain {
  public static void main(final String[] ar) {
    Employee[] employee = Employee.listAll();
    for (Employee e : employee) {
      System.out.println(e.getEmpno() + " " +
             e.getName() + " " + e.getDept() + " "
              + e.getDesig() + " " + e.getBasic());
    }
  }
}
