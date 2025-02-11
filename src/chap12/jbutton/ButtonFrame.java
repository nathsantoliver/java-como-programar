package chap12.jbutton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonFrame extends JFrame {
    private final JButton plainJButton; // botão apenas com texto
    private final JButton fancyJButton; // botão com ícones

    // ButtonFrame adiciona JButtons ao JFrame
    public ButtonFrame() {
        super("Testing Buttons");
        setLayout(new FlowLayout());

        plainJButton = new JButton("Plain Button"); // botão com texto
        add(plainJButton);

        Icon bug1 = new ImageIcon(getClass().getResource("logo3.png"));
        Icon bug2 = new ImageIcon(getClass().getResource("penguim.png"));
        fancyJButton = new JButton("Fancy Button", bug1);   // configura imagem
        fancyJButton.setRolloverIcon(bug2); // configura imagem de rollover
        add(fancyJButton);  // adiciona fancyJButton ao JFrame

        // cria novo ButtonHandler de tratamento para tratamento de evento de botão
        ButtonHandler handler = new ButtonHandler();
        fancyJButton.addActionListener(handler);
        plainJButton.addActionListener(handler);
    }

    // classe interna para tratamento de evento de botão
    private class ButtonHandler implements ActionListener {
        // trata evento de botão
        @Override
        public void actionPerformed(ActionEvent event) {
            JOptionPane.showMessageDialog(ButtonFrame.this,
                    String.format("You pressed: %s", event.getActionCommand()));
        }
    }
}
