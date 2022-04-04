import java.util.Scanner;

public class a04_Vegetable_Market {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double vegetablesPrice = Double.parseDouble(console.nextLine());
        double fruitsPrice = Double.parseDouble(console.nextLine());
        int vegKilo = Integer.parseInt(console.nextLine());
        int fruitKilo = Integer.parseInt(console.nextLine());
        double profitEuro = (vegetablesPrice*vegKilo + fruitsPrice*fruitKilo) /1.94;
        System.out.printf("%.2f", profitEuro);


    }
}
