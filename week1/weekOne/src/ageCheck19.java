import java.util.Scanner;

public class ageCheck19 {
    public static void main(String[] args)
    {
        Scanner reader=new Scanner(System.in);
        //Create a program that asks for the user's age and checks that it is reasonable (at least 0 and at most 120).
        System.out.print("enter your age: ");
        int age=Integer.parseInt(reader.nextLine());

        if (age>0 && age<=120){
            System.out.println("OK");
        }

        else{
            System.out.println("Age is not possible");
        }


    }
}



