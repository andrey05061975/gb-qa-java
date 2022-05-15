package ru.geekbrains.lesson8;

import javax.swing.*;

public class MainWindow extends JFrame {
    private int posX = 300;
    private int posY = 200;

    private int widthW = 1024;
    private int heightW = 768;

    public MainWindow() {
        setupWindow();
        setVisible(true);
    }

    private void setupWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(widthW, heightW);
        setLocation(posX, posY);
        setResizable(true);
        setTitle("First GUI-App");

    }
}
