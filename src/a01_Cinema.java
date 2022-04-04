import java.util.Scanner;

public class a01_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        String projection = scanner.nextLine().toLowerCase();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        double income =0 ;
        if("premiere".equals(projection)) {income = rows*columns*12.00;}
             else if("normal".equals(projection))  { income = rows*columns*7.50;}
             else if("discount".equals(projection))  { income = rows*columns*5.00;}

             System.out.printf("%.2f leva",income);
             //System.out.println(" ");


    }
}
