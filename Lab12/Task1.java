package lab12;
import java.util.Scanner;

public class Task1 {
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Initial String: ");
        String str = myScanner.nextLine();
        for (String w : str.split("[ ,-.;:]")) {
            System.out.println("word: " + w + ";");
        }
    }
}

