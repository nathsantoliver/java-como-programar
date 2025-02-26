package chap22.jDesktopPane;

import java.awt.Dimension;
import java.awt.Graphics;
import java.security.SecureRandom;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

// classe para exibir um ImageIcon em um painel
public class MyJPanel extends JPanel {
    private static final SecureRandom generator = new SecureRandom();
    private final ImageIcon picture; // image to be displayed
    private static final String[] images =
            { "yellowflowers.png", "purpleflowers.png", "redflowers.png",
                    "redflowers2.png", "lavenderflowers.png" };

    // carrega a imagem
    public MyJPanel() {
        int randomNumber = generator.nextInt(images.length);
        picture = new ImageIcon(images[randomNumber]); // configura o ícone
    }

    // exibe imageIcon no painel
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        picture.paintIcon(this, g, 0, 0); // exibe o ícone
    }

    // retorna as dimensões da imagem
    public Dimension getPreferredSize() {
        return new Dimension(picture.getIconWidth(),
                picture.getIconHeight());
    }
}
