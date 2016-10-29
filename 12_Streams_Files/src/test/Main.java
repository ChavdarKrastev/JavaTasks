
package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String director = sc.nextLine();
        List actors = new ArrayList();
        String str = sc.nextLine();
        while (str.charAt(0) > '9' || str.charAt(0) < '0') {
            actors.add(str);
            str = sc.nextLine();
        }
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
//        LocalDate ld = LocalDate.parse(str, formatter);
        //String[] array = (String[]) actors.toArray(new String[actors.size()]);
        //Movie movie = new Movie(title, director, actors, ld);
        mov sd = new mov();
        
        //File file = new File("E:\\Java Course\\test3.txt");
        try {
            FileOutputStream fop = new FileOutputStream("E:\\Java Course\\test3.txt");
//            if (!file.exists()) {
//                file.createNewFile();
                
                ObjectOutputStream objectOut = new ObjectOutputStream(fop);
                
                //objectOut.writeObject(movie.hashCode());
                objectOut.writeObject(sd.hashCode());
                objectOut.flush();
                objectOut.close();

            

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
