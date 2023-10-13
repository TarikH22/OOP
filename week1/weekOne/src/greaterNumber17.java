import java.util.Scanner;

public class greaterNumber17 {
    public static void main(String[] args)
    {
        Scanner reader=new Scanner(System.in);
        //Create a program that asks the user for two numbers and prints the greater of those two. The program should also handle the case in which the two numbers are equal.

        System.out.print("First number: ");
        int nmbr1=Integer.parseInt(reader.nextLine());
        System.out.print("Second number: ");
        int nmbr2=Integer.parseInt(reader.nextLine());

        if (nmbr1>nmbr2){
            System.out.println(nmbr1 + " is greater than "+nmbr2);
        }

        else if (nmbr1<nmbr2) {
            System.out.println(nmbr2+" is greater than "+nmbr1);
        }

        else if (nmbr1==nmbr2) {
            System.out.println("number are equal");
        }

    }
}

