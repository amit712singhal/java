//Write an applet prg that displays "Hello World" with background color "black", text color "blue" and your name in the status window.

package LAB_07;

import java.applet.*;
import java.awt.*;

public class prg_30_Applet1 extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Hello World", 50, 50);
    }
}
