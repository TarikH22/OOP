import java.util.Scanner;

public class sumOfManyNumber26 {
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        //Create a program that reads numbers from the user and prints their sum. The program should stop asking for numbers when user enters the number 0.
        int sum = 0;
        while (true) {
            System.out.println("enter a number: ");
            int read = Integer.parseInt(reader.nextLine());
            if (read == 0) {
                break;
            }
            sum=read+sum;

            System.out.println("Sum now: " + sum);
        }

        System.out.println("Sum in the end: " + sum);

    }
}
