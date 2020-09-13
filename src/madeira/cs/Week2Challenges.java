package madeira.cs;
import java.util.Random;
import java.util.Scanner;
public class Week2Challenges {

  /*
        Comments
        ========
        See below

        Grade
        =====
        5/5 + 1 extra credit = 6/5
     */
  public static void main(String[] args) {

//Challenge Problem 1
String first = "Lindsay";
String middle = "Ireland";
String last = "Phair";
System.out.println(first); // you'll need to print these on the SAME line. You can use the .print() method to do that.
System.out.println(middle);
System.out.println(last);

//Challenge Problem 2
System.out.print("hello \n" + "world");

//Challenge Problem 3
System system1 = null; // interesting declaration of system here...kinda creative honestly.
system1.out.print ("\nI am 15 years old");

//Challenge Problem 4

/*
  The goal with this problem is to have you compare the user input to the first name & last name.
  Meaning, if the user enters Phair first, you'd say last name...

 */
Scanner s = new Scanner(System.in);
System.out.println("\nEnter your first name");
String name = s.nextLine();
String greeting = "Hi " + name;
System.out.println(greeting);
System.out.println("Enter your last name");
String name2 = s.nextLine();
String greeting2 = "Hi" + name + name2;
System.out.println(greeting2);

//Challenge Problem 5
  int i = 5;
  int x = 1;
  int j = 2;
  boolean b = false;
  b = j % x == i;
  System.out.print(b);

  //Challenge Problem 6 (Extra Credit)
  System.out.println("\nEnter your age");
  Integer age = s.nextInt(); // Again this is an Integer not an int...
  System.out.println(age + 5);
  String myString8 = "15"; // These aren't necessary
  new Scanner(myString8);
}}
