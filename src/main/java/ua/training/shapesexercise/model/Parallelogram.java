package ua.training.shapesexercise.model;

public class Parallelogram {

    private final static String MARKER = "*";
    private final static String SPACE = " ";
    private final static String INDENT = "\n";

    private int height;
    private int width;

    public Parallelogram(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void printParallelogram() {
        System.out.println(INDENT);

        for (int i = 0; i < height; i++) {
            makeSpaceTriangle(i);
            printBorderPoints(i);
            System.out.print(INDENT);
        }
    }

    private void makeSpaceTriangle(int i) {
        for (int j = height - 1; j > i; j--) {
            System.out.print(SPACE);
        }
    }

    private void printBorderPoints(int i) {
        for (int j = 1; j <= width; j++) {
            if (isBorderPoint(height, width, i, j)) {
                System.out.print(MARKER);
            } else {
                System.out.print(SPACE);
            }
        }
    }

    private boolean isBorderPoint(int height, int width, int i, int j) {
        return j == 1 || j == width || i == 0 || i == height - 1;
    }
}
