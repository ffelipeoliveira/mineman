package com.objects;

public class Table {
    private Difficulty difficulty;
    private Methods methods;
    private int[][]table = new int[difficulty.getSize()][difficulty.getSize()];

    public Table (Difficulty difficulty) {
        this.difficulty = new Difficulty();
        this.difficulty = difficulty;
    }

    public void generateTable() {
        for (int i = 0; i < difficulty.getSize(); i++) {
            for (int j = 0; j < difficulty.getSize(); j++) {
                if(methods.getRandomNumber(1, 10) < difficulty.getMineSpawnRate()) {
                    table[i][j] = 1;
                }
                else {
                    table[i][j] = 0;
                }
            }

            table[0][0] = 0;
            table[0][1] = 0;
            table[1][0] = 0;
            table[1][1] = 0;
            table[1][2] = 0;
            for (int k = 0; k < difficulty.getQttTreasures(); k++) {
                table[methods.getRandomNumber(2, difficulty.getSize()-1)][methods.getRandomNumber(2, difficulty.getSize()-1)] = 4;
            }
        }
    }

    public int[][] getTable() {
        return table;
    }
}
