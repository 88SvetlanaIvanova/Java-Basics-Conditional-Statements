import java.util.Scanner;

public class a04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        int budget = Integer.parseInt(scanner.nextLine());

        String season = scanner.nextLine();

        int numFishermen = Integer.parseInt(scanner.nextLine());

        double cost = 0;
        double price = 0;

        switch(season){
            case "Spring":cost =3000.0; break;
            case "Summer":case "Autumn": cost = 4200.0;break;
            case "Winter": cost = 2600.0;break;
        }

        if(numFishermen<=6)
        { price = cost -(cost * 0.1); }

        else if (numFishermen > 7 && numFishermen <= 11){ price = cost- (cost * 0.15);  }

        else if (numFishermen> 12){ price= cost- (cost*0.25);}

        if(numFishermen % 2 == 0  && !"autumn".equalsIgnoreCase(season))
        {
            price= price*0.95;
        }

        if (budget >= price) {
            double leftMoney = 0;

            leftMoney = budget - price;
            System.out.printf("Yes! You have %.2f leva left.", leftMoney);
        } else if (price >budget) {
            double leftMoney = 0;

            leftMoney = price - budget;
            System.out.printf("Not enough money! You need %.2f leva.", leftMoney);
        }



    }
}
