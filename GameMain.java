package HomeWork.assignments;



public class GameMain {
    public static void main (String[] args){
        Personaj [] rpg = new Personaj[1];
        for(int i=0; i< rpg.length;i++){
            rpg[i].randomize();
            rpg[i].afisareaMsj();
        }



    }
}
