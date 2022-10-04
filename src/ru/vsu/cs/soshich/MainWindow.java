package ru.vsu.cs.soshich;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    private DrawPanel dp;

    public MainWindow() throws HeadlessException {
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(1200,1000);
        dp = new DrawPanel();
        this.add(dp);
    }
}
