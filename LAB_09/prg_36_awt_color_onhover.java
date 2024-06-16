//WAP that illustrate how to process mouse click, enter, exit, press & release events
//The background color changes when the mouse is entered, clicked, pressed, released or exited.

package LAB_09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class prg_36_awt_color_onhover extends JFrame implements MouseListener {
    public prg_36_awt_color_onhover() {
        // Setting up frame
        setTitle("Mouse Events Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Registering for mouse events
        addMouseListener(this);

        // Setting up label
        JLabel label = new JLabel("Move your mouse over this window", SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);

        setVisible(true);
    }

    // MouseListener methods
    public void mouseClicked(MouseEvent e) {
        getContentPane().setBackground(Color.GREEN);
    }

    public void mouseEntered(MouseEvent e) {
        getContentPane().setBackground(Color.YELLOW);
    }

    public void mouseExited(MouseEvent e) {
        getContentPane().setBackground(Color.WHITE);
    }

    public void mousePressed(MouseEvent e) {
        getContentPane().setBackground(Color.BLUE);
    }

    public void mouseReleased(MouseEvent e) {
        getContentPane().setBackground(Color.RED);
    }

    public static void main(String[] args) {
        new prg_36_awt_color_onhover();
    }
}
