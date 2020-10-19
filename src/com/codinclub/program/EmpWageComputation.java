package com.codinclub.program;
import com.codinclub.utilities.*;

/*
 * @author Anuj Ranjan Kumar
 * Create Date: 19th October 2020
 * Functionality: Program checks whether employee
 *                is present or absent
 * */

public class EmpWageComputation {

    public static void main (String []args){

        System.out.println("Welcome to Employee Wage Problem ");
        Utility utilities=new Utility();
        EmpObjects empObjects=new EmpObjects();
        empObjects.setCompany("Dmart");
        empObjects.setEmpRatePerHr(20);
        empObjects.setNumWorkingDays(20);
        empObjects.setMaxWorkingHrsInMonth(100);
        utilities.attendance(empObjects.getCompany(),empObjects.getEmpRatePerHr(),empObjects.getNumWorkingDays(),empObjects.getMaxWorkingHrsInMonth());

    }
}
