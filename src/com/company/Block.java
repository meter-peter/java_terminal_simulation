package com.company;


import java.awt.*;

public class Block extends Point {
    char view;
    boolean haschar;
    Animal animal;

    public Block(char view, boolean haschar, Point point) {
        super(point);
        this.view = view;
        this.haschar = haschar;
    }

    public char getView() {
        return view;
    }

    public void setView(char view) {
        this.view = view;
    }

    public void setHaschar(boolean haschar) {
        this.haschar = haschar;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
        animal.setCords(this.getLocation());
        setView(animal.getS());
        System.out.println(view);

    }
}



