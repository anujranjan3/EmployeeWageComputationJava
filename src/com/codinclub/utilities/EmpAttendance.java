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
     *                 employee is FullTime , PartTime or Absent
     *                 and Printing salary of Employee
     * */

    EmpDailyWage empDailyWage = new EmpDailyWage();
    public void attendance(){

        int empHrs,isPartTime=1,isFullTime=2;
        double empCheck=(Math.floor(Math.random() * 10 ) % 3);
        if (empCheck==isFullTime) {
            System.out.println("Employee is FullTime");
            empHrs=16;
        }
        else if (empCheck==isPartTime){
            System.out.println("Employee is Part Time");
            empHrs=8;
        }
        else{
            empHrs=0;
            System.out.println("Employee is Absent");
        }
        empDailyWage.empWage(empHrs);

    }

}
