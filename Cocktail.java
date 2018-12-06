package HomeWork.assignments;

import java.util.Arrays;
import java.util.Random;

class Cocktail {

    String nume;
    int nrIngrediente;
    float[] pretIngrediente;
    String[] denumireIngrediente;
    byte[] gradIngrediente;
    int volum;

    public Cocktail(String name, int nrIngrediente, float[] pretIngrediente, String[] denumireIngrediente, byte[] gradIngrediente, int voluum) {
        nume = name;
        this.nrIngrediente = nrIngrediente;
        this.pretIngrediente = new float[nrIngrediente];
        this.denumireIngrediente = new String[nrIngrediente];
        this.gradIngrediente = new byte[nrIngrediente];
        this.volum = volum;

    }

    /*public void randomize(){
        nrIngrediente = (new Random().nextInt());
        pretIngrediente = new float[nrIngrediente];
        for (int i = 0; i< nrIngrediente; i++)
            pretIngrediente[i] = (new Random().nextInt()*100);
        gradIngrediente = new byte[nrIngrediente];
        for (int i = 0; i< nrIngrediente; i++)
            gradIngrediente[i] = (byte)(new Random().nextInt());
        volum = new Random().nextInt(90);
    }*/




}




