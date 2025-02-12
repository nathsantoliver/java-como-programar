package chap12.jList;

import javax.swing.*;

public class ListTest {
    public static void main(String[] args) {
        ListFrame listFrame = new ListFrame();  // cria ListFrame
        listFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        listFrame.setSize(350, 150);
        listFrame.setVisible(true);
    }
}
