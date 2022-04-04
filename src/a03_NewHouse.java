import java.util.Scanner;
public class a03_NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        String flowerType = scanner.nextLine();
        int num = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double cost = 0;
        double leftMoney = 0;


        if(flowerType.equals("Roses")) {cost = num* 5;
            if(num>80) {  cost = cost* 0.9;  } }

        else if (flowerType.equals("Dahlias")) {cost = num* 3.80;
            if(num>90) {  cost = cost* 0.85;  } }

        else if(flowerType.equals("Tulips")) {cost = num* 2.80;
            if(num>80) {  cost = cost* 0.85;  } }

        else if(flowerType.equals("Narcissus")) {cost = num* 3;
            if(num<120) {  cost = cost* 1.15;  } }

        else if(flowerType.equals("Gladiolus")){cost = num* 2.50;
            if(num<80) {  cost = cost* 1.20;  } }


        if (budget >= cost) {
            leftMoney = budget - cost;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", num, flowerType, leftMoney);
        } else if (cost >budget) {
            leftMoney = cost - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", leftMoney);
        }










    }
}
