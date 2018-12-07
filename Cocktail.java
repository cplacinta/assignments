package HomeWork.assignments;

import java.util.Random;

class Cocktail {

    String nume;
    int nrIngrediente;
    float[] pretIngrediente;
    String[] denumireIngrediente;
    int[] gradAlcool;
    int volum;

    //constructor cu parametri
    public Cocktail(String name, int nrIngrediente, int voluum) {
        nume = name;
        this.nrIngrediente = nrIngrediente;
        this.pretIngrediente = new float[nrIngrediente];
        this.denumireIngrediente = new String[nrIngrediente];
        this.gradAlcool = new int[nrIngrediente];
        this.volum = volum;

    }
    public Cocktail(){ //implicit
        nume = "Manhatan";
        nrIngrediente = 2;
        pretIngrediente = new float[nrIngrediente];
        denumireIngrediente = new String[nrIngrediente];
        gradAlcool = new int[nrIngrediente];
        volum = 50;
    }

    public Cocktail(Cocktail Martini){ // constructor de copiere
        nume = Martini.nume;
        nrIngrediente = Martini.nrIngrediente;
        volum = Martini.volum;
        pretIngrediente = new float[nrIngrediente];
        denumireIngrediente = new String[nrIngrediente];
        gradAlcool = new int[nrIngrediente];
        for (int i = 0; i< nrIngrediente; i++){
            pretIngrediente[i]=Martini.pretIngrediente[i];
            denumireIngrediente[i].equals(Martini.denumireIngrediente[i]);
            gradAlcool[i]=Martini.gradAlcool[i];
        }


    }


    static void println(String str) {
        System.out.println(str);
    }

    static void print(String str) {
        System.out.print(str);
    }

    void afisare(){
        println("denumire cocktail: " + nume);
        println("Numar ingridiente: " + nrIngrediente);
        println("Volumul coccktail-ului: " + volum + " ml");
        for(int i =0; i<nrIngrediente;i++){
            println("Denumire ingrideint: " + denumireIngrediente[i]);
            println("Pret ingrideint " + pretIngrediente[i]);
            println("Grad Alcool " + gradAlcool[i] + " %alc");
        }
    }

    public void randomize(){
        String[] cocktailName = {"Dry Martini", "Gin and tonic", "Sex on the beach", "Long Beach", "Manhattan", "Bloody Mary", "Mojito"};
        nume = cocktailName[(new Random().nextInt(cocktailName.length))];
        nrIngrediente = (new Random().nextInt(4))+1;
        volum = new Random().nextInt(500);
        for (int i = 0; i< nrIngrediente; i++)
            pretIngrediente[i] = (new Random().nextFloat()*100);

        for (int i = 0; i< nrIngrediente; i++)
            gradAlcool[i] = (new Random().nextInt(90));

        String[] drinksName = {"vodka", "gin", "tonic", "rum", "martini", "whiskey", "coke", "sprite", "tomato juice"};
        for (int i = 0; i< nrIngrediente; i++)
            denumireIngrediente[i] = drinksName[new Random().nextInt(drinksName.length)];
    }

    public double avgGradAlc(){
        int sumAlcool=0;
        int index=0;
        for(int i =0; i< nrIngrediente; i++) {
            sumAlcool += gradAlcool[i];
            index +=i;
        }
        return (sumAlcool/index);
    }

    public double avgPrice(){
        int sumPrice=0;
        int index=0;
        for(int i =0; i< nrIngrediente; i++) {
            sumPrice += pretIngrediente[i];
            index +=i;
        }
        return (sumPrice /index);
    }

    public int maxPrice(){
        float max=0;
        int index = 0;
        for(int i=0; i< nrIngrediente; i++)
            if(max < pretIngrediente[i]){
            max = pretIngrediente[i];
            index =i;
            }
        return index;
    }

}




