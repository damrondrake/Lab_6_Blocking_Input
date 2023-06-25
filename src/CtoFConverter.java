import java.util.Scanner;
class CtoFConverter
{
    public static void main(String[] args)
    {
        float C,F;

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter temperature in Celsius :"); //taking the input from the user
        C=scan.nextInt();

//testing for the bad inputs
        if(C==0)
        {
            System.out.println("You have entered freezing point");
        }
        else if(C==100)
        {
            System.out.println("You have entered boiling point");
        }

        else //if the input is appropriate

        {
            F= C * 9/5 + 32; //coversion logic

            System.out.println("Equivalent Temperature in Fahrenheit: "+F);
        }
    }
}