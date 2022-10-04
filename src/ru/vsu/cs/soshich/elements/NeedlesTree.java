package ru.vsu.cs.soshich.elements;

import ru.vsu.cs.soshich.DrawUtils;
import ru.vsu.cs.soshich.elements.Tree;

import java.awt.*;

public class NeedlesTree extends Tree {

    private int n;

    public NeedlesTree(int x, int y, int h, int w, int l, int n, Color c1, Color c2) {
        super(x, y, h, w, l, c1, c2);
        this.n = n;
    }


    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void draw(Graphics2D g) {
        DrawUtils.drawNeedleTree(g,x,y,h,w,l,n,c1,c2);
    }
}
