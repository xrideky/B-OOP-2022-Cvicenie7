package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class Okno extends UniversalAdapter {
    public Okno() throws HeadlessException {
        super();
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.addMouseListener(this);

        this.setVisible(true); //malo by to byt na konci pri inicializacii
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("KLIK " + e.getPoint().toString());
    }
}
