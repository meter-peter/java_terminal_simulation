package com.company;
import javafx.scene.control.Tab;

import javax.xml.stream.Location;
import java.util.*;
import java.awt.Point;

public class Table {

    Block[][] table;
    Random rand = new Random();
    int value ;





    public Table() {
        table = new Block[20][20];
        for (int i = 0; i <20; i++) {
            for(int j=0;j <20;j++){
                table[i][j] = new Block(' ',false,new Point(i,j));
                //System.out.print(table[i][j].getView());
            }

        }
    }

    public Block[][] getTable() {
        return table;
    }

    public void SpawnMonsters() {
        int ants = 0;
        int skats = 0;

        while (ants < 60) {
            value = rand.nextInt(20);
            if (!table[value][value].haschar)
                table[value][value].setAnimal(new Ant());
            table[value][value].setHaschar(true);
            ants++;
           // System.out.print(table[value][value].getView());
        }
        while (skats<10) {
            value = rand.nextInt(20);
            if (!table[value][value].haschar)
                table[value][value].setAnimal(new Skato());
                table[value][value].setHaschar(true);
               // System.out.print(table[value][value].getView());
            ants++;
        }
            for(int i=0;i<20;i++){
                System.out.println("");
                for (int j=0;j<20;j++){
                    System.out.println(table[i][j].getView());
                }

        }
    }

            }







