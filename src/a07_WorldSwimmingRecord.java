import java.util.Scanner;

public class a07_WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double oldRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double swimSpeed = Double.parseDouble(scanner.nextLine());
        double slowingTime = Math.floor(distance/15.0)*12.5;
        double newRecord = distance*swimSpeed + slowingTime;
        if (oldRecord<=newRecord){
            double timeDiffer = newRecord- oldRecord;
            System.out.printf("No, he failed! He was %.2f seconds slower.", timeDiffer);
        }
        else
             {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", newRecord);
        }

    }
}
