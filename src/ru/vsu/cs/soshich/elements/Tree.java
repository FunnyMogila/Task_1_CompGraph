package ru.vsu.cs.soshich.elements;

import java.awt.*;

public class Tree {

    protected int x,y,h,w,l;
    protected Color c1,c2;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public Color getC1() {
        return c1;
    }

    public void setC1(Color c1) {
        this.c1 = c1;
    }

    public Color getC2() {
        return c2;
    }

    public void setC2(Color c2) {
        this.c2 = c2;
    }

    public Tree(int x, int y, int h, int w, int l, Color c1, Color c2) {
        this.x = x;
        this.y = y;
        this.h = h;
        this.w = w;
        this.l = l;
        this.c1 = c1;
        this.c2 = c2;
    }
}
