package DrawFigures;

import javax.swing.*;
import java.awt.*;

public class DrawTriangle extends JPanel {

    private Color color;

    public DrawTriangle (Color color) {
        JFrame frame = new JFrame("Triangle");
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
        int[] x = {250, 250, 50};
        int[] y = {50, 250, 250};


        g2d.setColor(color);
        g2d.fillPolygon(x, y, 3);
    }


}