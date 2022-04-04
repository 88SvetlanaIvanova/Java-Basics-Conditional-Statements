import java.util.Scanner;

public class a05_Journey {


    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String type ="";
        double price = 0;
        if (budget<= 100.00){ destination = "Bulgaria";
            if("summer".equalsIgnoreCase(season)){
                price = budget * 0.30; type = "Camp"; }
            else {price= budget*0.70;  type = "Hotel";}}

        else if (budget<=1000){destination = "Balkans";
            if("summer".equalsIgnoreCase(season))
            { price = budget * 0.40;type = "Camp"; }
            else {price= budget*0.80;  type = "Hotel";}}

        else if(budget>1000){ destination = "Europe"; type = "Hotel";
            price= budget*0.90; }
        System.out.printf("Somewhere in %s", destination);
        System.out.print("\n");

        System.out.printf(type + " - %.2f", price);
            }
}
