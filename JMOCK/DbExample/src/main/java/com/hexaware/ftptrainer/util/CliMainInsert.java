package com.hexaware.ftptrainer.util;
import java.util.Scanner;

import com.hexaware.ftptrainer.model.Employee;
import java.text.SimpleDateFormat;
import java.text.ParseException;

/**
 * Class CliMain provides the command line interface to the leavemanagement
 * application.
 */
public class CliMainInsert {
  public static void main(final String[] ar) {
    Employee.insertEmp(551,"Richa","Java","Programmer",88421);
    System.out.println("Record Inserted...");
  } 
}
