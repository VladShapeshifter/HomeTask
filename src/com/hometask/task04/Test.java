package com.hometask.task04;

import java.util.Arrays;

/**
 * Created by bvl on 11/5/2014.
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Marco Polo");
        person.setAge(25);
        person.setGender("M");
//        person.toString();
        Student student = new Student();
        student.setName("Eric Peterson");
        student.setAge(15);
        student.setGender("M");
        student.setIdNumber("MOP165422");
        student.setGpa(4.1);
//        student.toString();
        Teacher teacher = new Teacher();
        teacher.setName("Kattelyn Frisk");
        teacher.setAge(28);
        teacher.setGender("F");
        teacher.setSubject("Physics");
        teacher.setSalary(2000.0);
//        teacher.toString();
        CollegeStudent collegeStudent = new CollegeStudent();
        collegeStudent.setName("Samanta Nord");
        collegeStudent.setAge(19);
        collegeStudent.setGender("F");
        collegeStudent.setIdNumber("MOP431200");
        collegeStudent.setGpa(4.9);
        collegeStudent.setYear(3);
        collegeStudent.setMajor("Psychology");
//        collegeStudent.toString();

        Person[] personArray = new Person[4];
        personArray[0] = person;
        personArray[1] = student;
        personArray[2] = teacher;
        personArray[3] = collegeStudent;
        for (Person i : personArray){
            System.out.println(i);
        }

/*        Teacher teacher = new Teacher();
        CollegeStudent collegeStudent = new CollegeStudent();
        Person[] arrayPerson = new Person[4];
        arrayPerson[0] = new Person();
        arrayPerson[0].setName("Coach Bob");
        arrayPerson[0].setAge(27);
        arrayPerson[0].setGender("M");
        arrayPerson[1] = new Student();
        arrayPerson[1].setName("Lynne Brooke");
        arrayPerson[1].setAge(16);
        arrayPerson[1].setGender("F");
        arrayPerson[1].setIdnumber("HS95129");
        arrayPerson[2] = teacher;
        arrayPerson[3] = collegeStudent;
        for (Person var : arrayPerson){
            if (var == arrayPerson[0]) {
                System.out.println(arrayPerson[0].toString());
            }
            if (var == arrayPerson[1]) {
                System.out.println(arrayPerson[1].toString());
            }
            if (var == arrayPerson[2]) {
                System.out.println(arrayPerson[2].toString());
            }
            if (var == arrayPerson[3]) {
                System.out.println(arrayPerson[3].toString());
            }

        }*/
    }
}
