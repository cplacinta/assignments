package HomeWork.assignments;

import HomeWork.assignments.Student;

import java.util. *;



public class StudentMain {
    static void println(String str) {
        System.out.println(str);
    }
    static void print(String str) {
        System.out.print(str);
    }
    public static void main (String [] args){

        Student[] student = new Student[5];
        for (int i = 0; i< student.length; i++) {
            student[i].randomize();
            println(student[i].toString());
        }

    }
}

