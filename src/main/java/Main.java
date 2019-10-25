import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JPanel{
    private int sizeX;
    private int sizeY;

    public static void main(String[] args){
        JFrame frame= new JFrame("Gravity Test");
        frame.getContentPane().add(new Draw());
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setBackground(java.awt.Color.black);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        while (true) {
//            sizeX = frame.getWidth();
//            sizeY = frame.getHeight());
//        }
    }
}