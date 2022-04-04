import java.util.Scanner;

public class a03_Celsius_to_Fahrenheit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double C = Double.parseDouble(console.nextLine());
        /* Input temperature in Celsius from user
        * F = C * (9/5) + 32
        * F = C * 1.8 + 32   */
       // float C = in.nextFloat();
        double F = C * 1.8+ 32;
        System.out.printf("%.2f", F);

    }
}
