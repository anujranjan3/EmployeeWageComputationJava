package com.codinclub.program;
import com.codinclub.utilities.*;
import java.util.ArrayList;
import java.util.Scanner;


/*
 * @author Anuj Ranjan Kumar
 * Create Date  : 19th October 2020
 * Modified Date: 24st October 2020
 * Functionality: Program checks whether employee
 *                is present or absent
 * */

public class EmpWageComputation {

    public static void main (String []args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to Employee Wage Problem ");
        Utility utilities=new Utility();

        System.out.println("Enter Number of Companies to be computed :");
        int counter=scanner.nextInt();
        ArrayList<EmpObjects> list = new ArrayList<EmpObjects>();
        for (int i=0; i<counter; i++){
            EmpObjects empObjects=new EmpObjects();
            System.out.println("Enter Company Name :");
            String company = scanner.next();
            System.out.println("Employee Rate Per Hour :");
            int empRatePerHr = scanner.nextInt();
            System.out.println("Enter Maximum  Number of Working Days in a Month a employee should work :");
            int NumWorkingDays = scanner.nextInt();
            System.out.println("Enter Maximum Hours a employee should work in a month :");
            int setMaxWorkingHrsInMonth = scanner.nextInt();
            empObjects.setCompany(company);
            empObjects.setEmpRatePerHr(empRatePerHr);
            empObjects.setNumWorkingDays(NumWorkingDays);
            empObjects.setMaxWorkingHrsInMonth(setMaxWorkingHrsInMonth);
            utilities.attendance(empObjects.getCompany(),empObjects.getEmpRatePerHr(),empObjects.getNumWorkingDays(),empObjects.getMaxWorkingHrsInMonth());
            list.add(empObjects);
        }

        for (EmpObjects emp : list)
            System.out.println(emp);
    }
}