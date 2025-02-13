package chap12.layouts.panel;

import javax.swing.*;
import java.awt.*;

public class PanelFrame extends JFrame {
    private final JPanel buttonJPanel; // painel para armazenar botões
    private final JButton[] buttons;

    // construtor sem argumento
    public PanelFrame() {
        super("Panel Demo");

        buttons = new JButton[5];
        buttonJPanel = new JPanel();
        buttonJPanel.setLayout(new GridLayout(1, buttons.length));

        // cria e adiciona botões
        for (int count = 0; count < buttons.length; count++) {
            buttons[count] = new JButton("Button " + (count + 1));
            buttonJPanel.add(buttons[count]); // adiciona botão ao painel
        }

        add(buttonJPanel, BorderLayout.SOUTH); // adiciona painel ao JFrame
    }
}
