package chap12.jList.multipleSel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultipleSelectionFrame extends JFrame {
    private final JList<String> colorJList; // lista para armazenar nomes de cor
    private final JList<String> copyJList;  // lista para armazenar nomes copiados
    private JButton copyJButton;    // botão para copiar nomes selecionados
    private static final String[] colorNames = {"Black", "Blue", "Cyan",
            "Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange",
            "Pink", "Red", "White", "Yellow"};

    // construtor MultipleSelectionFrame
    public MultipleSelectionFrame() {
        super("Multiple Selection Lists");
        setLayout(new FlowLayout());

        colorJList = new JList<String>(colorNames); // lista dos nome de cores
        colorJList.setVisibleRowCount(5);   // mostra cinco linhas
        colorJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        add(new JScrollPane(colorJList));   // adiciona lista com scrollpane

        copyJButton = new JButton("Copy >>>");
        copyJButton.addActionListener(
                new ActionListener() {
                    // trata evento de botão
                    @Override
                    public void actionPerformed(ActionEvent evento) {
                        // coloca valores selecionados na copyJList
                        copyJList.setListData(
                                colorJList.getSelectedValuesList().
                                toArray(new String[0])
                        );
                    }
                }
        );

        add(copyJButton);   // adiciona botão de cópia ao JFrame

        copyJList = new JList<String>();    // lista para armazenar nomes copiados
        copyJList.setVisibleRowCount(5);    // mostra 5 linhas
        copyJList.setFixedCellWidth(100);   // configura a largura
        copyJList.setFixedCellHeight(15);   // configura a altura
        copyJList.setSelectionMode(
                ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        add(new JScrollPane(copyJList));    // adiciona lista com scrollpane
    }
}
