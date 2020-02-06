package ua.training.shapesexercise;

import ua.training.shapesexercise.model.Parallelogram;
import ua.training.shapesexercise.model.Rectangle;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 8);
        rectangle.rectanglePrint();

        Parallelogram parallelogram = new Parallelogram(4, 8);
        parallelogram.printParallelogram();

    }

}
