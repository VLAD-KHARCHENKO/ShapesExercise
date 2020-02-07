package ua.training.shapesexercise.model;

public class Rhombus {

    private final static String SPACE_MARKER = " ";
    private final static String SHAPE_BORDER = "*";
    private final static String INDENT = "\n";

    private static int spaceSize;

    public Rhombus (int size) {
        this.spaceSize = size;
    }

    public static void printRhombus() {

        for (int i = 1; i < spaceSize / 2; ++i) {

            for (int j = spaceSize / 2; j > i; --j)
                System.out.print(SPACE_MARKER);

            for (int j = 1; j < 2 * i; ++j)
                System.out.print(SHAPE_BORDER);

            System.out.print(INDENT);
        }

        for (int i = spaceSize / 2; i >= 1; --i) {

            for (int j = spaceSize / 2; j > i; --j)
                System.out.print(SPACE_MARKER);

            for (int j = 1; j < i * 2; ++j)
                System.out.print(SHAPE_BORDER);

            System.out.print(INDENT);
        }
    }
}

