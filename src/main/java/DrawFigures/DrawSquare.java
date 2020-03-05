package DrawFigures;

import javax.swing.*;
import java.awt.*;

public class DrawSquare extends JPanel {
    
    private Color color;

    public DrawSquare (Color color) {
        JFrame frame = new JFrame("Square");
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
        g2d.fillRect(75, 25, 200, 200);
    }
}


