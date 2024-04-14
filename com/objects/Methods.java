package com.objects;

import java.util.Random;
import java.util.Scanner;

public class Methods {
    Random random = new Random();
    Scanner scStr = new Scanner(System.in);
    Scanner scInt = new Scanner(System.in);
    
    public int getRandomNumber(int min, int max) {
        return random.nextInt() * (max - min) + min;
    }

    public int intInput(String message) {
        try {
            System.out.println(message);
            return scInt.nextInt();
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid type of answer, it should be a integer!");
            return 0;
        }
    }
 
    public String strInput(String message) {
        try {
            System.out.println(message);
            return scStr.nextLine();
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid type of answer, it should be a text!");
            return "";
        }
    }

    public boolean isValid(int x, int y, int size) {
        return (x >= 0 && x < size && y>=0 && y < size);
    }
}
