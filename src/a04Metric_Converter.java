import java.util.Scanner;

public class a04Metric_Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numberOriginal = Double.parseDouble(scanner.nextLine());
        String FormatOriginal = scanner.nextLine();
        String FormatTrans = scanner.nextLine();

        if (FormatOriginal.equals("mm")) {
            if (FormatTrans.equals("cm")) {
                numberOriginal = numberOriginal / 10;
                System.out.printf("%.3f", numberOriginal);
            }else if(FormatTrans.equals("m")){
                numberOriginal = numberOriginal/1000;
                System.out.printf("%.3f", numberOriginal);
            }
        }
        if(FormatOriginal.equals("cm")) {
            if (FormatTrans.equals("mm")) {
                numberOriginal = numberOriginal * 10;
                System.out.printf("%.3f", numberOriginal);
            } else if (FormatTrans.equals("m")) {
                numberOriginal = numberOriginal / 100;
                System.out.printf("%.3f", numberOriginal);
            }
        }
        if(FormatOriginal.equals("m")) {
            if (FormatTrans.equals("mm")) {
                numberOriginal = numberOriginal * 1000;
                System.out.printf("%.3f", numberOriginal);
            } else if (FormatTrans.equals("cm")) {
                numberOriginal = numberOriginal * 100;
                System.out.printf("%.3f", numberOriginal);
            }
        }

    }
}
