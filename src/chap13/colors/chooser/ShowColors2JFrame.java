package chap13.colors.chooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShowColors2JFrame extends JFrame {
    private final JButton changeColorJButton;
    private Color color = Color.LIGHT_GRAY;
    private final JPanel colorJPanel;

    // configura a GUI
    public ShowColors2JFrame() {
        super("Using JColorChooser");

        // cria JPanel para exibir as cores
        colorJPanel = new JPanel();
        colorJPanel.setBackground(color);

        // configura changeColorJButton e registra sua rotina de tratamento de evento
        changeColorJButton = new JButton("Change Color");
        changeColorJButton.addActionListener(
                new ActionListener() {  // classe interna anônima
                    // exibe JColorChooser quando o usuário clica no botão
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        color = JColorChooser.showDialog(
                                ShowColors2JFrame.this, "Choose a color", color);

                        // configura a cor padrão, se nenhuma cor for retrnada
                        if (color == null) {
                            color = Color.LIGHT_GRAY;
                        }

                        // muda a cor de fundo do painel de conteúdo
                        colorJPanel.setBackground(color);
                    }
                }
        );

        add(colorJPanel, BorderLayout.CENTER);
        add(changeColorJButton, BorderLayout.SOUTH);

        setSize(400, 130);
        setVisible(true);
    }
}
