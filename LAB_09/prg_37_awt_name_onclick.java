//WAP that displays your name whenever the mouse is clicked

package LAB_9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class prg_37_awt_name_onclick extends JFrame implements MouseListener {
    
        public prg_37_awt_name_onclick() {
            // Setting up frame
            setTitle("Mouse Click Name Display");
            setSize(400, 300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
            // Registering for mouse click events
            addMouseListener(this);
    
            // Setting up label
            JLabel label = new JLabel("Click the mouse to display your name", SwingConstants.CENTER);
            add(label, BorderLayout.CENTER);
    
            setVisible(true);
        }
    
        // MouseListener method
        public void mouseClicked(MouseEvent e) {
            // Displaying name in a dialog box
            String name = "Amit Singhal";
            JOptionPane.showMessageDialog(this, "Hello, " + name + "!");
        }
    
        // Unused MouseListener methods
        public void mouseEntered(MouseEvent e) {}
        public void mouseExited(MouseEvent e) {}
        public void mousePressed(MouseEvent e) {}
        public void mouseReleased(MouseEvent e) {}
    
        public static void main(String[] args) {
            new prg_37_awt_name_onclick();
        }
    }
    