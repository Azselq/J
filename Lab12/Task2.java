package lab12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Task2 {
    public static void main (String[] args) {
        Pattern pat = Pattern.compile("abcdefghijklmnopqrstuv18340");
        Matcher mat = pat.matcher("abcdefghijklmnoasdfasdpqrstuv18340");
        if (mat.matches()) System.out.println("Match!");
        else System.out.println("No match!");
    }
}
//Вариант, где вводится реальная строка
/*public class Task2 {
    public static void main (String[] args) {
        Pattern pat = Pattern.compile("a");
        Matcher mat = pat.matcher("a");
        if (mat.matches()) System.out.println("Match!");
        else System.out.println("No match!");
    }
}*/
