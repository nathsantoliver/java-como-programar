package chap12.adapters;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseDetailsFrame extends JFrame {
    private String details; // String exibida na statusBar
    private final JLabel statusBar; // JLabel na parte inferior da janela

    // construtor configura String de barra de título e registra o listener de mouse
    public MouseDetailsFrame() {
        super("Mouse clicks and buttons");

        statusBar = new JLabel("Click the mouse");
        add(statusBar, BorderLayout.SOUTH);
        addMouseListener(new MouseClickHandler());  // adiciona tratamento de evento
    }

    // classe interna para tratar eventos de ouse
    private class MouseClickHandler extends MouseAdapter {
        // trata evento de clique de mouse e determina qual botão foi pressionado
        @Override
        public void mouseClicked(MouseEvent event) {
            int xPos = event.getX();    // obtém a posição x do mouse
            int yPos = event.getY();    // obtém a posição y do mouse

            details = String.format("Clicked %d time(s)",
                    event.getClickCount());

            if (event.isMetaDown()) {   // botão direito do mouse
                details += " with right mouse button";
            } else if (event.isAltDown()) {     // botão do meio do mouse
                details += " with center mouse button";
            } else {    // botão esquerdo do mouse
                details += " with left mouse button";
            }

            statusBar.setText(details);     // exibe mensagem em statusBar
        }
    }
}
