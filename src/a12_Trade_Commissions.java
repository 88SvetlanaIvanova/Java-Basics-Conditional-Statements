import java.util.Scanner;

public class a12_Trade_Commissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        String town = scanner.nextLine().toLowerCase();
        double sales = Double.parseDouble(scanner.nextLine());
        //int sum = (int) sales;
        double commission=0;
        if(town.equals("sofia")){
            if((0<= sales) &&(sales <=500))
            {
                commission = sales*0.05;System.out.printf("%.2f",commission);
            }
            else if(500<sales && sales<= 1000){
                commission = sales*0.07;System.out.printf("%.2f",commission);
            }
            else if(1000<sales && sales<= 10000){
                commission = sales*0.08; System.out.printf("%.2f",commission);
            }
            else if(sales>10000){
                commission = sales*0.12; System.out.printf("%.2f",commission);
            }
            else if(sales<0) System.out.println("error");
        }

        else if(town.equals("varna")){
            if((0<= sales) &&(sales <=500))
            {
                commission = sales*0.045;System.out.printf("%.2f",commission);
            }
            else if(500<sales && sales<= 1000){
                commission = sales*0.075;System.out.printf("%.2f",commission);
            }
            else if(1000<sales && sales<= 10000){
                commission = sales*0.10; System.out.printf("%.2f",commission);
            }
            else if(sales>10000){
                commission = sales*0.13; System.out.printf("%.2f",commission);
            }
            else if(sales<0) System.out.println("error");
        }
        else if(town.equals("plovdiv")){
            if((0<= sales) &&(sales <=500))
            {
                commission = sales*0.055;System.out.printf("%.2f",commission);
            }
            else if(500<sales && sales<= 1000){
                commission = sales*0.08;System.out.printf("%.2f",commission);
            }
            else if(1000<sales && sales<= 10000){
                commission = sales*0.12; System.out.printf("%.2f",commission);
            }
            else if(sales>10000){
                commission = sales*0.145; System.out.printf("%.2f",commission);
            }

            else if(sales<0) System.out.println("error");
        }
        else System.out.println("error");


    }
}
