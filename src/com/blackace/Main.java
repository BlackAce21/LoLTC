package com.blackace;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame jFrame = new JFrame("LoL Sweet");
        Toolkit tk = Toolkit.getDefaultToolkit();
        jFrame.setSize(tk.getScreenSize());
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setResizable(true);
        jFrame.setVisible(true);
        JPanel jPanel = new JPanel();

        JButton button = new JButton("Click Me");

        button.setToolTipText("Test");


        jPanel.add(button);
        jFrame.add(jPanel);


        System.out.println("Program starting....");

    }
}
