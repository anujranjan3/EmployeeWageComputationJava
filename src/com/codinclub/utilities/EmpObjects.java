package com.codinclub.utilities;

public class EmpObjects {

    private String company;
    private int empRatePerHr;
    private int numWorkingDays;
    private int MaxWorkingHrsInMonth;

    public EmpObjects() {
    }

    public EmpObjects(String company,int empRatePerHr,int numWorkingDays,int MaxWorkingHrsInMoth) {

        this.company=company;
        this.empRatePerHr=empRatePerHr;
        this.numWorkingDays=numWorkingDays;
        this.MaxWorkingHrsInMonth=MaxWorkingHrsInMoth;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getEmpRatePerHr() {
        return empRatePerHr;
    }

    public void setEmpRatePerHr(int empRatePerHr) {
        this.empRatePerHr = empRatePerHr;
    }

    public int getNumWorkingDays() {
        return numWorkingDays;
    }

    public void setNumWorkingDays(int numWorkingDays) {
        this.numWorkingDays = numWorkingDays;
    }

    public int getMaxWorkingHrsInMonth() {
        return MaxWorkingHrsInMonth;
    }

    public void setMaxWorkingHrsInMonth(int maxWorkingHrsInMonth) {
        MaxWorkingHrsInMonth = maxWorkingHrsInMonth;
    }

    @Override
    public String toString() {
        return "EmpObjects{" +
                "company='" + company + '\'' +
                ", empRatePerHr=" + empRatePerHr +
                ", numWorkingDays=" + numWorkingDays +
                ", MaxWorkingHrsInMonth=" + MaxWorkingHrsInMonth +
                '}';
    }
}
