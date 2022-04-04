import java.util.Scanner;

public class a08_OnTimefortheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        int hourExam = Integer.parseInt(scanner.nextLine());
        int minExam = Integer.parseInt(scanner.nextLine());
        int hourStudent = Integer.parseInt(scanner.nextLine());
        int minStudent = Integer.parseInt(scanner.nextLine());
        int timeLateEarly = 0;

        String late = "Late";
        String onTime = "On time";
        String early = "Early";

        int examTime = (hourExam*60)+minExam;
        int arrivalTime = (hourStudent*60)+ minStudent;
        timeLateEarly = arrivalTime - examTime;

        String studentArrival = late;
        if(timeLateEarly< -30){
            studentArrival = early;
        }else if (timeLateEarly<=0){
            studentArrival = onTime;
        }

        String result = "";
        if(timeLateEarly != 0){
            int hoursDiff= Math.abs(timeLateEarly / 60);
            int minDiff = Math.abs(timeLateEarly % 60);

            if(hoursDiff > 0){
                result = String.format("%d:%02d hours", hoursDiff, minDiff);
            }else{
                result = minDiff + " minutes";
            }

            if(timeLateEarly < 0 ) {
                result += " before the start";
            }else{
                result += " after the start";
            }
        }
        System.out.println(studentArrival);
        if(!result.isEmpty()){
            System.out.println(result);
        }




    }
}
