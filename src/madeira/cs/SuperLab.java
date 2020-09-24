package madeira.cs;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class SuperLab {
    public static void main(String[] args) {
        try {
            File myObj = new File("/Users/lindsayphair/Downloads/artistList.txt");
            Scanner myReader = new Scanner(myObj);
            int numline = myReader.nextInt();
            String temp = myReader.nextLine();
            String [] artists = new String [numline];
            int counter = 0;
            while (myReader.hasNextLine()) {
                artists[counter] = myReader.nextLine();
                counter ++;
            }
            myReader.close();

            Artist [] artists1 = new Artist [numline];
            counter = 0;
            for (String line: artists) {
                artists1 [counter].setName (line.split(",")[0]);
                artists1 [counter].setAlbum (line.split(",")[0]);
                /*
                line.split(",")[0];
                line.split(",")[1];
                line.split(",")[2];
                 */
                counter++;
            }



        }

        catch (FileNotFoundException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
/*
"Billie Eilish", "Don't smile at me", "@BillieEilish"
"EARTHGANG", "Shallow Graves for Toys", "@EarthGang"
"Glass Animals", "Dreamland", "@GlassAnimals"
"The Arctic Monkeys", "AM", "@ArcticMonkeys"
"The Strokes", "The New Abnormal", "@thestrokes"
 */

    }
}
        class Artist {
            String name;
            String album;
            String twitterHandle;
            int rating;

            public Artist() {
                name = "n/a";
                album = "n/a";
                twitterHandle = "n/a";
                rating = 0;
            }
            Scanner s = new
                    Scanner(System.in);
            System.out.println("What do you think of" + name + "Enter a rating 1-10");
            int rating = s.nextInt();

            public String getName() { return name; }
            public String getAlbum() { return album; }
            public String getTwitter() {return twitterHandle; }
            public int getRating() {return rating; }
            public void setName(String newName) { name = newName; }
            public void setAlbum(String newAlbum) {album = newAlbum;}
            public void setTwitter(String newTwitter) {twitterHandle = newTwitter;}
            public void setRating(int newRating) {rating = newRating;}



        }
