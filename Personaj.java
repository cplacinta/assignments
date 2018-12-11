package HomeWork.assignments;

import java.util.*;
import java.util.Random;

public class Personaj {

    String nume;
    String rasa; // elf, human. wizard, orc, dwarf
    String clas;// warrior, druid, necromancer, paladin, Sorceress, assassin
    Boolean sex;
    int hp;
    short level;
    int power;
    byte nrWeapons;
    int[] weaponsDestructivePower = new int[nrWeapons];
    static int playersCount;

    Personaj() {
        nume = "Player " + playersCount;
        rasa = "Elf";
        clas = "Warrior";
        sex = true;
        hp = 0;
        level = 0;
        nrWeapons = 0;
        weaponsDestructivePower = new int[nrWeapons];
        power =0;
        playersCount++;
    }

    static void println(String str) {
        System.out.println(str);
    }

    static void print(String str) {
        System.out.print(str);
    }

    public static void fight(Personaj clanOne, Personaj clanTwo) {
        if ((clanOne.rasa.equals("Human") && clanTwo.rasa.equals("Elf")) || (clanOne.rasa.equals("Elf") && clanTwo.rasa.equals("Wizard")) || ((clanOne.rasa.equals("Wizard")) && clanTwo.rasa.equals("Undead"))
                || ((clanOne.rasa.equals("Undead")) && (clanTwo.rasa.equals("Dwarf"))) || (clanOne.rasa.equals("Dwarf") && clanTwo.rasa.equals("Orc")) || ((clanOne.rasa.equals("Orc")) && clanTwo.rasa.equals("Human"))) {
                clanOne.power *= 2;

        } else if ((clanTwo.rasa.equals("Human") && clanOne.rasa.equals("Elf")) || (clanTwo.rasa.equals("Elf") && clanOne.rasa.equals("Wizard")) || ((clanTwo.rasa.equals("Wizard")) && clanOne.rasa.equals("Undead"))
                || ((clanTwo.rasa.equals("Undead")) && (clanOne.rasa.equals("Dwarf"))) || (clanTwo.rasa.equals("Dwarf") && clanOne.rasa.equals("Orc")) || ((clanTwo.rasa.equals("Orc")) && clanOne.rasa.equals("Human"))) {
                clanTwo.power *= 2;
        }

        while (clanOne.hp >= 0 && clanTwo.hp >= 0) {
            clanOne.hp -= clanTwo.power;
            clanTwo.hp -= clanOne.power;

        }
        if (clanOne.hp <= 0&& clanTwo.hp <=0) {
            println("It's a ite between " + clanOne.nume + " and " + clanTwo.nume);
        } else if(clanTwo.hp <=0) {
            println(clanOne.nume + ": " + clanOne.rasa + " " + clanOne.clas + " won the battle vs " + clanTwo.nume + ": " + clanTwo.rasa + " " + clanTwo.clas);
        } else {println(clanTwo.nume + ": " + clanTwo.rasa + " " + clanTwo.clas + " won the battle vs " + clanOne.nume + ": " + clanOne.rasa + " " + clanOne.clas);;}

    }


    // de creat metoda fight
    // static void fight(2 parametri )


    public void randomize() {
        sex = (new Random().nextBoolean());
        hp = (new Random().nextInt(1000));
        level = (short) (new Random().nextInt(5) + 1);
        nrWeapons = (byte) (new Random().nextInt(10) + 1);
        weaponsDestructivePower = new int[nrWeapons];
        for (int i = 0; i < nrWeapons; i++)
            weaponsDestructivePower[i] = (new Random().nextInt(100));
        String[] rasaArray = {"Elf", "Human", "Wizard", "Orc", "Dwarf", "Undead"};
        rasa = rasaArray[new Random().nextInt(rasaArray.length)];

        String[] clasArray = {"Warrior", "Druid", " Necromancer", " Paladin", " Sorceress", "Assassin"};
        clas = clasArray[new Random().nextInt(clasArray.length)];

        for (int i=0; i<nrWeapons; i++)
            power += weaponsDestructivePower[i]*level;


    }

    public String afisareaMsj() {
        switch (rasa) {
            case "Elf":
                return "I've been on earth for thousands of years";
            case "Human":
                return "The Orc's will DIE!!!";
            case "Wizard":
                return "Gandalf is the greatest wizard of all time";
            case "Orc":
                return "Victory or DEATH!!!";
            case "Dwarf":
                return "Take my axe";
            case "Undead":
                return "I am the Darkness!";
            default:
                return "You entered an unavailable race";
        }
    }

    public Personaj child(Personaj A) {
        if (this.sex.equals(A.sex)) {
            return null;
        } else {
            if ((this.rasa.equals("elf") && (A.rasa.equals("elf")))) {
                Personaj childNew = new Personaj();
                childNew.nume = this.nume + A.nume;
                return childNew;
            }

        }
        return null;
    }


    public void afisareDate() {
        print(nume + " " + rasa + " " + clas + ": level: " + level + ", HP: " + hp + ", Number of weapons: " + nrWeapons + ", weapon's power:");
        for (int i = 0; i < nrWeapons; i++) {
            print(" " + weaponsDestructivePower[i]);
        }
        println(" and total power: " +power);
    }
}
