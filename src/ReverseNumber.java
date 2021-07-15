import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args)
        {
            int number, rev= 0;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a Number:");
            number=sc.nextInt();
            while(number != 0)
            {
                int remainder = number % 10;
                rev = rev* 10 + remainder;
                number = number/10;
            }
            System.out.println("The reverse of the given number is: " + rev);
        }
}

