package chap12.jComboBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ComboBoxFrame extends JFrame {
    private final JComboBox<String> imagesJComboBox;    // contém nomes de ícones
    private final JLabel label;     // exibe o ícone selecionado

    private static final String[] names = {"logo4.png", "penguim2.png", "logo5.png", "penguim3.png"};
    private final Icon[] icons = {
            new ImageIcon(getClass().getResource(names[0])),
            new ImageIcon(getClass().getResource(names[1])),
            new ImageIcon(getClass().getResource(names[2])),
            new ImageIcon(getClass().getResource(names[3]))
    };

    // construtor ComboBoxFrame adiciona JComboBox ao JFrame
    public ComboBoxFrame() {
        super("Testing JComboBox");
        setLayout(new FlowLayout());    // configura o layout de frame

        imagesJComboBox = new JComboBox<String>(names); // configura JComboBox
        imagesJComboBox.setMaximumRowCount(3);  // exibe três linhas

        imagesJComboBox.addItemListener(
                new ItemListener() {    // classe interna anônima
                    // trata evento JComboBox
                    @Override
                    public void itemStateChanged(ItemEvent event) {
                        // determina se o item está selecionado
                        if (event.getStateChange() == ItemEvent.SELECTED) {
                            label.setIcon(icons[imagesJComboBox.getSelectedIndex()]);
                        }
                    }
                }
        );

        add(imagesJComboBox);   // adiciona caixa de combinação ao JFrame
        label = new JLabel(icons[0]);   // exibe primeiro ícone
        add(label); // adiciona rótulo ao JFrame
    }
}
