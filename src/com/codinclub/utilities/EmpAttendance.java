package com.codinclub.utilities;

/*
 * @author Anuj Ranjan Kumar
 * Create Date: 16th October 2020
 * Functionality: This is a Utility file which contains the logic
 *                 for EmpWageCompuation.java file
 * */

public class EmpAttendance {

    /*
     * Functionality: This method contains logic of checking whether
     *                 employee is present or not and Printing
     *                  salary of Employee
     * */

    EmpDailyWage empDailyWage = new EmpDailyWage();
    public void attendance(){

        int empHrs,isPresent=1;
        double empCheck=(Math.floor(Math.random() * 10 ) % 2);
        if (empCheck==isPresent) {
            System.out.println("Employee is Present");
            empHrs=8;
        }
        else{
            empHrs=0;
            System.out.println("Employee is Absent");
        }
        empDailyWage.empWage(empHrs);

    }

}
