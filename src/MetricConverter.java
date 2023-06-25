import java.util.Scanner;
import static java.lang.Math.*;
public class MetricConverter
{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print(" Enter length in meters");
// store the user input
        double m = scan.nextDouble();


        if(m<=0)
        {
            System.out.println("Enter valid input in meters: ");

        }

        else
        {
            double mtm = 0.000621371;
            double mtf = 3.28084;
            double mti = 39.3701;

            double miles = m * mtm;

            double rmiles = (int)round(miles) ;

            double feet = m * mtf;


            double rfeet = (int)round(feet) ;

            double inches = m* mti;

            double rinches = (int)round(inches) ;

            System.out.println(m + " meters is equal to "+ miles + " rounded to "+rmiles+" miles.");
            System.out.println(m + " meters is equal to "+ feet +" rounded to "+rfeet+ " feet.");
            System.out.println(m + " meters is equal to "+ inches + " rounded to "+rinches+" inches.");
        }



    }
}