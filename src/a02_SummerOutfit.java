import java.util.Scanner;

public class a02_SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        int degrees = Integer.parseInt(scanner.nextLine());
        String dayTime = scanner.nextLine().toLowerCase();
        String outfit= "";
        String shoes = "";

        if(dayTime.equals("morning")){
            if(10<= degrees && degrees <= 18){ outfit="Sweatshirt"; shoes= "Sneakers"; }
            else if(18< degrees && degrees <= 24){ outfit="Shirt"; shoes= "Moccasins"; }
            else { outfit="T-Shirt"; shoes= "Sandals"; }
            }
        else if (dayTime.equals("afternoon")){
            if(10<= degrees && degrees <= 18){ outfit="Shirt"; shoes= "Moccasins"; }
            else if(18< degrees && degrees <= 24){ outfit="T-Shirt"; shoes= "Sandals"; }
            else { outfit="Swim Suit"; shoes= "Barefoot"; }
        }
        else if (dayTime.equals("evening")){
            if(10<= degrees && degrees <= 18){ outfit="Shirt"; shoes= "Moccasins"; }
            else if(18< degrees && degrees <= 24){ outfit="Shirt"; shoes= "Moccasins"; }
            else { outfit="Shirt"; shoes= "Moccasins"; }
        }
        System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit,shoes);
    }
}
