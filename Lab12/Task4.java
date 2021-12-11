package lab12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main (String[] args) {
        Pattern pat = Pattern.compile("(\\d)+(\\s)*\\+");
        Matcher mat1 = pat.matcher("(1 + 8) – 9 / 4");
        Matcher mat2 = pat.matcher("6 / 5 – 2 * 9");

        System.out.println("Matcher1: ");
        if (mat1.find()) System.out.println("Match!");
        else System.out.println("No match!");

        System.out.println("Matcher2: ");
        if (mat2.find()) System.out.println("Match!");
        else System.out.println("No match!");
    }
}

