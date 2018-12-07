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

        bar[0] = new Cocktail(); // apelare constructor implicit
        bar[1] = new Cocktail(); // apelare constructor implicit
        bar[2] = new Cocktail(); // apelare constructor implicit
        //bar[3] = new Cocktail(); // apelare constructor implicit
        //Cocktail martini = new Cocktail(cocktails[0]); // apelare constructor de copiere
        /*cocktails[1] = new Cocktail("BlodyMary",2,50); // apelare constructor cu parametri
        cocktails[2] = new Cocktail("LongBeach",3,50); // apelare constructor cu parametri
        cocktails[3] = new Cocktail("Martini",3,50); // apelare constructor cu parametri

        for (int i = 0; i < nrCocktails; i++) {
            for(int j = 0; j< cocktails[i].nrIngrediente; j++) {
                println("Pentru cocktail-ul nr " +(i+1)+" introduceti grad alcool, denumirea ingredientului si pretul acestuia:  ");
                cocktails[i].denumireIngrediente[j] = sc.next();
                cocktails[i].gradAlcool[j] = sc.nextInt();
                cocktails[i].pretIngrediente[j] = sc.nextFloat();
            }
        }*/
        for (int i=0; i < nrCocktails; i++)
            bar[i].randomize();


        for (int i = 0; i < nrCocktails; i++)
            bar[i].afisare();
    }
}




