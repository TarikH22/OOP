import java.util.Scanner;

public class evenOrOdd16 {
    public static void main(String[] args)
    {
        Scanner reader=new Scanner(System.in);

        //Create a program that asks the user for a number and tells whether the number is even or odd.
        System.out.print("Enter your number: ");
        int nmbr=Integer.parseInt(reader.nextLine());

        if (nmbr%2==0){
            System.out.println("your number is even");
        }

        else{
            System.out.println("your number is odd");
        }

    }
}
