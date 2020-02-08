package ua.training.shapesexercise;

import ua.training.shapesexercise.model.*;


public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 8);
        rectangle.rectanglePrint();

        Parallelogram parallelogram = new Parallelogram(3, 8);
        parallelogram.printParallelogram();

        Rhombus rhombus = new Rhombus(10);
        rhombus.printRhombus();

        IsoscelesTriangle triangle = new IsoscelesTriangle(11);
        triangle.print();

        RectangularTriangle rectangularTriangle = new RectangularTriangle(6);
        rectangularTriangle.printShape();
    }

}
