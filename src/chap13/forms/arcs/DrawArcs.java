package chap13.forms.arcs;

import javax.swing.*;

public class DrawArcs {
    public static void main(String[] args) {
        // cria frame para ArcsJPanel
        JFrame frame = new JFrame("Drawing Arcs");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ArcsJPanel arcsJPanel = new ArcsJPanel();
        frame.add(arcsJPanel);
        frame.setSize(300, 210);
        frame.setVisible(true);
    }
}
