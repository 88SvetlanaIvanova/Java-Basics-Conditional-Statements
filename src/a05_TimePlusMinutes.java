import java.util.Scanner;

public class a05_TimePlusMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int moreMin = minutes+15;
        if(moreMin>59){
            moreMin -= 60;
            hours+=1;

        }
        if (hours == 24){
            hours=0;
        }
        System.out.printf("%d:%02d",hours, moreMin);
        //System.out.printf("%d:0%d", min, sec);
        //            System.out.printf("%d:%d", min, sec);
        //         System.out.printf("%d:%02d",min, sec);seconds as 2 digits

    }
}
