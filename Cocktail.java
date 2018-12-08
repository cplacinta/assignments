package HomeWork.assignments;

import java.util.Random;
import java.util.Scanner;

class Cocktail {

    String nume;
    int nrIngrediente;
    float[] pretIngrediente;
    String[] denumireIngrediente;
    int[] gradAlcool;
    int volum;

    //constructor cu parametri
    public Cocktail(String name, int nrIngrediente, int volum) {
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

    public double sumGradAlc(){
        int sumAlcool=0;
        for(int i =0; i< nrIngrediente; i++)
            sumAlcool += gradAlcool[i];
        return sumAlcool;
    }

    public double sumPrice(){
        int sumPrice=0;
        for(int i =0; i< nrIngrediente; i++)
            sumPrice += pretIngrediente[i];
        return sumPrice ;
    }

    public int maxPrice(){
        float maxPrice=0;
        int index=0;
        for(int i=0; i< nrIngrediente; i++)
            if(maxPrice < pretIngrediente[i]){
            maxPrice = pretIngrediente[i];
            index =i;
            }
        return index;
    }

    public int maxAlcool(){
        int maxAlcool=0;
        for(int i = 0; i<nrIngrediente;i++)
            if(maxAlcool < gradAlcool[i]){
                maxAlcool = gradAlcool[i];
            }
        return maxAlcool;
    }



    public static void main(String[] args) {

        System.out.println("Introduceti numarul de cocktail-uri: ");
        Scanner sc = new Scanner(System.in);
        Integer nrCocktails = sc.nextInt();
        Cocktail[] bar = new Cocktail[nrCocktails];

        /*bar[0] = new Cocktail(); // apelare constructor implicit
        bar[1] = new Cocktail(); // apelare constructor implicit
        bar[2] = new Cocktail(); // apelare constructor implicit*/
        bar[0] = new Cocktail("Martini",3,150); // apelare constructor cu parametri
        bar[1] = new Cocktail("Bloody Mary",3,250); // apelare constructor cu parametri
        bar[2] = new Cocktail("Long Beach",3,250); // apelare constructor cu parametri
        bar[3] = new Cocktail("Gin and Tonic",3,100); // apelare constructor cu parametri

        for (int i = 0; i < nrCocktails; i++) {
            for(int j = 0; j< bar[i].nrIngrediente; j++) {
                println("Pentru cocktail-ul nr " +(i+1)+" introduceti denumirea ingredientului cu nr "+ (j+1)+", grad alcool si pretul acestuia:  ");
                bar[i].denumireIngrediente[j] = sc.next();
                bar[i].gradAlcool[j] = sc.nextInt();
                bar[i].pretIngrediente[j] = sc.nextFloat();
            }
        }

        //Cocktail martini = new Cocktail(bar[0]); // apelare constructor de copiere
        /*for (int i=0; i < nrCocktails; i++)
            bar[i].randomize();*/


        for (int i = 0; i < nrCocktails; i++)
            bar[i].afisare();

        int maxIngrediente=0;
        int indexIngrediente=0;
        for(int i = 0; i<nrCocktails;i++)
            if(maxIngrediente < bar[i].nrIngrediente) {
                maxIngrediente = bar[i].nrIngrediente;
                indexIngrediente=i;
            }
        println("Cea mai complicata bautura este: "+bar[indexIngrediente].nume + " care are " + bar[indexIngrediente].nrIngrediente + " ingrediente");

        println("Lista cocktail-uluri:");
        for(int i=0; i< nrCocktails;i++){
            println(bar[i].nume+" ");

        }
        double avgGradAlcool=0;
        int totalNrIngrediente =0;
        for(int i = 0; i< nrCocktails;i++){
            avgGradAlcool+=bar[i].sumGradAlc();
            totalNrIngrediente+=bar[i].nrIngrediente;
        }
        println("Media gradului de alcool al tuturor bauturilor este de: " + (avgGradAlcool/totalNrIngrediente)+ " %alc");

        double avgPriceIngredient=0;
        for(int i = 0; i< nrCocktails;i++){
            avgPriceIngredient+=bar[i].sumPrice();
        }
        println("Media pretului ingredientilor este: " + (avgPriceIngredient/totalNrIngrediente)+" mdl");

        int indexPretingredient = 0;
        int indexBar = bar[0].maxPrice();
        for (int i=0; i<nrCocktails-1;i++)
            if(bar[i].pretIngrediente[bar[i].maxPrice()] > bar[i+1].pretIngrediente[bar[i].maxPrice()]){
                indexBar = i;
                indexPretingredient =bar[i].maxPrice();

            }
        println("Ingredientul cel mai costisitor este: " + bar[indexBar].denumireIngrediente[indexPretingredient] + " cu valoarea de " + bar[indexBar].pretIngrediente[indexPretingredient]+" mdl");

        int index = 0;
        int indexBarAlc = bar[0].maxAlcool();
        for (int i=0; i<nrCocktails-1;i++)
            if(bar[i].pretIngrediente[bar[i].maxAlcool()] > bar[i+1].pretIngrediente[bar[i].maxAlcool()]){
                indexBarAlc = i;
                index =bar[i].maxAlcool();

            }
        println("Ingredientul cu cel mai inalt %alc este: " + bar[indexBarAlc].denumireIngrediente[index] + " cu taria de " + bar[indexBarAlc].pretIngrediente[index]+" %alc");
    }


}




