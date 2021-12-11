package lab12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {
    public static void main (String[] args) {
        Pattern pat = Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])([0-9a-zA-Z_]){8,}$");
        Matcher mat1 = pat.matcher("F032_Password");
        Matcher mat2 = pat.matcher("smart_pass");

        System.out.println("Matcher1: ");
        if (mat1.find()) System.out.println("Match!");
        else System.out.println("No match!");

        System.out.println("Matcher2: ");
        if (mat2.find()) System.out.println("Match!");
        else System.out.println("No match!");
    }
}

