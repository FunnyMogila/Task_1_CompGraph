package ru.vsu.cs.soshich.elements;

import ru.vsu.cs.soshich.DrawUtils;
import ru.vsu.cs.soshich.elements.Tree;

import java.awt.*;

public class LeafTree extends Tree {

    private int r;

    public LeafTree(int x, int y, int h, int w, int l, int r, Color c1, Color c2) {
        super(x, y, h, w, l, c1, c2);
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public void draw(Graphics2D g) {
        DrawUtils.drawLeafTree(g,x,y,h,w,l,r,c1,c2);
    }
}
