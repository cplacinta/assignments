package HomeWork.assignments;

import java.util.Random;

public class Student {

        String nickName;
        float lenea;
        short iq ;
        byte nrExam;
        int[] note ;

    /*public Student(String name, float lenea, short IQ, byte nrExam) {
        nickName = name;
        this.lenea = lenea;
        iq = IQ;
        this.nrExam = nrExam;
        note = new int[nrExam];
    }*/

        public void randomize(){

            lenea = (new Random().nextFloat());
            iq = (short) (new Random().nextInt(300));
            nrExam = (byte) (new Random().nextInt(10));
            note = new int [nrExam];
            for (int i = 0; i< nrExam; i++)
                note[i] = (new Random().nextInt(10));
            String nickArray [] = {"God", "SuperHero, Monkey", "Batman", "Clown"};
            nickName = nickArray[(new Random().nextInt(nickArray.length))];
        }

    }

