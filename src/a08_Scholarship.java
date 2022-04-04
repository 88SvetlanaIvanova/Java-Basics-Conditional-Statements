import java.util.Scanner;

public class a08_Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double incomeLv = Double.parseDouble(scanner.nextLine());
        double gradeAverage = Double.parseDouble(scanner.nextLine());
        double minWages = Double.parseDouble(scanner.nextLine());

        double socScholarship = Math.floor(minWages*0.35);
        double gradeScholarship = Math.floor(gradeAverage*25);

        if( (gradeAverage>=4.5)&(gradeAverage <5.50)&(incomeLv<minWages))
        {
            System.out.printf("You get a Social scholarship %.0f BGN", socScholarship);
        }

        else if ( (5.5 <= gradeAverage) & (incomeLv>minWages) )
                {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", gradeScholarship);
                }
        else if ((gradeAverage>=5.50) &(incomeLv<= minWages) &(socScholarship>= gradeScholarship) )
            {
                System.out.printf("You get a Social scholarship %.0f BGN", socScholarship);
            }
        else if ((gradeAverage>=5.50) &(incomeLv<= minWages) &(socScholarship< gradeScholarship) )

        {
            System.out.printf("You get a scholarship for excellent results %.0f BGN", gradeScholarship);

        }
        else {
            System.out.println("You cannot get a scholarship!");
        }
    }
}
