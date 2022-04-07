package sk.stuba.fei.uim.oop;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;


public class Okno extends UniversalAdapter implements ActionListener{
    public Okno() throws HeadlessException {
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(new BorderLayout());

        this.addMouseListener(this); //zaregistrovany klik

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
    public void mouseClicked(MouseEvent e) {
        System.out.println(this.getComponentAt(e.getPoint()));
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
