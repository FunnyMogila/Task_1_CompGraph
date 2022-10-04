package ru.vsu.cs.soshich;

import java.awt.*;

public class DrawUtils {

    public static void drawSun(Graphics2D g, int x, int y, int r, int l, int n, Color c) {
        g.setColor(c);
        g.fillOval(x-r,y-r,r*2,r*2);
        double da = 2*Math.PI / n;
        for (int i = 0; i < n; i++) {
            double a = i * da;
            double x1 = r*Math.cos(a) + x;
            double y1 = r*Math.sin(a) + y;
            double x2 = (r+l)*Math.cos(a) + x;
            double y2 = (r+l)*Math.sin(a) + y;
            g.drawLine((int)x1,(int)y1,(int)x2,(int)y2);
        }
    }

    public static void drawLeafTree(Graphics2D g, int x, int y, int h, int w, int l, int r, Color c1, Color c2 ) {
        g.setColor(c1);
        g.fillRect(x,y,w/5,l);
        g.setColor(c2);
        g.fillOval(x-(w/5)-(w/5),y-(w),r*2,r*2);
    }

    public static void drawNeedleTree(Graphics2D g, int x, int y, int h, int w, int l, int n, Color c1, Color c2) {
        g.setColor(c1);
        g.fillRect(x,y,w/5,l);
        g.setColor(c2);
        g.fillPolygon(new int[] {x-(w/5*2), x+(w/5/2), x+(w/5*3)}, new int[] {y, y-(h-l), y}, 3);
    }

    public static void drawCloud(Graphics2D g, int x, int y, int h, int w, Color c) {
        g.setColor(c);
        g.fillOval(x,y,h+20,w+20);
        g.fillOval(x-30,y-20,w+20,h);
        g.fillOval(x+30,y-20,w+40,h);
    }
}
