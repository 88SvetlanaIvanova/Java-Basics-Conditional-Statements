import java.util.Scanner;

public class a06_OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        String evenOdd = "";
        double result = 0;
        if(operator.equals("+")){result = num1 + num2;
            if (result%2==0){
                evenOdd = "even";
            }
            else evenOdd = "odd";
           // text =( num1 +" + "+num2 +" = "+ "%.2f" ,result +" - "+ evenOdd);
            System.out.printf("%d %s %d = %.0f - %s",num1,operator,num2,result, evenOdd);
        }
        else if (operator.equals("-")){
            result = num1 - num2;
            if (result%2==0){
                evenOdd = "even";
            }
            else evenOdd = "odd";
            System.out.printf("%d %s %d = %.0f - %s",num1,operator,num2,result, evenOdd);
        }
        else if (operator.equals("*")){
            result = num1 * num2;
            if (result%2==0){
                evenOdd = "even";
            }
            else evenOdd = "odd";
            System.out.printf("%d %s %d = %.0f - %s",num1,operator,num2,result, evenOdd);
        }
        else if (operator.equals("/")){
            if( num2 ==0){
                System.out.printf("Cannot divide %d by zero", num1);
            }
            else{
                //cast integer to double by_ *1.0
            result = num1*1.0 / num2;
            System.out.printf("%d %s %d = %.2f ",num1,operator,num2,result);}
        }
        else if (operator.equals("%")){
            if( num2 == 0){
                System.out.printf("Cannot divide %d by zero", num1);
            }
            else{
            result = num1 % num2;
            System.out.printf("%d %s %d = %.0f",num1,operator,num2,result );}
        }
        /*
         Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        char sign = scanner.nextLine().charAt(0);
        double res = 0;
        String evenOrOdd = "";

        switch (sign) {
            case '+':
                res = n1 + n2;
                if (res % 2 == 0) {
                    evenOrOdd = "even";
                } else {
                    evenOrOdd = "odd";
                }
                System.out.printf("%d %s %d = %.0f - %s", n1, sign, n2, Math.floor(res), evenOrOdd);
                break;
            case '-':
                res = n1 - n2;
                if (res % 2 == 0) {
                    evenOrOdd = "even";
                } else {
                    evenOrOdd = "odd";
                }
                System.out.printf("%d %s %d = %.0f - %s", n1, sign, n2, Math.floor(res), evenOrOdd);
                //printDefMsg(n1, sign, n2, res, evenOdd(res));
                break;
            case '*':
                res = n1 * n2;
                if (res % 2 == 0) {
                    evenOrOdd = "even";
                } else {
                    evenOrOdd = "odd";
                }
                System.out.printf("%d %s %d = %.0f - %s", n1, sign, n2, Math.floor(res), evenOrOdd);
                //printDefMsg(n1, sign, n2, res, evenOdd(res));
                break;
            case '/':
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    res = n1 * 1.0 / n2;
                    System.out.printf("%d %s %d = %.2f", n1, sign, n2, res);
                }
                //printZeroMsg(n1);
                break;

            case '%':
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    res = n1 % n2;
                    System.out.printf("%d %s %d = %.0f", n1, sign, n2, Math.floor(res));
                }
                break;
            default:
                break;
         */





    }
}
