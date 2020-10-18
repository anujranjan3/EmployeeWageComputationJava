package com.codinclub.program;
import com.codinclub.utilities.*;

/*
 * @author Anuj Ranjan Kumar
 * Create Date: 16th October 2020
 * Functionality: Program checks whether employee
 *                is present or absent
 * */

public class EmpWageComputation {

    public static void main (String []args){

        System.out.println("Welcome to Employee Wage Problem ");
        EmpAttendance empAttendance=new EmpAttendance();
        empAttendance.attendance();

    }
}
