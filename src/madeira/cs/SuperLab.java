package madeira.cs;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class SuperLab {
    public static String main(String[] args) {
        try {
            File myObj = new File("/Users/lindsayphair/Downloads/artistList.txt");
            Scanner myReader = new Scanner(myObj);

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }

        catch (FileNotFoundException e) {
            System.out.println("An error occurred");
            e.printStackTrace(); }

        public class Artist {
            public Artist(String name, String album, String TwitterHandle) {
            }
            Artist BillieEilish = new Artist("Billie Eilish", "Don't smile at me", "@BillieEilish");
           Artist EARTHGANG = new Artist("EARTHGANG", "Shallow Graves for Toys", "@EarthGang");
           Artist GlassAnimals = new Artist ("Glass Animals", "Dreamland", "@GlassAnimals");
           Artist ArticMonkeys = new Artist ("The Arctic Monkeys", "AM", "@ArcticMonkeys");
           Artist TheStrokes = new Artist ("The Strokes", "The New Abnormal", "@thestrokes");
        }
            String name;
            String album;
            String twitterHandle;

    public String BillieEilish(); {
    return name + "released her album" + album + "\n Her twitter handle is" + twitterHandle; }

    public Artist EARTHGANG(); {
    return name + "released their album" + album + "\n Their twitter handle is" + twitterHandle; }

    public Artist GlassAnimals(); {
    return name + "released their album" + album + "\n Their twitter handle is" + twitterHandle; }

    public Artist ArcticMonkeys(); {
    return name + "released their album" + album + "\n Their twitter handle is" + twitterHandle; }

    public Artist TheStrokes(); {
    return name + "released their album" + album + "\n Their twitter handle is" + twitterHandle;
}





        }
        }


/* Exercise I----------In Type I syntax (i.e. String [] list = {"item1", "item2"}
construct an array of the planets which are:
Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune and PlutoYes, Pluto too, he's cute.
Print out these planets with the cool new foreach loopa la: for (String listItem: myList )

        String [] list = {"Yes"};
        for (String listItem: myList){
            System.out.println(myList);

        */

    }
