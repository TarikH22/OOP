import java.util.Scanner;


public class Main {
    public static void main(String[] args)
    {
       Scanner reader=new Scanner(System.in);
        //Create a program that asks for the names and ages of two users. After that the program prints the sum of their ages.
        System.out.print("what is your name ");
        String name1=reader.nextLine();
        System.out.print("and what is your age ");
        int age1=Integer.parseInt(reader.nextLine());

        System.out.print("what is your name ");
        String name2=reader.nextLine();
        System.out.print("and what is your age ");
        int age2=Integer.parseInt(reader.nextLine());

        System.out.println("the sum of "+name1+" and "+name2+" ages is "+(age1 + age2));




    }
}