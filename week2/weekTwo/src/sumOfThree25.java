import java.util.Scanner;

public class sumOfThree25 {
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        int sum = 0;
        int read;
        //sum acts like a storage for the input number(read) and itself
        System.out.println("enter three number:");
        read=Integer.parseInt(reader.nextLine());
            sum=sum+read;
        System.out.println("the first number is: "+sum);
        read=Integer.parseInt(reader.nextLine());
            sum=sum+read;
        System.out.println("the second number is: "+read);
        read=Integer.parseInt(reader.nextLine());
            sum=sum+read;
        System.out.println("the third number is: "+read);


        System.out.println("Sum: " + sum);
    }

}
