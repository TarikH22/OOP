import java.util.Scanner;

public class leapYear21 {
    public static void main(String[] args)
    {
        Scanner reader=new Scanner(System.in);
        //Create a program that checks whether the given year is a leap year.
        //A year is a leap year if it is divisible by 4. But if the year is divisible by 100, it is a leap year only when it is also divisible by 400.

        System.out.print("enter your year: ");
        int year=Integer.parseInt(reader.nextLine());

        if ((year%4==0) || ((year%100==0)&&(year%400==0))){
            System.out.println("Leap year");
        }

        else{
            System.out.println("NOT leap year");
        }


    }
}
