import java.util.Scanner;

public class a06_Godzilla_Kong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double filmBudget = Double.parseDouble(scanner.nextLine());
        int numWorkers = Integer.parseInt(scanner.nextLine());
        double costumePrice = Double.parseDouble(scanner.nextLine());
        double filmDecor = filmBudget*0.1;
        double costumeCost = numWorkers*costumePrice;
        if(numWorkers>150){
            costumeCost = costumeCost*0.9;
                    }
        if((filmDecor+costumeCost)>filmBudget){
            double moneyLeft = (filmDecor+costumeCost) - filmBudget;
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.\n", moneyLeft);
           // System.out.println(" leva more.");
        }
        if((filmDecor+costumeCost) <= filmBudget){
            double moneyLeft = filmBudget -(filmDecor+costumeCost);
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", moneyLeft);
            //System.out.println(" leva left.");
        }



    }
}
