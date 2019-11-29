package com.company;

import java.util.Arrays;
import java.util.Random;

public class Game {
    Random rand = new Random();
    int value = rand.nextInt(400);
    Table table;
    char frame[][];


    public Game() {
        table = new Table();
        table.SpawnMonsters();
        update();


    }

    public void update(){
        for (int i=0;i<20;i++){
            for (int j=0;j<20;j++){
                System.out.println(table.getTable()[i][j]);
            }

        }

    }

}
