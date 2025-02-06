package chap09.javaGUI9;

import javax.swing.*;
import java.awt.*;

public class LabelDemo {
    public static void main(String[] args) {
        // cri um rótulo com texto simples
        JLabel northLabel = new JLabel("North");

        // cria um ícone de uma imagem para podermos colocar em um JLabel
        ImageIcon labelIcon = new ImageIcon("src/chap09/javaGUI9/logo.png");

        // cria um rótulo com um Icon em vez de texto
        JLabel centerLabel = new JLabel(labelIcon);

        // cria outro rótulo com um Icon
        JLabel southLabel = new JLabel(labelIcon);

        // configura o rótulo para exibir texto (bem como um ícone)
        southLabel.setText("South");

        // cria um quadro para armazenar os rótulos
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // adiciona os rótulos ao frame; o segundo argumento especifica
        // onde adicionar o rótulo no frame
        application.add(northLabel, BorderLayout.NORTH);
        application.add(centerLabel, BorderLayout.CENTER);
        application.add(southLabel, BorderLayout.SOUTH);

        application.setSize(300, 300);
        application.setVisible(true);
    }
}
