package HomeWork.assignments;

import java.util.Arrays;
import java.util.Scanner;

class Sultan {

    String nume;
    short varsta;
    int averea;
    byte nrSotii;
    String[] numeSotie;
    int[] varstaSotie;
    int[] frumuseteSotie;
    int[] nocivietate;

    public Sultan(String name, short varsta, int averea, byte nrSotii) {
        nume = name;
        this.varsta = varsta;
        this.averea = averea;
        this.nrSotii = nrSotii;
        // de introdus date in arrays
        this.numeSotie = new String[nrSotii];
        varstaSotie = new int[nrSotii];
        frumuseteSotie = new int[nrSotii];
        nocivietate = new int[nrSotii];

    }


    @Override
    public String toString() {
        return "Sultan{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", averea=" + averea +
                ", nrSotii=" + nrSotii +
                ", numeSotie=" + (numeSotie == null ? null : Arrays.asList(numeSotie));
    }

    public double avgFrumusete() {
        double avgFrumusete=0;
        for(int i=0; i< nrSotii; i++){
            avgFrumusete+=frumuseteSotie[i];
        }
        return avgFrumusete/nrSotii;

    }
    public double avgNocvitate() {
        double k=0;
        for(int i=0; i< nrSotii; i++){
            k+=nocivietate[i];
        }
        return k/nrSotii;
    }

    public int mostFrumoasa(){
        int mostFrumoasa = 0;
        for(int i=0; i< nrSotii;i++){
            if (mostFrumoasa < frumuseteSotie[i]) {
                mostFrumoasa =i;
            }
        }
        return mostFrumoasa;
    }

}

public  class SultanMain {
    static void println(String str) {
        System.out.println(str);
    }

    static void print(String str) {
        System.out.print(str);
    }


    public static void main(String[] args) {

        System.out.println("Introduceti numarul de sultani: ");
        Scanner sc = new Scanner(System.in);
        Integer nrSultan = sc.nextInt();
        Sultan[] sultan = new Sultan[nrSultan];

        sultan[0] = new Sultan("Osman I", (short) 44, 5555, (byte) 1);
        sultan[1] = new Sultan("Mehmed", (short) 21, 6666, (byte) 2);
        sultan[2] = new Sultan("Selin II", (short) 68, 1111, (byte) 3);
        /*sultan[3] = new Sultan("Sunni",(short) 33,1234, (byte)4);
        sultan[4] = new Sultan("Murad III",(short) 81,9999, (byte)3);
        sultan[5] = new Sultan("Hüma",(short) 52,6789, (byte)2);*/


        for (int i = 0; i < nrSultan; i++) {

            for (int j = 0; j < sultan[i].nrSotii; j++) {
                println("Dati nume sotiei nr." + (j + 1) + " al sultanului " + sultan[i].nume + ", varsta sotiei, frumusetea si nocivitate:");
                sultan[i].numeSotie[j] = sc.next();
                sultan[i].varstaSotie[j]=sc.nextInt();
                sultan[i].frumuseteSotie[j] = sc.nextInt();
                sultan[i].nocivietate[j]=sc.nextInt();
            }

        }


        for (int i = 0; i < nrSultan; i++) {
            println(sultan[i].nume + " are o medie a sotiilor dupa nocivitate de: " + sultan[i].avgFrumusete());
        }


        for (int i = 0; i < nrSultan; i++) {
            println(sultan[i].nume + " are o medie a sotiilor dupa nocivitate de: " + sultan[i].avgNocvitate());
        }


        int mostSanatos = 0;
        for (int i = 0; i < nrSultan; i++) {
            if (sultan[i].nrSotii > mostSanatos)
                mostSanatos = i;
        }
        println("Cel mai sanatos sultan este: " + sultan[mostSanatos].toString());


        int indexSotie = 0;
        int indexSultan = 0;
        int maxFrumoasa = 0;
        for (int i = 0; i < nrSultan; i++) {
            for (int j = 0; j < sultan[i].nrSotii; j++) {
                if (maxFrumoasa < sultan[i].frumuseteSotie[j]) {
                    maxFrumoasa = sultan[i].frumuseteSotie[j];
                    indexSotie = j;
                    indexSultan = i;

                }
            }

        }


        println("Sultan name: " + sultan[indexSultan].nume + " are cea mai frumoasa sotie pe nume: " + sultan[indexSultan].numeSotie[indexSotie] +
                " care are frumusetea de: " + maxFrumoasa);


        int maxNociva = 0;
        indexSotie = 0;
        indexSultan = 0;
        for (int i = 0; i < nrSultan; i++) {
            for (int j = 0; j < sultan[i].nrSotii; j++) {
                if (maxNociva < sultan[i].nocivietate[j]) {
                    maxNociva = sultan[i].nocivietate[j];
                    indexSotie = j;
                    indexSultan = i;

                }
            }

        }
        println("Sultan name: " + sultan[indexSultan].nume + " are cea mai nociva sotie pe nume: " + sultan[indexSultan].numeSotie[indexSotie] +
                " care are nocivitatea de: " + maxNociva);

    }
}




