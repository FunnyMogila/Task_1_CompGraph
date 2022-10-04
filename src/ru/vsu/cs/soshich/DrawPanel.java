package ru.vsu.cs.soshich;

import ru.vsu.cs.soshich.elements.Cloud;
import ru.vsu.cs.soshich.elements.LeafTree;
import ru.vsu.cs.soshich.elements.NeedlesTree;
import ru.vsu.cs.soshich.elements.Sun;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class DrawPanel extends JPanel {

    private Sun s;
    private LeafTree f;
    private NeedlesTree n;
    private Random rnd = new Random();
    private Cloud c;

    public DrawPanel() {
        s = new Sun(600,100,50,30,25, Color.ORANGE);
    }

    @Override
    protected void paintComponent(Graphics g) {

        int width = getWidth();
        int height = getHeight();

        Graphics2D gr = (Graphics2D) g;
        g.setColor(new Color(0x40440C));
        gr.fillRect(0,0,width,height);
        g.setColor(new Color(0x9BB1F8));
        gr.fillRect(0,0,width,height/2);
        int he = (height / 2) + 50;
        boolean flag = true;
        for (int i = 0; i < 4; i++) {
            int step = 0;
            if (flag) {
                for (int j = 0; j < 4; j++) {
                f = new LeafTree(100 + step + (i+50), he, 200, 100, 50, 50, new Color(0x7C7124), new Color(0x247921));
                f.draw(gr);
                n = new NeedlesTree(250 + step, he, 200, 100, 50, 50, new Color(0x673D1C), new Color(0x314F26));
                n.draw(gr);
                step += 250;
                flag = false;
            }
            } else if (!flag) {
                for (int j = 0; j < 4; j++) {
                    n = new NeedlesTree(100 + step, he, 200, 100, 50, 50, new Color(0x673D1C), new Color(0x314F26));
                    n.draw(gr);
                    f = new LeafTree(250 + step, he, 200, 100, 50, 50, new Color(0x7C7124), new Color(0x247921));
                    f.draw(gr);
                    step += 250;
                    flag = true;
                }
            }
            he = he + 200;
        }
        s.draw(gr);
        int step1 = 0;
        for (int i = 0; i < 4; i++) {
            c = new Cloud(100+step1,100,50,60,Color.WHITE);
            c.draw(gr);
            step1 = step1+100;
        }
        for (int i = 0; i < 4; i++) {
            c = new Cloud(300+step1,100,50,60,Color.WHITE);
            c.draw(gr);
            step1 = step1+100;
        }
        int step2 = 0;
        for (int i = 0; i < 9; i++) {
            c = new Cloud(50+step2,230,50,60,Color.WHITE);
            c.draw(gr);
            step2 = step2+100;
        }
        gr.setColor(Color.BLACK);
        gr.setFont(new Font("Times",Font.PLAIN,50));
        gr.drawString("Какой чудесный на улице день!",50,200);
    }
}