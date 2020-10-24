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
        EmpObjects bigBasket=new EmpObjects();

        dmart.setCompany("Dmart");
        dmart.setEmpRatePerHr(20);
        dmart.setNumWorkingDays(20);
        dmart.setMaxWorkingHrsInMonth(100);
        utilities.attendance(dmart.getCompany(),dmart.getEmpRatePerHr(),
                             dmart.getNumWorkingDays(),dmart.getMaxWorkingHrsInMonth());

        bigBasket.setCompany("BigBasket");
        bigBasket.setEmpRatePerHr(20);
        bigBasket.setNumWorkingDays(20);
        bigBasket.setMaxWorkingHrsInMonth(100);
        utilities.attendance(bigBasket.getCompany(),bigBasket.getEmpRatePerHr(),
                bigBasket.getNumWorkingDays(),bigBasket.getMaxWorkingHrsInMonth());

        EmpObjects reliance=new EmpObjects("Reliance",20,
                                           20,100);
        utilities.attendance(reliance.getCompany(),reliance.getEmpRatePerHr(),
                             reliance.getNumWorkingDays(),reliance.getMaxWorkingHrsInMonth());

        EmpObjects mphasis=new EmpObjects("Mphasis",20,
                20,90);
        utilities.attendance(mphasis.getCompany(),mphasis.getEmpRatePerHr(),
                mphasis.getNumWorkingDays(),mphasis.getMaxWorkingHrsInMonth());

        ArrayList<EmpObjects> list = new ArrayList<EmpObjects>();
        list.add(dmart);
        list.add(bigBasket);
        list.add(reliance);
        list.add(mphasis);

        for (EmpObjects emp : list)
            System.out.println(emp);
    }
}
