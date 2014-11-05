package com.hometask.task04;

/**
 * Created by bvl on 11/5/2014.
 */
public class Teacher extends Person {
    private double salary;
    private String subject;
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public String getSubject(){
        return subject;
    }
    Teacher(){
        super.getName();
        super.getAge();
        super.getGender();
        getSalary();
        getSubject();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
