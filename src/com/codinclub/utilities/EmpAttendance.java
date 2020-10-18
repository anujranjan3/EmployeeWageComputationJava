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
     *                 and Printing Daily Wage and Monthly Salary
     *                 of Employee till working Hours reaches 100
     *                 or Days 20
     * */

    EmpDailyWage empDailyWage = new EmpDailyWage();

    public void attendance() {
        int Salary, totalSalary = 0, empHrs = 0, numWorkingDays = 0,workingHours=0;
        while (numWorkingDays<20&&workingHours<100){
            double empCheck = (Math.floor(Math.random() * 10) % 3);
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
            workingHours=workingHours+empHrs;
            numWorkingDays++;
            Salary = empDailyWage.empWage(empHrs);
            totalSalary = totalSalary + Salary;
        }
        System.out.println("Monthly Salary is : " + totalSalary);
        System.out.println("Working Days is : " + numWorkingDays);
        System.out.println("Working Hours is : " + workingHours);
    }
}
