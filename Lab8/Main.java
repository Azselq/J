package mirea;

import java.io.File;
import java.io.FileWriter;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("text.txt");
        writer.write("Почему дождик капает по лужам?");
        writer.flush();
        FileReader reader = new FileReader("text.txt");
        int c;
        while ((c=reader.read())>=0)
         System.out.println((char)c);
    }
}
