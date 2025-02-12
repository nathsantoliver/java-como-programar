package chap12.mouseDraw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;

public class PaintPanel extends JPanel {
    // lista das referências Point
    private final ArrayList<Point> points = new ArrayList<>();

    // configura GUI e registra rotinas de tratamento de evento de mouse
    public PaintPanel () {
        //trata evento de movimento de mouse do frame
        addMouseMotionListener(
                new MouseMotionAdapter() {  // classe interna anônima
                    // armazena coordenadas da ação de arrastar e repinta
                    @Override
                    public void mouseDragged(MouseEvent event) {
                        points.add(event.getPoint());
                        repaint();  // repinta JFrame
                    }
                }
        );
    }

    // desenha ovais em um quadro delimitador de 4 x 4 nas localizações especificadas na janela
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);    // limpa a área de desenho

        // desenha todos os pontos
        for (Point point : points) {
            g.fillOval(point.x, point.y, 4, 4);
        }
    }
}
