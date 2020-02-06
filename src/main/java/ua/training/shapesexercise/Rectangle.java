package ua.training.shapesexercise;

public class Rectangle {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    void rectanglePrint(){
       for (int i=1;i<width; i++){
            System.out.print("*\t");
        }
        System.out.println();
        for (int i=0;i<height-2; i++){
            System.out.print("*");
            for(int j=0; j<(width-2);j++){
                System.out.print(" \t");
            }
            System.out.print("*\n");

        }
        for (int i=1;i<width; i++){
            System.out.print("*\t");
        }

    }
}
