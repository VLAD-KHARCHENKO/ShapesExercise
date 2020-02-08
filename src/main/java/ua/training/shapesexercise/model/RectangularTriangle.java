package ua.training.shapesexercise.model;

public class RectangularTriangle {

    private int side;
    private String space = " ";
    private String newLine = "\n";
    private String asterisk = "*";

    public RectangularTriangle(int side) {
        this.side = side;
    }



    public void printShape(){

        System.out.print(newLine);

        for (int i = 1; i < side ; i++){
           for (int j = 0; j < i; j++){
               if(j==0 || j==i-1)
                   System.out.print(asterisk);
               else
                   System.out.print(space);
           }
            System.out.print(newLine);
           if (i == side-1)
                for (int k = 0; k < i+1; k++)
                    System.out.print(asterisk);
        }



    }



}
