package madeira.cs;
import java.util.Scanner;
public class Lab2 {
    /*
        Comments
        ========
        Lindsay - Great work again. Interesting use of the Integer wrapper class (see below).
        Totally do-able but not necessary. Great work regardless.

        Grade: A+, 10/10
     */
    public static void main(String[] arg){
    //LAB 2
    //Part 1
    Scanner s = new Scanner(System.in);
    System.out.println("Enter your name");
    String name = s.nextLine();
    String greeting = "Hi " + name;
    System.out.println(greeting);
    //Part 2
    System.out.println("Enter my favorite artist to reveal my favorite song");
    //You must type in "Harry Styles" because he is my favorite artist!
    String artist = s.nextLine();
    System.out.println("My favorite Harry Styles song is Canyon Moon");
    //Part 3
    System.out.println("Enter your age");
    /*
     FIXME: While this isn't incorrect per-se, Integer is a different variable type than int. See me if you want an explainer

     */
    Integer age = s.nextInt();
    System.out.println(age * 365);
    String myString8 = "15";
    // You can combine the lines above and below if you want too!
    new Scanner(myString8);
    //All Done!

}
}
