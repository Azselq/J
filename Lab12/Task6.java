package lab12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    public static void main (String[] args) {
        Pattern pat = Pattern.compile("(\\w+)@(\\w+\\.)(\\w+)");
        Matcher mat1 = pat.matcher("user@example.com");
        Matcher mat2 = pat.matcher("myhost@@@com.ru");

        System.out.println("Matcher1: ");
        if (mat1.find()) System.out.println("Match!");
        else System.out.println("No match!");

        System.out.println("Matcher2: ");
        if (mat2.find()) System.out.println("Match!");
        else System.out.println("No match!");
    }
}

