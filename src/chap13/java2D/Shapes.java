package chap13.java2D;

import javax.swing.*;

public class Shapes {
    public static void main(String[] args) {
        // cria frame para ShapesJPanel
        JFrame frame = new JFrame("Drawing 2D shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // cria ShapesJPanel
        ShapesJPanel shapesJPanel = new ShapesJPanel();
        frame.add(shapesJPanel);
        frame.setSize(425, 200);
        frame.setVisible(true);
    }
}
