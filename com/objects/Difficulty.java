package com.objects;
import java.util.Scanner;
public class Difficulty {
    private String difficuty;
    private int size; 
    private int mineSpawnRate; //of 10
    private int bonusExplosionRate; //of 10
    private int qttTreasures;
    private int lives;
    private int sparingRate; //of 10


    private void easy() {
        difficuty = "easy";
        size = 10;
        mineSpawnRate = 2;
        bonusExplosionRate = 3;
        qttTreasures = 2;
        lives = 3;
        sparingRate = 3;
    }

    private void normal() {
        difficuty = "normal";
        size = 15;
        mineSpawnRate = 3;
        bonusExplosionRate = 2;
        qttTreasures = 2;
        lives = 2;
        sparingRate = 2;
    }

    private void hard() {
        difficuty = "hard";
        size = 15;
        mineSpawnRate = 4;
        bonusExplosionRate = 0;
        qttTreasures = 1;
        lives = 2;
        sparingRate = 2;
    }

    private void insane() {
        difficuty = "insane";
        size = 17;
        mineSpawnRate = 6;
        bonusExplosionRate = 0;
        qttTreasures = 1;
        lives = 1;
        sparingRate = 0;
    }

    private boolean menu() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Select a difficulty:");
        System.out.println("E - Easy - few mines, two treasures, high bonus explosion rate, smaller map, 3 lives, high chance of not detonating mines");
        System.out.println("N - Normal - some mines, two treasures, bonus explosions, two lives, chances of not detonating mines");
        System.out.println("H - Hard - some mines, one treasure, two lives");
        System.out.println("I - Insane - lots of mines, one treasure, one live");
        switch (leitor.nextLine().toLowerCase().charAt(0)) {
            case 'e' :
                easy();
                leitor.close();
                return false;
            case 'n' :
                normal();
                leitor.close();
                return false;
            case 'h' :
                hard();
                leitor.close();
                return false;
            case 'i' :
                insane();
                leitor.close();
                return false;
            default: 
                System.out.println("Invalid Option.");
                leitor.close();
                return true;
        }
    }

    public void selectDifficulty() {
        boolean condition = true;
        while (condition) {
            condition = menu();
        }
    }

    //Getters
    public int getSize() {
        return size;
    }
    public int getMineSpawnRate() {
        return mineSpawnRate;
    }
    public int getBonusExplosionRate() {
        return bonusExplosionRate;
    }
    public int getQttTreasures() {
        return qttTreasures;
    }
    public int getLives() {
        return lives;
    }
    public int getSparingRate() {
        return sparingRate;
    }
    public String getDifficuty() {
        return difficuty;
    }
}

