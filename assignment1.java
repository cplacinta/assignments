package HomeWork;

class Student {

    String nickName;
    float lenea;
    short iq ;
    byte nrExam;
    int[] note ;

    public Student(String name, float lenea, short IQ, byte nrExam) {
        nickName = name;
        this.lenea = lenea;
        iq = IQ;
        this.nrExam = nrExam;
        note = new int[nrExam];
    }

}

public class assignment1 {
    static void println(String str) {
        System.out.println(str);
    }
    static void print(String str) {
        System.out.print(str);
    }
    public static void main (String [] args){
        /*Student cristi = new Sultan("Cristi",0.9f,(short) 140, (byte)8);
        Student vasea = new Sultan("Vasea",1.0f,(short) 200, (byte)5);
        Student elena = new Sultan("Elena",0.1f,(short) 120, (byte)6);
        Student ana = new Sultan("Ana",0.5f,(short) 90, (byte)14);
        Student ion = new Sultan("Ion",0.3f,(short) 110, (byte)2);
        Student petru = new Sultan("Petru",0.45f,(short) 25, (byte)4);*/

    }
}

