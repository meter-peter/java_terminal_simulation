package com.company;


import java.util.*;
import java.awt.Point;

public class Table {
    public Block[][] table;


    public Table() {
        table = new Block[20][20];
        for (int i = 0; i<20; i++) {
            for(int j=0;j<20;j++){
                table[i][j] = new Block('_',false,new Point(i,j));

            }

        }
    }


    public void Step(){
        for (int i = 0; i<20; i++) {
            for(int j=0;j<20;j++){
                if(table[i][j].haschar){
                    int number = new Random().nextInt(1 + 1) -1;
                    Block tempobj= table[i][j];
                    if(i+number = 19)
                    table[i][j]
                }

            }

        }


    }




    public void SpawnMonsters() {
        int ants = 0;
        int skats = 0;
        int randx, randy;


        while (ants < 60) {
            randx = new Random().nextInt(20);
            randy = new Random().nextInt(20);
            if (!table[randx][randy].haschar)
                table[randx][randy].setAnimal(new Ant());
            table[randx][randy].setHaschar(true);
            ants++;
            System.out.println("Spawned : "+table[randx][randy].getView());
        }
        while (skats<10) {
            randx = new Random().nextInt(20);
            randy = new Random().nextInt(20);
            if (!table[randx][randy].haschar)
                table[randx][randy].setAnimal(new Skathari());
            table[randx][randy].setHaschar(true);
            skats++;
            System.out.println("Spawned : "+table[randx][randy].getView());

        }
    }

    public void updateframe() {
        for (int i=0;i<20;i++) {
             System.out.println("");
            for (int j=0;j<20;j++) {
                System.out.print(table[i][j].getView()+"  ");
            }
            }
    }



}







