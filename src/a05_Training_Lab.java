import java.util.Scanner;
public class a05_Training_Lab {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double w = Double.parseDouble(console.nextLine());
        double h = Double.parseDouble(console.nextLine());
       h=(( h *100) - 100) /70;
       w = (w *100)/120;

         int cols = (int) w;
         int rows = (int) h;
         int seats = cols*rows - 3;
            System.out.println(seats);
    }
}
