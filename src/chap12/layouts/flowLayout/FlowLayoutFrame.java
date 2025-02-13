package chap12.layouts.flowLayout;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FlowLayoutFrame extends JFrame {
    private final JButton leftJButton;   // botão para configurar alinhamento à esquerda
    private final JButton centerJButton; // botão para configurar alinhamento centralizado
    private final JButton rightJButton;  // botão para configurar alinhamento à direita
    private final FlowLayout layout;    // objeto de layout
    private final Container container;  // contêiner para configurar layout

    // configura GUI e registra listeners de botão
    public FlowLayoutFrame() {
        super("FlowLayout Demo");

        layout = new FlowLayout();
        container = getContentPane();   // obtém contêiner para layout
        setLayout(layout);

        // configura leftJButton e registra listener
        leftJButton = new JButton("Left");
        add(leftJButton);   // adiciona o botão Left ao frame
        leftJButton.addActionListener(
                new ActionListener() {  // classe interna anônima
                    // processa o evento leftJButton
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        layout.setAlignment(FlowLayout.LEFT);

                        // realinha os componentes anexados
                        layout.layoutContainer(container);
                    }
                }
        );

        // configura centerJButton e registra listener
        centerJButton = new JButton("Center");
        add(centerJButton);   // adiciona o botão Center ao frame
        centerJButton.addActionListener(
                new ActionListener() {  // classe interna anônima
                    // processa o evento centerJButton
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        layout.setAlignment(FlowLayout.CENTER);

                        // realinha os componentes anexados
                        layout.layoutContainer(container);
                    }
                }
        );

        // configura rightJButton e registra listener
        rightJButton = new JButton("Right");
        add(rightJButton);   // adiciona o botão Right ao frame
        rightJButton.addActionListener(
                new ActionListener() {  // classe interna anônima
                    // processa o evento rightJButton
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        layout.setAlignment(FlowLayout.RIGHT);

                        // realinha os componentes anexados
                        layout.layoutContainer(container);
                    }
                }
        );
    }

}
