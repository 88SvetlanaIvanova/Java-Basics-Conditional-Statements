import java.util.Scanner;

public class a07_HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
                String month = scanner.nextLine();
        int num = Integer.parseInt(scanner.nextLine());
        double priceStudio =0;
        double priceApartment =0;
        double costStudio = 0;
        double costApartment = 0;

        if (month.equals("May") || month.equals("October")) {
            priceStudio = 50;
            priceApartment = 65;
            if (num > 7 && num <= 14) {
                priceStudio = 50 - (50 * 0.05);

            } else if (num > 14) {
                priceStudio = 50 - (50 * 0.3);
                priceApartment = 65 - (65 * 0.1);
            }
        } else if (month.equals("June") || month.equals("September")) {
            priceStudio = 75.2;
            priceApartment = 68.70;
            if (num > 14) {
                priceStudio = 75.2 - (75.2 * 0.2);
                priceApartment = 68.70 - (68.70 * 0.1);
            }

        } else if (month.equals("July") || month.equals("August")) {
            priceStudio = 76;
            priceApartment = 77;
            if (num > 14) {
                priceStudio = 76;
                priceApartment = 77 - (77 * 0.1);
            }
        }
        costStudio  = priceStudio*num;
        costApartment = priceApartment*num;




        System.out.printf("Apartment: %.2f lv.", costApartment);
        System.out.print("\n");
        System.out.printf("Studio: %.2f lv.", costStudio);

    }
}
