package HomeWork.assignments;

import java.util.*;

public  class CocktailMain {
    static void println(String str) {
        System.out.println(str);
    }

    static void print(String str) {
        System.out.print(str);
    }


    public static void main(String[] args) {

        System.out.println("Introduceti numarul de cocktail-uri: ");
        Scanner sc = new Scanner(System.in);
        Integer nrCocktails = sc.nextInt();
        Cocktail[] bar = new Cocktail[nrCocktails];

        /*bar[0] = new Cocktail(); // apelare constructor implicit
        bar[1] = new Cocktail(); // apelare constructor implicit
        bar[2] = new Cocktail(); // apelare constructor implicit*/
        bar[0] = new Cocktail("Martini",2,150); // apelare constructor cu parametri
        bar[1] = new Cocktail("Bloody Mary",2,250); // apelare constructor cu parametri
        bar[2] = new Cocktail("Long Beach",3,50); // apelare constructor cu parametri

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
        println("Gradul de alcool al tuturor bauturilor este de: " + (avgGradAlcool/totalNrIngrediente));

        double avgPriceIngredient=0;
        for(int i = 0; i< nrCocktails;i++){
            avgPriceIngredient+=bar[i].sumPrice();
        }
        println("Media ingredientilor este: " + (avgPriceIngredient/totalNrIngrediente));

        int maxPriceIngredient = 0;
        for (int i=0; i<nrCocktails;i++)
            if(maxPriceIngredient<bar[i].maxPrice())
                maxIngrediente = bar[i].maxPrice();
        println("Ingredientul cel mai costisitor este: " + maxIngrediente);

        int maxgradAlcool = 0;
        for (int i=0; i<nrCocktails;i++)
            if(maxgradAlcool<bar[i].maxAlcool())
                maxgradAlcool = bar[i].maxAlcool();
        println("Ingredientul cel mai costisitor este: " + maxgradAlcool);


    }
}




