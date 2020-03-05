package DrawFigures;

import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JPanel {

    private Color color;

    public DrawCircle (Color color) {
        JFrame frame = new JFrame("Circle");
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
        g2d.setColor(color);
        g2d.fillOval(75, 25, 200, 200);
    }


}
