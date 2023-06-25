import java.util.Scanner;
public class RectangleInfo
{
    public static void main(String[] args)
    {
        double a,b,d;
        Scanner s=new Scanner(System.in);

//prompting user to give inputs

        System.out.println("Enter the lengths of sides of rectangle");
        a=s.nextDouble();
        b=s.nextDouble();

//testing for valid inputs

        if(a<=0&&b<=0)
        {
            System.out.println("Enter valid input");
        }
        else
        {
//area of a rectangle is the product of its sides

            System.out.println("Area of rectangle is: "+(a*b));


            d=Math.sqrt(a*a+b*b);

            System.out.println("The length of the diagonal:"+d);
        }

    }
}