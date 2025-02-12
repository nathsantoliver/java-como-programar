package chap12.mouseDraw;

import javax.swing.*;
import java.awt.*;

public class Painter {
    public static void main(String[] args) {
        // cria o JFrame
        JFrame application = new JFrame("A simple paint program");

        PaintPanel paintPanel = new PaintPanel();
        application.add(paintPanel, BorderLayout.CENTER);

        // cria um rótulo e o coloca em SOUTH do borderLayout
        application.add(new JLabel("Drag the mouse to draw"), BorderLayout.SOUTH);

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(400, 200);
        application.setVisible(true);
    }
}
