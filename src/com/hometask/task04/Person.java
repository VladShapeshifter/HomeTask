package com.hometask.task04;

/**
 * Created by bvl on 11/5/2014.
 */
public class Person {
    private String name;
    private int age;
    private String gender;
    public void setName(String name){
        this.name = name;
    }
    public String getName (){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge (){
        return age;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender (){
        return gender;
    }

    @Override
    public String toString() {
        return this.name + ", age: " + this.age + ", gender: " + this.gender;
    }
}
