import Figures.Figure;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Vision extends JFrame {

    private JButton random;
    private String[] columnName = {"№", "Figure Name", "Info"};
    private JButton draw;
    private JLabel numberOfFigure;
    private JTextField enterNumber;


    public Vision() {
        super("Main Window");

        setBounds(0, 0, 1000, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        random = new JButton("Get random set of figures");
        draw = new JButton("DRAW");
        numberOfFigure = new JLabel("Enter number of figure for drawing");
        enterNumber = new JTextField();


        JPanel buttonsPanel = new JPanel(new FlowLayout());
        buttonsPanel.add(random);
        add(buttonsPanel, BorderLayout.NORTH);


        random.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                RandomSet.createSet();
                String[][] data = new String[RandomSet.numberOfFigures][3];
                for (int i = 0; i < RandomSet.numberOfFigures; i++) {
                    data[i][0] = Integer.toString(i + 1);
                    data[i][1] = RandomSet.figures.get(i).getName();
                    data[i][2] = RandomSet.figures.get(i).toString();
                }


                JTable table = new JTable(data, columnName);


                JScrollPane scrollPane = new JScrollPane(table);

                getContentPane().add(scrollPane);

                scrollPane.setPreferredSize(new Dimension(1000, 500));
                pack();
                setVisible(true);

                JPanel drawFigure = new JPanel();
                enterNumber.setColumns(3);
                drawFigure.add(numberOfFigure);
                drawFigure.add(enterNumber);
                drawFigure.add(draw);
                add(drawFigure, BorderLayout.PAGE_END);
            }
        });


        draw.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int number = Integer.parseInt(enterNumber.getText()) - 1;
                RandomSet.figures.get(number).draw();
            }


        });

    }
}
