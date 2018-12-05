package HomeWork.assignments;

import java.util.*;
import java.util.Random;

public class Personaj {

    String nume = "YO";
    String rasa = "YO"; // elf, human. wizard, orc, dwarf
    String clas = "YO"; // warrior, druid, necromancer, paladin, Sorceress, assassin
    Boolean sex = true;
    int hp = 0;
    short level = 0;
    int power = 0;
    byte nrWeapons = 0;
    int[] weaponsDestructivePower = new int[nrWeapons];

    public void randomize() {
        nume = "Yolo";
        sex = (new Random().nextBoolean());
        hp = (new Random().nextInt());
        level = (short) (new Random().nextInt());
        power = (new Random().nextInt());
        nrWeapons = (byte) (new Random().nextInt(10));
        weaponsDestructivePower = new int[nrWeapons];
        /*for (int i = 0; i < nrWeapons; i++)
            weaponsDestructivePower[i] = (new Random().nextInt(1000));*/
        String[] rasaArray = {"Elf", "Human", "Wizard", "Orc", "Dwarf"};
        rasa = rasaArray[new Random().nextInt(rasaArray.length)];
        String[] clasArray = {"Warrior", "Druid", " Necromancer", " Paladin", " Sorceress", "Assassin"};
        clas = clasArray[new Random().nextInt(clasArray.length)];

    }

    public String afisareaMsj() {
        switch (rasa) {
            case "elf":
                return "I've been on earth for thousands of years";
            case "human":
                return "The Orc's will DIE!!!";
            case "wizard":
                return "Gandalf is the greatest wizard of all time";
            case "orc":
                return "Victory or DEATH!!!";
            case "dwarf":
                return "Take my axe";
            default:
                return "You entered an unavailable race";
        }
    }

    public Personaj child(Personaj A) {
        if (this.sex.equals(A.sex)) {
            return null;
        } else {
            if ((this.rasa.equals("elf") &&(A.rasa.equals("elf")))){
                Personaj childNew = new Personaj();
                childNew.nume = this.nume+A.nume;
                return childNew;
            }

        }
        return null;
    }



}
