import java.util.Scanner;

public class ageOfMajority15 {
    public static void main(String[] args)
    {
        Scanner reader=new Scanner(System.in);

        //Create a program that asks for the user's age and tells whether the user has reached the age of majority (i.e. 18 years old or older).
        System.out.print("What is your age: ");
        int age=Integer.parseInt(reader.nextLine());

        if (age>=18){
            System.out.println("You are of legal age");
        }

        else{
            System.out.println("You are NOT of legal age");
        }

    }
}
