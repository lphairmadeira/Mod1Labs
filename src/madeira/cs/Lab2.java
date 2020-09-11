package madeira.cs;
import java.util.Scanner;
public class Lab2 {
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
    Integer age = s.nextInt();
    System.out.println(age * 365);
    String myString8 = "15";
    new Scanner(myString8);
    //All Done!

}
}
