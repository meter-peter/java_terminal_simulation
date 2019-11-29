package com.company;

import java.awt.*;
import java.util.Objects;

public class Animal {
    Point cords;
    char s;


    public char getS() {
        return s;
    }

    public Animal(char s) {

        this.s = s;
    }

    public Point getCords() {
        return cords;
    }

    public void setCords(Point cords) {
        this.cords = cords;
    }

    public void setS(char s) {
        this.s = s;
    }
}


