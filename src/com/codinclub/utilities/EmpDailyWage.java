package com.codinclub.utilities;

/*
 * @author Anuj Ranjan Kumar
 * Create Date: 16th October 2020
 * Functionality: This is a Utility file which contains the logic
 *                 for EmpAttendance.java file
 * */

public class EmpDailyWage {

    /*
     * Functionality: This method contains logic of checking whether
     *                 computing salary of employee
     * @param empHrs - first input argument that is taken in
     * */

    public void empWage(int empHrs){

        int empRatePerHr=20;
        int salary=empHrs*empRatePerHr;
        System.out.println("Salary is : "+salary);
    }
}
