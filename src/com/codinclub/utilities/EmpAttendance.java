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

        int empHrs=0;
        double empCheck=(Math.floor(Math.random() * 10 ) % 3);
        int check = (int) empCheck;

        switch (check) {

            case 0:
                empHrs = 0;
                System.out.println("Employee is Absent");
                break;

            case 1:
                System.out.println("Employee is Part Time");
                empHrs = 8;
                break;
            case 2:
                System.out.println("Employee is FullTime");
                empHrs = 16;

        }
        empDailyWage.empWage(empHrs);

    }

}
