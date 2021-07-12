package com.iunetworks;

public class ActionInteger {
    public static char[] reversCHarArray(char[] crowd) {
        for (int i = 0; i < crowd.length / 2; i++) {
            char box = crowd[i];
            crowd[i] = crowd[crowd.length - 1 - i];
            crowd[crowd.length - 1 - i] = box;
        }
        return crowd;
    }

    public static void digitInteger(int number) {
        int wholeNumber = number;
        int balanceNumber = 0;
        do {
            balanceNumber = wholeNumber % 10;
            wholeNumber = wholeNumber / 10;
            System.out.println(balanceNumber);
        }
        while (wholeNumber > 0);

    }
}

