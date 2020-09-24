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
                artists1[counter] = new Artist();
                artists1 [counter].setName (line.split(",")[0]);
                artists1 [counter].setAlbum (line.split(",")[1]);
                artists1 [counter].setTwitter (line.split(",")[2]);
                counter++; }

            Scanner s = new Scanner(System.in);
            for (Artist line: artists1) {
                System.out.println("What do you think of " + artists1[0].getName() + "? Enter a rating 1-10");
                int rating = s.nextInt();
                System.out.println("The artist " + artists1[0].getName() + " released their album" + artists1[0].getAlbum() + "\nTheir twitter handle is" + artists1[0].getTwitter() + " They received a rating of " + rating);
                counter++; }
        }

        catch (FileNotFoundException e) {
            System.out.println("An error occurred");
            e.printStackTrace(); }

    }}

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

            public String getName() { return name; }
            public String getAlbum() { return album; }
            public String getTwitter() {return twitterHandle; }
            public int getRating() {return rating; }
            public void setName(String newName) { name = newName; }
            public void setAlbum(String newAlbum) {album = newAlbum;}
            public void setTwitter(String newTwitter) {twitterHandle = newTwitter;}
            public void setRating(int newRating) {rating = newRating;}
}


