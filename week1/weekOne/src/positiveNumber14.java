import java.util.Scanner;

public class positiveNumber14 {
    public static void main(String[] args)
    {
        Scanner reader=new Scanner(System.in);
        //Create a program that asks the user for a number and tells if the number is positive (i.e. greater than zero).

        System.out.print("Enter a random number: ");
        int nmbr=Integer.parseInt(reader.nextLine());

        if (nmbr>0){
            System.out.println("Your number is positive");
        }

        else{
            System.out.println("Your number is negative");
        }



    }
}
