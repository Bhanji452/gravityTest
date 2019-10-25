import javax.swing.*;
import java.awt.*;

public class Draw extends JPanel {
    public void paint(Graphics g){
        g.setColor(java.awt.Color.white);
        g.fillOval(100, 100, 100, 100);
        g.drawString("yes", 50, 100);
    }
}
