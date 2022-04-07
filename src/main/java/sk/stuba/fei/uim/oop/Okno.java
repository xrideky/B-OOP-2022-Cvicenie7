package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Okno extends JFrame implements ActionListener {
    public Okno() throws HeadlessException {
        super();
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton b = new JButton("EXIT");
        this.add(b);
        b.addActionListener(this);

        this.setVisible(true); //malo by to byt na konci pri inicializacii
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.dispose();
        System.exit(0);
    }
}
