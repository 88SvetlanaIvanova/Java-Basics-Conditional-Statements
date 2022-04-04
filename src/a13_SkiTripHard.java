import java.util.Scanner;

public class a13_SkiTripHard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine().toLowerCase();
        String evaluation = scanner.nextLine().toLowerCase();
        int nights = days-1;
        double stay = 0;
        if(roomType.equals("room for one person")) {
            stay = nights*18.00;
        }
        else if (roomType.equals("apartment")){
            stay = nights*25.00;
            if(10>nights){ stay = stay*0.7; }
            else if(10<nights && nights<15) stay = stay*0.65;
            else if (nights>15) stay = stay*0.5;
        }
        else if (roomType.equals("president apartment")){
            stay = nights*35.00;
            if(10>nights){ stay = stay*0.9; }
            else if(10<nights && nights<15) stay = stay*0.85;
            else if (nights>15) stay = stay*0.8;
        }
        if(evaluation.equals("positive")){
            stay = stay*1.25;
        }else if ("negative".equals(evaluation)) stay = stay*0.9;
        System.out.printf("%.2f",stay);
    }
}
