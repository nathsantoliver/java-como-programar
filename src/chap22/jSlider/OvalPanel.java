package chap22.jSlider;

import java.awt.Graphics;
import java.awt.Dimension;
import javax.swing.JPanel;

public class OvalPanel extends JPanel {

    private int diameter = 10;  // diâmetro padrão

    // desenha uma oval do siâmetro especificado
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(10, 10, diameter, diameter);
    }

    // valida e configura o diâmetro e então repinta
    public void setDiameter(int newDiameter) {
        // se diâmetro inálido, assume o padrão de 10
        diameter = (newDiameter >= 0 ? newDiameter : 10);
        repaint();  // repinta o painel
    }

    // utilizado pelo gerenciador de layout para determinar o tamanho preferido
    public Dimension getPreferredSize() {
        return new Dimension(200, 200);
    }

    // utilizado pelo gerenciador de layout para determinar o tamanho mínimo
    public Dimension getMinimumSize() {
        return getPreferredSize();
    }

}
