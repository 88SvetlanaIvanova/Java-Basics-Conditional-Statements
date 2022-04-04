import java.util.Scanner;

public class a02_Triangle_Area {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double side = Double.parseDouble(console.nextLine());
        double h = Double.parseDouble(console.nextLine());
        double areaTriangle = side * h/2.0;
        System.out.printf("%.2f", areaTriangle);
    }
}
