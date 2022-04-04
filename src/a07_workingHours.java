import java.util.Scanner;

public class a07_workingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        int hours = Integer.parseInt(scanner.nextLine());
        String weekDay = scanner.nextLine().toLowerCase();
        String status1 = "open";
        String status2 = "closed";
        if(hours>=18 || hours<10|| weekDay.equals("sunday")){
            System.out.println(status2);
        }else  System.out.println(status1);

    }
}
