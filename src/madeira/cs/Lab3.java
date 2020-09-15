package madeira.cs;
import java.util.Scanner;
public class Lab3 {
    public static void main(String[] arg) {

/*  Write a program that does the following
           I. Reads the user's age and prints if they're permitted to:
              a. Drive
	          b. Get a tattoo
              c. Run for President of the United States
           II. Reads the user's birthday month and prints:
              a. Their astrological sign
	          b. The season of said month
              c. The number of days in the month
           III. Prints the estimated value of their age in days.
*/

//Part 1A
Scanner s = new
Scanner (System.in);
System.out.println("Enter your age");
Integer age = s.nextInt();
if (age >= 16)
System.out.println("Yes, you can drive");
else
System.out.println("No, you can't drive");

//Part 1B
Scanner w = new
Scanner (System.in);
if (age >= 18)
System.out.println("Yes, you can get a tattoo");
else
System.out.println("No, you can't get a tattoo");

//Part 1C
Scanner x = new
Scanner (System.in);
if (age >= 35)
System.out.println("Yes, you can run for president");
else
System.out.println("No, you can't run for president");

//Part 2A
        Scanner m = new
                Scanner (System.in);
        System.out.println("Enter your birthday mm/dd");
        String birthday = s.nextLine();
        if (birthday >= 16)
            System.out.println("Yes, you can drive");
        else
            System.out.println("No, you can't drive");

    }
}
