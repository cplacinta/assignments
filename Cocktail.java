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
    static int nrCocktails;

    //constructor cu parametri
    public Cocktail(String name, int nrIngrediente, int volum) {
        nume = name;
        this.nrIngrediente = nrIngrediente;
        this.pretIngrediente = new float[nrIngrediente];
        this.denumireIngrediente = new String[nrIngrediente];
        this.gradAlcool = new int[nrIngrediente];
        this.volum = volum;
        nrCocktails++;


    }

    public Cocktail() { //implicit
        nume = "Manhatan";
        nrIngrediente = 10;
        pretIngrediente = new float[nrIngrediente];
        denumireIngrediente = new String[nrIngrediente];
        gradAlcool = new int[nrIngrediente];
        volum = 50;
        nrCocktails++;
    }

    public Cocktail(Cocktail Martini) { // constructor de copiere
        nume = Martini.nume;
        nrIngrediente = Martini.nrIngrediente;
        volum = Martini.volum;
        pretIngrediente = new float[nrIngrediente];
        denumireIngrediente = new String[nrIngrediente];
        gradAlcool = new int[nrIngrediente];
        for (int i = 0; i < nrIngrediente; i++) {
            pretIngrediente[i] = Martini.pretIngrediente[i];
            denumireIngrediente[i] = (Martini.denumireIngrediente[i]);
            gradAlcool[i] = Martini.gradAlcool[i];
        }
        nrCocktails++;

    }


    static void println(String str) {
        System.out.println(str);
    }

    static void print(String str) {
        System.out.print(str);
    }

    void afisare() {
        println("denumire cocktail: " + nume);
        println("Numar ingridiente: " + nrIngrediente);
        println("Volumul coccktail-ului: " + volum + " ml");
        for (int i = 0; i < nrIngrediente; i++) {
            println("Denumire ingrideint: " + denumireIngrediente[i]);
            println("Pret ingrideint " + pretIngrediente[i]);
            println("Grad Alcool " + gradAlcool[i] + " %alc");
        }
    }

    public void randomize() {
        String[] cocktailName = {"Dry Martini", "Gin and tonic", "Sex on the beach", "Long Beach", "Manhattan", "Bloody Mary", "Mojito"};
        nume = cocktailName[(new Random().nextInt(cocktailName.length))];
        nrIngrediente = (new Random().nextInt(4)) + 1;
        volum = new Random().nextInt(500);
        for (int i = 0; i < nrIngrediente; i++)
            pretIngrediente[i] = (new Random().nextFloat());

        for (int i = 0; i < nrIngrediente; i++)
            gradAlcool[i] = (new Random().nextInt(90));

        String[] drinksName = {"vodka", "gin", "tonic", "rum", "martini", "whiskey", "coke", "sprite", "tomato juice"};
        for (int i = 0; i < nrIngrediente; i++)
            denumireIngrediente[i] = drinksName[new Random().nextInt(drinksName.length)];
    }

    public double sumGradAlc() {
        int sumAlcool = 0;
        for (int i = 0; i < nrIngrediente; i++)
            sumAlcool += gradAlcool[i];
        return sumAlcool;
    }

    public float sumPrice() {
        float sumPrice = 0;
        for (int i = 0; i < nrIngrediente; i++)
            sumPrice += pretIngrediente[i];
        return sumPrice;
    }

    public int maxPrice() {
        float maxPrice = 0;
        int index = 0;
        for (int i = 0; i < nrIngrediente; i++)
            if (maxPrice < pretIngrediente[i]) {
                maxPrice = pretIngrediente[i];
                index = i;
            }
        return index;
    }

    public int maxAlcool() {
        int maxAlcool = 0;
        int index = 0;
        for (int i = 0; i < nrIngrediente; i++)
            if (maxAlcool < gradAlcool[i]) {
                maxAlcool = gradAlcool[i];
                index = i;
            }
        return index;
    }

    //static void client(baniBuzunar, denumireCocktail) //

    static void client(double baniBuzunar, Cocktail aux) {
        int counter = 0;
        while (baniBuzunar >0){
            baniBuzunar-=aux.sumPrice();
            counter++;
        }
        println("Clientul dat poate comanda " + (counter-1) + " " + aux.nume);

    }


    public static void main(String[] args) {

        System.out.println("Introduceti numarul de cocktail-uri: ");
        Scanner sc = new Scanner(System.in);
        Integer nrCocktails = sc.nextInt();
        Cocktail[] bar = new Cocktail[nrCocktails];

        /*Cocktail margarita = new Cocktail(); // apelare constructor implicit
        Cocktail blueCarao = new Cocktail(); // apelare constructor implicit
        Cocktail sanFrancisco  = new Cocktail(); // apelare constructor implicit*/
        /*bar[0] = new Cocktail("Martini", 2, 150); // apelare constructor cu parametri
        bar[1] = new Cocktail("Bloody Mary", 2, 250); // apelare constructor cu parametri
        bar[2] = new Cocktail("Long Beach", 3, 250); // apelare constructor cu parametri
        bar[3] = new Cocktail("Gin and Tonic", 3, 100); // apelare constructor cu parametri

        for (int i = 0; i < nrCocktails; i++) {
            for (int j = 0; j < bar[i].nrIngrediente; j++) {
                println("Pentru cocktail-ul nr " + (i + 1) + " introduceti denumirea ingredientului cu nr " + (j + 1) + ", grad alcool si pretul acestuia:  ");
                bar[i].denumireIngrediente[j] = sc.next();
                bar[i].gradAlcool[j] = sc.nextInt();
                bar[i].pretIngrediente[j] = sc.nextFloat();
            }
        }*/

        //Cocktail martini = new Cocktail(margarita); // apelare constructor de copiere
        for (int i = 0; i < nrCocktails; i++) {
            bar[i] = new Cocktail();
            bar[i].randomize();
        }

        for (int i = 0; i < nrCocktails; i++)
            bar[i].afisare();
        println("----------------------------------------------------");

        println("Lista cocktail-uluri:");
        for (int i = 0; i < nrCocktails; i++)
            println(bar[i].nume + " ");


        int maxIngrediente = 0;
        int indexIngrediente = 0;
        for (int i = 0; i < nrCocktails; i++)
            if (maxIngrediente < bar[i].nrIngrediente) {
                maxIngrediente = bar[i].nrIngrediente;
                indexIngrediente = i;
            }
        println("Cea mai complicata bautura este: " + bar[indexIngrediente].nume + " care are " + bar[indexIngrediente].nrIngrediente + " ingrediente");

        double avgGradAlcool = 0;
        int totalNrIngrediente = 0;
        for (int i = 0; i < nrCocktails; i++) {
            avgGradAlcool += bar[i].sumGradAlc();
            totalNrIngrediente += bar[i].nrIngrediente;
        }
        println("Media gradului de alcool al tuturor bauturilor este de: " + (avgGradAlcool / totalNrIngrediente) + " %alc");

        double avgPriceIngredient = 0;
        for (int i = 0; i < nrCocktails; i++) {
            avgPriceIngredient += bar[i].sumPrice();
        }
        println("Media pretului ingredientilor este: " + (avgPriceIngredient / totalNrIngrediente) + " mdl");

        int indexPretingredient = 0;
        int indexBar = bar[0].maxPrice();
        float maxPriceIngredient = 0;
        for (int i = 0; i < nrCocktails; i++)
            if (maxPriceIngredient < bar[i].pretIngrediente[bar[i].maxPrice()]) {
                maxPriceIngredient = bar[i].pretIngrediente[bar[i].maxPrice()];
                indexBar = i;
                indexPretingredient = bar[i].maxPrice();

            }
        println("Ingredientul cel mai costisitor este: " + bar[indexBar].denumireIngrediente[indexPretingredient] + " cu valoarea de " + bar[indexBar].pretIngrediente[indexPretingredient] + " mdl");

        int index = 0;
        int indexBarAlc = bar[0].maxAlcool();
        int maxAlc = 0;
        for (int i = 0; i < nrCocktails; i++)
            if (maxAlc < bar[i].gradAlcool[bar[i].maxAlcool()]) {
                maxAlc = bar[i].gradAlcool[bar[i].maxAlcool()];
                indexBarAlc = i;
                index = bar[i].maxAlcool();

            }
        println("Ingredientul cu cel mai inalt %alc este: " + bar[indexBarAlc].denumireIngrediente[index] + " cu taria de " + bar[indexBarAlc].gradAlcool[index] + " %alc");


        Cocktail.client(50.0, bar[0]);
    }


}




