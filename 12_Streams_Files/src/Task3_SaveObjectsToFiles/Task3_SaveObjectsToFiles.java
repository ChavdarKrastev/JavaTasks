package Task3_SaveObjectsToFiles;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Task3_SaveObjectsToFiles {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String director = sc.nextLine();
        List actors = new ArrayList();
        String str = sc.nextLine();
        while (str.charAt(0) > '9' || str.charAt(0) < '0') {
            actors.add(str);
            str = sc.nextLine();
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate ld = LocalDate.parse(str, formatter);
        Movie movie = new Movie(title, director, actors, ld);

        System.out.println(movie);

        File file = new File("E:\\ObjectInFile.txt");

        if (!file.exists()) {
            file.createNewFile();
        }
        try {
            FileOutputStream fop = new FileOutputStream(file);

            ObjectOutputStream objectOut = new ObjectOutputStream(fop);
            objectOut.flush();

            objectOut.writeObject(movie);
            objectOut.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Task3_SaveObjectsToFiles.class.getName()).log(Level.SEVERE, null, ex);
        }

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        Movie sameMovie = null;

        while (true) {
            try {
                sameMovie = (Movie) ois.readObject();

            } catch (EOFException e) {
                if (sameMovie.toString().equals(movie.toString())) {
                    System.out.println("Input object equals output object");
                } else {
                    System.out.println("err");
                }
                break;
            }
        }
    }
}
