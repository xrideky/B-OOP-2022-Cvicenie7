package sk.stuba.fei.uim.oop;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.*;


public class Okno extends JFrame implements MouseListener, MouseMotionListener, KeyListener, ChangeListener {
    public Okno() throws HeadlessException {
        super();
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       // this.addMouseListener(this);
       // this.addMouseMotionListener(this);

        // this.addKeyListener(this);

        JSlider s = new JSlider(JSlider.HORIZONTAL,0,50,20);
        s.setMinorTickSpacing(5);
        s.setMajorTickSpacing(10);
        s.setPaintTicks(true);
        s.setPaintLabels(true);

        s.addChangeListener(this);
        this.add(s);

        this.setVisible(true); //malo by to byt na konci pri inicializacii
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("KLIK " + e.getPoint().toString());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("STLACENE " + e.getPoint().toString());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("NESTLACENE " + e.getPoint().toString());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("VSTUP " + e.getPoint().toString());
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("VYSTUP " + e.getPoint().toString());
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("TAHAS " + e.getPoint().toString());
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("POHNUTIE " + e.getPoint().toString());
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Stlacene " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Stlacil si " + e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Nestlacene " + e.getKeyChar());
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        System.out.println(((JSlider) e.getSource()).getValue());
    }
}
