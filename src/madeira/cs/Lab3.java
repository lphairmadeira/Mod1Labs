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

//Part 1
Scanner s = new
Scanner (System.in);
System.out.println("Enter your age");
int age = s.nextInt();
if (age >= 16)
    System.out.println("Yes, you can drive");
    else
    System.out.println("No, you can't drive");
if (age >= 18)
    System.out.println("Yes, you can get a tattoo");
    else
    System.out.println("No, you can't get a tattoo");
if (age >= 35)
    System.out.println("Yes, you can run for president");
    else
    System.out.println("No, you can't run for president");

//Part 2
Scanner m = new
Scanner (System.in);
System.out.println("Enter your birthday month number");
int birthday = s.nextInt();
        if (birthday == 1)
                System.out.println("You are a Capricorn or Aquarius" + "\nWinter" + "\n31");
        else if (birthday == 2)
                System.out.println("You are an Aquarius or Pisces" + "\nWinter" + "\n28 or 29");
        else if (birthday == 3)
                System.out.println("You are a Pisces or Aries" + "\nSpring" + "\n31");
        else if (birthday == 4)
                System.out.println("You are an Aries or Taurus" + "\nSpring" + "\n30");
        else if (birthday == 5)
                System.out.println("You are a Taurus or Gemini" + "\nSpring" + "\n31");
        else if (birthday == 6)
                System.out.println("You are a Gemini or Cancer" + "\nSummer" + "\n30");
        else if (birthday == 7)
                System.out.println("You are a Cancer or Leo" + "\nSummer" + "\n31");
        else if (birthday == 8)
                System.out.println("You are a Leo or Virgo" + "\nSummer" + "\n31");
        else if (birthday == 9)
                System.out.println("You are a Virgo or Libra" + "\nFall" + "\n30");
        else if (birthday == 10)
                System.out.println("You are a Libra or Scorpio" + "\nFall" + "\n31");
        else if (birthday == 11)
                System.out.println("You are a Scorpio or Sagittarius" + "\nFall" + "\n30");
        else if (birthday == 12)
                System.out.println("You are a Sagittarius or Capricorn" + "\nWinter" + "\n31");

//Part 3
Scanner z = new
Scanner (System.in);
System.out.println("Enter your age");
int year = s.nextInt();
        if (birthday == 1)
            System.out.println(31 * 12 * year);
        else if (birthday == 2)
            System.out.println(28 * 12 * year);
        else if (birthday == 3)
            System.out.println(31 * 12 * year);
        else if (birthday == 4)
            System.out.println(30 * 12 * year);
        else if (birthday == 5)
            System.out.println(31 * 12 * year);
        else if (birthday == 6)
            System.out.println(30 * 12 * year);
        else if (birthday == 7)
            System.out.println(31 * 12 * year);
        else if (birthday == 8)
            System.out.println(31 * 12 * year);
        else if (birthday == 9)
            System.out.println(30 * 12 * year);
        else if (birthday == 10)
            System.out.println(31 * 12 * year);
        else if (birthday == 11)
            System.out.println(30 * 12 * year);
        else if (birthday == 12)
            System.out.println(31 * 12 * year);
    }}
