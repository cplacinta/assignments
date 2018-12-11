package HomeWork.assignments;

import HomeWork.assignments.Student;

import java.util. *;

import static HomeWork.assignments.Student.println;


public class StudentMain {

    public static void main (String [] args){

        Student[] student = new Student[10];
        for (int i = 0; i< student.length; i++) {
            student[i] = new Student();
            student[i].randomize();
            student[i].afisare();
        }

        int i = new Random().nextInt(10)+1;
        int j = new Random().nextInt(10);

        student[i].compareLenea(student[j]);
        Student.compareIQ(student[i],student[j]);


    }
}

