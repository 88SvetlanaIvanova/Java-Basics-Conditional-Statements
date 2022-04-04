import java.util.Scanner;

public class a06_Fishland {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double scumPrice = Double.parseDouble(console.nextLine());
        double tsaPrice = Double.parseDouble(console.nextLine());
        double palKilo = Double.parseDouble(console.nextLine());
        double safKilo = Double.parseDouble(console.nextLine());
        int midiKilo = Integer.parseInt(console.nextLine());

        double palPrice = scumPrice*1.6;
        double safPrice = tsaPrice*1.8;
        double cost = palPrice*palKilo +safPrice*safKilo+
                midiKilo*7.50;
        System.out.printf("%.2f",cost);

    }
}
