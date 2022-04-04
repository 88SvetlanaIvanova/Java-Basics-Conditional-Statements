import java.util.Scanner;

public class a07_Area_of_Figures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        //square, rectangle, circle или triangle,
        if (figure.equals("square")){
            double sideOfSquare = Double.parseDouble(scanner.nextLine());
            double squareArea = sideOfSquare*sideOfSquare;
            System.out.printf("%.3f", squareArea);
        }
        else if(figure.equals("rectangle")){
            double side1_OfRectangle = Double.parseDouble(scanner.nextLine());
            double side2_OfRectangle = Double.parseDouble(scanner.nextLine());
            double areaRectangle = side1_OfRectangle*side2_OfRectangle;
            System.out.printf("%.3f", areaRectangle);

        }
        else if (figure.equals("circle")){
            double radiusOfCircle = Double.parseDouble(scanner.nextLine());
            double areaCircle = Math.PI*(radiusOfCircle*radiusOfCircle);
            System.out.printf("%.3f", areaCircle);

        }
        else if (figure.equals("triangle")){
            double sideOfTriangle = Double.parseDouble(scanner.nextLine());
            double heightOfSideOfTriangle = Double.parseDouble(scanner.nextLine());
            double areaTriangle = (sideOfTriangle/2)* heightOfSideOfTriangle;
            System.out.printf("%.3f", areaTriangle);

        }


        }
}
