package chap13.forms.polygons;

import javax.swing.*;

public class DrawPolygons {
    public static void main(String[] args) {
        // cria frame para PolygonsJPanel
        JFrame frame = new JFrame("Drawing Polygons");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PolygonsJPanel polygonsJPanel = new PolygonsJPanel();
        frame.add(polygonsJPanel);
        frame.setSize(280, 270);
        frame.setVisible(true);
    }
}
