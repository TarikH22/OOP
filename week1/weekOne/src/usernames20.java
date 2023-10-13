import java.util.Scanner;

public class usernames20 {
    public static void main(String[] args)
    {
        Scanner reader=new Scanner(System.in);
        //Create a program that recognizes the following users:alex	mightyducks
        //emily	cat

        System.out.print("Enter username: ");
        String user=reader.nextLine();
        System.out.print("Enter password: ");
        String pass=reader.nextLine();

        if ((user.equals("alex"))&&(pass.equals("mightyducks"))){
            System.out.println("You are now logged into the system");
        }

        else if ((user.equals("emily"))&&(pass.equals("cat"))){
            System.out.println("You are now logged into the system");
        }

        else{
            System.out.println("Your username or password was invalid");
        }
    }
}
