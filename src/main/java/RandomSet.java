import Figures.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class RandomSet {
    static List<Figure> figures = new ArrayList<>();

    static int numberOfFigures = (int) ((Math.random() * 20) + 1);

    static List<Color> colors = new ArrayList<>();


    public static void addingColors(){
        colors.add(Color.RED);
        colors.add(Color.ORANGE);
        colors.add(Color.YELLOW);
        colors.add(Color.GREEN);
        colors.add(Color.BLUE);
        colors.add(Color.BLACK);
    }



    public static void createSet() {
        addingColors();

        for (int i = 0; i < numberOfFigures; i++) {
            int figure = (int) ((Math.random() * 4) + 1);
            int color = (int) ((Math.random() * 6));

            switch (figure) {
                case 1:
                    double side = (Math.random() * 10) + 1;
                    figures.add(new Square(side, colors.get(color)));
                    break;
                case 2:
                    double radius = (Math.random() * 10) + 1;
                    figures.add(new Circle(radius, colors.get(color)));
                    break;
                case 3:
                    double sideA = (Math.random() * 10) + 1;
                    double sideB = (Math.random() * 10) + 1;
                    figures.add(new RightTriangle(sideA, sideB, colors.get(color)));
                    break;
                case 4:
                    double sideAT = (Math.random() * 10) + 1;
                    double sideBT = (Math.random() * 10) + 1;
                    double h = (Math.random() * 10) + 1;
                    figures.add(new Trapeze(sideAT, sideBT, h, colors.get(color)));
                    break;

            }

        }
    }

}
