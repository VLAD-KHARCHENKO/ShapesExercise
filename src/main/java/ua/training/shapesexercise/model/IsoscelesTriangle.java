package ua.training.shapesexercise.model;

public class IsoscelesTriangle {

    private int side;

    public IsoscelesTriangle(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void print() {
        int x = getSide();
        int y = getSide();
        for (int i = 0; i < x; i++, y--) {
            for (int j = 0; j < y; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 0; k < i * 2; k++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i <= x; i++) {
            System.out.print("**");
        }
    }

}
