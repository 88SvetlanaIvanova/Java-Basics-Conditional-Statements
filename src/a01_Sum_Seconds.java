import java.util.Scanner;

public class a01_Sum_Seconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int time1 = Integer.parseInt(scan.nextLine());
        int time2 = Integer.parseInt(scan.nextLine());
        int time3 = Integer.parseInt(scan.nextLine());
        int totalTime = time1+time2+time3;
        int min = totalTime/60;
        int sec = totalTime % 60;
        if(sec<10)
            System.out.printf("%d:0%d", min, sec);
        else
            System.out.printf("%d:%d", min, sec);
        // System.out.printf("%d:%02d",min, sec);seconds as 2 digits

    }
}
