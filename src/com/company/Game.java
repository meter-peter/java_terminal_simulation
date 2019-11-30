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

        table.updateframe();


    }

    public void clearbodies(){
        for(table.table.)

    }




}
