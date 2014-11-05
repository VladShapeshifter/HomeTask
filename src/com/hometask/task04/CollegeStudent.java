package com.hometask.task04;

/**
 * Created by bvl on 11/5/2014.
 */
public class CollegeStudent extends Student {
    int year;
    String major;
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }
    public void setMajor(String major){
        this.major = major;
    }
    public String getMajor(){
        return major;
    }
    CollegeStudent(){
        super.getName();
        super.getAge();
        super.getGender();
        super.getIdNumber();
        super.getGpa();
        getYear();
        getMajor();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
