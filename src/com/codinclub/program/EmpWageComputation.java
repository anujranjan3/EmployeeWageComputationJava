package com.codinclub.program;
import com.codinclub.utilities.*;

import java.util.ArrayList;


/*
 * @author Anuj Ranjan Kumar
 * Create Date  : 19th October 2020
 * Modified Date: 21st October 2020
 * Functionality: Program checks whether employee
 *                is present or absent
 * */

public class EmpWageComputation {

    public static void main (String []args){

        System.out.println("Welcome to Employee Wage Problem ");

        Utility utilities=new Utility();
        EmpObjects dmart=new EmpObjects();

        dmart.setCompany("Dmart");
        dmart.setEmpRatePerHr(20);
        dmart.setNumWorkingDays(20);
        dmart.setMaxWorkingHrsInMonth(100);
        utilities.attendance(dmart.getCompany(),dmart.getEmpRatePerHr(),
                             dmart.getNumWorkingDays(),dmart.getMaxWorkingHrsInMonth());

        EmpObjects reliance=new EmpObjects("Reliance",20,
                                           20,100);
        utilities.attendance(reliance.getCompany(),reliance.getEmpRatePerHr(),
                             reliance.getNumWorkingDays(),reliance.getMaxWorkingHrsInMonth());

        ArrayList<EmpObjects> list = new ArrayList<EmpObjects>();
        list.add(dmart);
        list.add(reliance);

        for (EmpObjects emp : list)
            System.out.println(emp);
    }
}
