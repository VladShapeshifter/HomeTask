package com.hometask.task02;

/**
 * Created by Vladislav on 01.11.2014.
 */
public class ClassWork1 {
    long property;
    void setParam(int shift, int value){
        long mask = 0xFFFF;
        mask <<= shift;
        mask = ~mask;//инвертируем маску
        property = property & mask;

        long a = (short) value;
        a <<= shift;
        property = a|property;
    }
    void setYear(int year){
        setParam(48, year);
    }
    void setWiight(int wight){
        setParam(32, wight);
    }
    void setAge(int age){
        setParam(16, age);
    }
    void setHeight(int height){
        setParam(0, height);
    }
    int getParam(int shift){
        long mask1 = 0xffff;
        long properties = property >>> shift;
        properties = mask1 & properties;
        return (int)properties;
    }
    int getAge(){
        return getParam(16);
    }
    int getWight(){
        return getParam(32);
    }
    int getYear(){
        return getParam(48);
    }
    int getHeight(){
        return getParam(0);
    }

    public static void main(String[] args) {
        ClassWork1 cw = new ClassWork1();
//        cw.setAge(21);
//        cw.setHeight(189);
        cw.setYear(1945);
//        cw.setWiight(75);
        System.out.println(cw.getAge());
        System.out.println(cw.getHeight());
        System.out.println(cw.getYear());
        System.out.println(cw.getWight());
    }


}
