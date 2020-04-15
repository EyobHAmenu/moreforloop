import java.util.Scanner;

public class morefor {
    public static void main(String[] args){
        String str1;
        int num1;
        int num2;
        int factor = 1;
        Scanner sc = new Scanner(System.in);

        /*
            Finds if a number is even or odd from 1-20
         */
        for (int x = 1; x<= 20; x++)
        {
            if(x%2 ==0){
                System.out.println(x + " is even number.");
            }else{
                System.out.println(x + " is odd number.");
            }
        }

        /*
            program to reverse a string.
         */
        System.out.print("Enter a word please. ");
        str1 = sc.nextLine();
        for (int x = str1.length() - 1; x >= 0; x--)
        {
            System.out.print(str1.charAt(x));
        }
        System.out.println();

        /*
            Display all the factors of a number
         */
        System.out.println("Enter a number please. ");
        num1 = sc.nextInt();
        for (int x = 1; x <= num1; x++)
        {
            if(num1 % x == 0)
            {
                System.out.print(x + ", ");
            }
        }
        System.out.println();

        /*
            program that computes the factorial of a number.
         */
        System.out.println("Enter another number please. ");
        num2 = sc.nextInt();
        for (int x = num2; x > 0; x--)
        {
            factor = factor * x;
        }
        System.out.println("The factorial of " + num2 + " is " + factor);

    }
}
