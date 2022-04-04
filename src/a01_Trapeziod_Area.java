import java.util.Scanner;
public class a01_Trapeziod_Area {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double b1 = Double.parseDouble(console.nextLine());
        double b2 = Double.parseDouble(console.nextLine());
        double h = Double.parseDouble(console.nextLine());
        double areaTrapezoid = (b1 + b2) *h/2.0;
        //String text = "Area of trapezoid is " + areaTrapezoid;
        System.out.printf( "%.2f",areaTrapezoid);
        //System.out.println(text);




    }
}
