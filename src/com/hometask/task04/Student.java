package com.hometask.task04;

/**
 * Created by bvl on 11/5/2014.
 */
public class Student extends Person {
    private String idNumber;
    private double gpa;
    public void setIdNumber(String idnumber){
        this.idNumber = idnumber;
    }
    public String getIdNumber (){
        return idNumber;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    public double getGpa (){
        return gpa;
    }
    @Override
    public String toString() {
        return super.toString() + ", student id: " + this.idNumber + ", gpa: " + this.gpa;
    }
}
