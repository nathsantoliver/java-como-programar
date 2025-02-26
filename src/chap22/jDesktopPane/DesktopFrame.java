package chap22.jDesktopPane;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JInternalFrame;

public class DesktopFrame extends JFrame {
    private final JDesktopPane theDesktop;

    // configura a GUI
    public DesktopFrame() {
        super("Using a JDesktopPane");

        JMenuBar bar = new JMenuBar();
        JMenu addMenu = new JMenu("Add");
        JMenuItem newFrame = new JMenuItem("Internal Frame");

        addMenu.add(newFrame); // adiciona um novo item de quadro ao menu Add
        bar.add(addMenu); // adiciona o menu Add à barra de menus
        setJMenuBar(bar); // configura a barra de menus para esse aplicativo

        theDesktop = new JDesktopPane();
        add(theDesktop); // adiciona painel de área de trabalho ao quadro

        // configura o ouvinte para o item de menu newFrame
        newFrame.addActionListener(
                new ActionListener() {  // classe interna anônima
                    // exibe a nova janela interna
                    @Override
                    public void actionPerformed(ActionEvent event) {
                        // cria quadro interno
                        JInternalFrame frame = new JInternalFrame(
                                "Internal Frame", true, true, true, true);

                        MyJPanel panel = new MyJPanel();
                        frame.add(panel, BorderLayout.CENTER);
                        frame.pack(); // configura o quadro interno de acordo com o tamanho do conteúdo

                        theDesktop.add(frame); // anexa o quadro interno
                        frame.setVisible(true); // mostra o quador interno
                    }
                }
        );
    }
}
