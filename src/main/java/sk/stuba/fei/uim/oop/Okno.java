package sk.stuba.fei.uim.oop;

import javax.swing.*;
import java.awt.*;

public class Okno extends JFrame  {
    public Okno() throws HeadlessException {
        super("Nazov"); //povieme tomu JFrame ako sa bude to okno volat
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(new MojPanel());

        this.setVisible(true); //malo by to byt na konci pri inicializacii
    }

}
