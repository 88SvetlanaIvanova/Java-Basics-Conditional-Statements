import java.util.Scanner;

public class a01_Excellent_Result {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double evaluation = Double.parseDouble(scanner.nextLine());
        //double evaluation = scanner.nextDouble();

        if (evaluation >= 5)
        {
            System.out.println("Excellent!");
        }


    }
}
