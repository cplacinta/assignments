package HomeWork.assignments;


import static HomeWork.assignments.Personaj.println;

public class GameMain {
    public static void main (String[] args){
        Personaj [] frostwolves = new Personaj[10];
        for(int i=0; i< frostwolves.length;i++){
            frostwolves[i] = new Personaj();
            frostwolves[i].randomize();
            frostwolves[i].afisareaMsj();
        }

        Personaj [] thunderLord = new Personaj[10];
        for(int i=0; i< frostwolves.length;i++){
            thunderLord[i] = new Personaj();
            thunderLord[i].randomize();
            println((thunderLord[i].afisareaMsj()));

        }
        // de creat 2 array din clanuri diferite care se vor lupta intre ei
        for (int i =0; i<10; i++){
            frostwolves[i].afisareDate();
            thunderLord[i].afisareDate();
            Personaj.fight(frostwolves[i],thunderLord[i]);
        }


    }
}
