package ru.vsu.cs.soshich.elements;

import ru.vsu.cs.soshich.DrawUtils;

import java.awt.*;

public class Cloud {
    private int x,y,w,h;
    private Color c;

    public Cloud(int x, int y, int w, int h, Color c) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.c = c;
    }

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

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public Color getC() {
        return c;
    }

    public void setC(Color c) {
        this.c = c;
    }

    public void draw(Graphics2D g) {
        DrawUtils.drawCloud(g,x,y,h,w,c);
    }
}
