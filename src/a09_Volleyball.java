import java.util.Scanner;

public class a09_Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        String yearType = scanner.nextLine().toLowerCase();
        int holidays = Integer.parseInt(scanner.nextLine());
        int weekendsHome = Integer.parseInt(scanner.nextLine());

        int sofiaWeekends = 48 - weekendsHome;//46 38.5
        double playSofia = ((3/4.0)*sofiaWeekends) + (holidays* (2/3.0));
        double playTotal = weekendsHome + playSofia;



        if(yearType.equals("leap")){
            playTotal = Math.floor(playTotal*1.15);
            System.out.printf( "%.0f",playTotal);
        }else if(yearType.equals("normal")){
            System.out.printf( "%.0f" ,Math.floor(playTotal));
        }











    }
}
