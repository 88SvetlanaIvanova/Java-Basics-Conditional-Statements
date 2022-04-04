import java.util.Scanner;

public class a11_FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        String fruit = scanner.nextLine().toLowerCase();
        String day = scanner.nextLine().toLowerCase();
        double quantity = Double.parseDouble(scanner.nextLine());
        if(day.equals("monday")||day.equals("tuesday")||day.equals("wednesday")||
           day.equals("thursday")||day.equals("friday"))
        {
            if(fruit.equals("banana")){
                System.out.printf("%.2f",2.50*quantity);
            }
            else if(fruit.equals("apple")){
                System.out.printf("%.2f",1.20*quantity);
            }
            else if(fruit.equals("orange")){
                System.out.printf("%.2f",0.85*quantity);
            }
            else if(fruit.equals("grapefruit")){
                System.out.printf("%.2f",1.45*quantity);
            }
            else if(fruit.equals("kiwi")){
                System.out.printf("%.2f",2.70*quantity);
            }
            else if(fruit.equals("pineapple")){
                System.out.printf("%.2f",5.50*quantity);
            }
            else if(fruit.equals("grapes")){
                System.out.printf("%.2f",3.85*quantity);
            }
            else System.out.println("error");


         }
        else if (day.equals("saturday")||day.equals("sunday")){
            if(fruit.equals("banana")){
                System.out.printf("%.2f",2.70*quantity);
            }
            else if(fruit.equals("apple")){
                System.out.printf("%.2f",1.25*quantity);
            }
            else if(fruit.equals("orange")){
                System.out.printf("%.2f",0.90*quantity);
            }
            else if(fruit.equals("grapefruit")){
                System.out.printf("%.2f",1.60*quantity);
            }
            else if(fruit.equals("kiwi")){
                System.out.printf("%.2f",3.00*quantity);
            }
            else if(fruit.equals("pineapple")){
                System.out.printf("%.2f",5.60*quantity);
            }
            else if(fruit.equals("grapes")){
                System.out.printf("%.2f",4.20*quantity);
            }
            else System.out.println("error");


        }
        else System.out.println("error");

    }
}
