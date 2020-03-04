package DrawFigures;

import javax.swing.*;
import java.awt.*;

public class DrawTrapeze extends JPanel {

    private Color color;

    public DrawTrapeze (Color color) {
        JFrame frame = new JFrame("Trapeze");
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.add(this);
        frame.setSize(360, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        this.color = color;
    }



    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
         int[] x = {40, 150, 170, 10};
         int[] y = {20, 20, 100, 100};


        g2d.setColor(color);
        g2d.fillPolygon(x, y, 4);
    }


}
