package sk.stuba.fei.uim.oop;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Okno extends JFrame implements ActionListener {
    public Okno() throws HeadlessException {
        super("Nazov"); //povieme tomu JFrame ako sa bude to okno volat
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(new BorderLayout());

        JPanel menu = new JPanel();
        menu.setLayout(new GridLayout(1,2));
        menu.setBackground(Color.CYAN);
        JLabel label1 = new JLabel("TEXT VPRAVO");
        JLabel label2 = new JLabel("TEXT VLAVO");
        menu.add(label1);
        menu.add(label2);

        JPanel klavesnica = new JPanel();
        klavesnica.setLayout(new GridLayout(3,3));

        for(int i =1;i<10;i++){
            JButton b = new JButton(String.valueOf(i));
            klavesnica.add(b);
            b.addActionListener(this);
        }

        this.add(menu,BorderLayout.PAGE_START);
        this.add(klavesnica,BorderLayout.CENTER);

        this.setVisible(true); //malo by to byt na konci pri inicializacii
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
    }
}
