package HomeWork.assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Student {

        String nickName;
        float lenea;
        short iq ;
        byte nrExam;
        int[] note ;
        static int nrStud;

    public Student(String name, float lenea, short IQ, byte nrExam) {
        nickName = name;
        this.lenea = lenea;
        iq = IQ;
        this.nrExam = nrExam;
        note = new int[nrExam];
    }

    Student(){
        nickName = "Jon Snow";
        lenea = 0.5f;
        iq = (short) 100;
        nrExam =(byte) 4;
        note = new int[nrExam];
        nrStud++;
    }

        public void randomize(){

            lenea = (new Random().nextFloat());
            iq = (short) (new Random().nextInt(300));
            nrExam = (byte) ((new Random().nextInt(5))+1);
            note = new int [nrExam];
            for (int i = 0; i< nrExam; i++)
                note[i] = (new Random().nextInt(10))+1;
            String nickArray [] = {"God", "SuperHero", "Monkey", "Batman", "Clown","WonderWoman", "Vanilla","Joker","Scarface","Obama"};
            nickName = nickArray[(new Random().nextInt(nickArray.length))];
        }

    void afisare(){
        println("Nickname: " + nickName);
        println("My lazyness is: " + lenea);
        println("I hava an IQ of: " + iq);
        println("I took " + nrExam + " exams");
        for(int i =0; i<nrExam;i++){
            print(" " +note[i]);
        }
        println("");
    }

    static void println(String str) {
        System.out.println(str);
    }
    static void print(String str) {
        System.out.print(str);
    }

    static String inString(){
        BufferedReader box = new BufferedReader(new InputStreamReader(System.in));
        String str="";
        try {
            str = box.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    static int inInt(){
            return (Integer.valueOf(inString()).intValue());
    }

    static float inFloat(){
            return (Float.valueOf(inString()).floatValue());
    }

    static double inDouble(){
            return (Double.valueOf(inString()).doubleValue());
    }

    static byte inByte(){
            return (Byte.valueOf(inString()).byteValue());
    }

    void compareLenea(Student A){
        if(this.lenea > A.lenea){
            println("Studentul " +this.nickName + " e mai lenos decat " + A.nickName);
        } else {
            println("Studentul " + A.nickName + " e mai lenos decat " + this.nickName);
        }
    }

    static void compareIQ(Student A,Student B){
        if (B.iq > A.iq){
            println("Studentul " + B.nickName + " e mai intelegent decat " + A.nickName);
        } else {
            println("Studentul " + A.nickName + " e mai intelegent decat " + B.nickName);
        }
    }



    }

