//This is a moddified version of the calculator app we made in class NOT THE TEMPERATURE EXCERSISE

import java.util.Scanner;

public class temperatures23 {
    public static void main(String[] args)
    {
        Scanner reader=new Scanner(System.in);
        //make a simple calculator that asks in the begining wether to quit sum or differne and to handle unkonwn commands

        while(true){
            System.out.println("Do you wish to calculate sum or difference or quit");
            String command=reader.nextLine();
            if (command.equals("quit")) {
                System.out.println("are you sure [y/n]");
                String command2=reader.nextLine();
                if (command2.equals("y")){
                    break;
                }
                else if (command2.equals("n")) {
                    continue;
                }

            }

            else if (command.equals("sum")) {
                System.out.println("enter your two numbers");
                int nmbr1=Integer.parseInt(reader.nextLine());
                int nmbr2=Integer.parseInt(reader.nextLine());
                int nmbr3=nmbr1+nmbr2;
                System.out.println("the sum is: "+nmbr3);
            }

            else if (command.equals("difference")) {
                System.out.println("enter your two numbers");
                int nmbr1=Integer.parseInt(reader.nextLine());
                int nmbr2=Integer.parseInt(reader.nextLine());
                int nmbr3=nmbr1-nmbr2;
                System.out.println("the difference is: "+nmbr3);
            }

            else {
                System.out.println("Unkown input");
            }


        }
        System.out.println("Thank you");
    }

}
