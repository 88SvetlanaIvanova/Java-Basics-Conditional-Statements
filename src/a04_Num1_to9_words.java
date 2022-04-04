import java.util.Scanner;

public class a04_Num1_to9_words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        if(number == 1){
            System.out.println("one");
        }
        if(number == 2){
            System.out.println("two");
                    }
        if(number == 3){
            System.out.println("three");
        }
        if(number == 4){
            System.out.println("four");
        }
        if(number == 5){
            System.out.println("five");
        }
        if(number == 6){
            System.out.println("six");
        }
        if(number == 7){
            System.out.println("seven");
        }
        if(number == 8){
            System.out.println("eight");
        }
        if(number == 9){
            System.out.println("nine");
        }
        if (number > 9 || number < 1){
            System.out.println("number too big");
        }


    }
}
