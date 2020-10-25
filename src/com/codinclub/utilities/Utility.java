package com.codinclub.utilities;

import java.util.ArrayList;
import java.util.List;

/*
 * @author Anuj Ranjan Kumar
 * Create Date: 19th October 2020
 * Modified Date: 24th October 2020
 * Functionality: This is a Utility file which contains the logic
 *                 for EmpWageCompuation.java file
 * */
interface Utilities{

    public void attendance(String company,int empRatePerHr,int NumWorkingDays,int MaxWorkingHrsInMonth);

}
public class Utility implements Utilities{

    public static final int is_Part_Time=1;
    public static final int is_Full_Time=2;

    /*
     * Functionality: This method contains logic of checking whether
     *                 employee is FullTime , PartTime or Absent
     *                 and Printing Daily Wage and Monthly Salary
     *                 of Employee till working Hours reaches 100
     *                 or Days 20
     * @param company              - first input argument that is taken in
     * @param empRatePerHr         - second input argument that is taken in
     * @param NumWorkingDays       - third input argument that is taken in
     * @param MaxWorkingHrsInMonth - fourth input argument that is taken in
     * */


    public void attendance(String company,int empRatePerHr,int NumWorkingDays,int MaxWorkingHrsInMonth) {
        int empHrs,totalSalary = 0,totalNumWorkingDays = 0,totalWorkingHours=0,i=0;
        List<Integer> dailyWageList=new ArrayList<Integer>();
        while (totalNumWorkingDays<NumWorkingDays&&totalWorkingHours<MaxWorkingHrsInMonth){
            double empCheck = (Math.floor(Math.random() * 10) % 3);
            int check = (int) empCheck;

            switch (check) {
                default:
                    empHrs = 0;
                    System.out.println("Employee is Absent : "+empHrs);
                    break;
                case is_Part_Time:
                    empHrs = 4;
                    System.out.println("Employee is Part Time : "+empHrs);
                    break;
                case is_Full_Time:
                    empHrs = 8;
                    System.out.println("Employee is FullTime : "+empHrs);

            }
            int dailyWage= (int) (empCheck * empRatePerHr);
            dailyWageList.add(dailyWage);
            totalWorkingHours=totalWorkingHours+empHrs;
            totalNumWorkingDays++;
            totalSalary = totalWorkingHours*empRatePerHr;
        }
        System.out.println("Company is : " + company);
        System.out.println("Total Working Days is : " + totalNumWorkingDays);
        System.out.println("Total Working Hours is : " + totalWorkingHours);
        System.out.println("Total Salary is : " + totalSalary);
        System.out.println("Daily Wage of Employee");
        System.out.print(dailyWageList);
        System.out.println();
    }
}
