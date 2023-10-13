import java.util.Scanner;

public class password22 {
    public static void main(String[] args)
    {
        Scanner reader=new Scanner(System.in);
        //
        String password="carrot";
        //loops until the password is correct
        while(true) {
            System.out.print("Enter password: ");
            String pass = reader.nextLine();

            if (pass.equals(password)) {
                System.out.println("Correct!");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }
        System.out.println("The secret is: jryy qbar!");
    }
}
