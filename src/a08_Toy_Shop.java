import java.util.Scanner;

public class a08_Toy_Shop {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        double excursionPrice = Double.parseDouble(scanner.nextLine());
        int numPuzzles = Integer.parseInt(scanner.nextLine());
        int numDolls = Integer.parseInt(scanner.nextLine());
        int numBears = Integer.parseInt(scanner.nextLine());
        int numMinions = Integer.parseInt(scanner.nextLine());
        int numTrucks = Integer.parseInt(scanner.nextLine());
        double toysCost = (numPuzzles * 2.60) + (numDolls * 3) + (numBears* 4.10) +
                (numMinions * 8.20) +
                (numTrucks * 2);
        int numToysOrdered = numPuzzles + numDolls + numBears + numMinions + numTrucks;

        if(numToysOrdered >= 50){
            toysCost = toysCost*0.75;
        }
        double profit = toysCost*0.90;


        if(profit >= excursionPrice){
            double extraMoney = profit- excursionPrice;
           // System.out.println("Yes!");
            System.out.printf("Yes! "+"%.2f", extraMoney);
           System.out.println(" lv left.");
        }
        else if(profit < excursionPrice){
            double lessMoney = excursionPrice- profit;
            System.out.printf("Not enough money! "+"%.2f", lessMoney);
            System.out.println(" lv needed.");

        }



    }
}
