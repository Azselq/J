package lab12;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main (String[] args) {
        Pattern pat = Pattern.compile("(\\d)+(\\.)?(\\d*)(\\s)+(USD|RUB|EU)+");
        Matcher mat1 = pat.matcher("44 RUB, 25.98 USD");
        Matcher mat2 = pat.matcher("44 ERR, 25.98 USD");

        System.out.println("Matcher1: ");
        while (mat1.find()) {
            System.out.println(mat1.group());
        }
        System.out.println("Matcher2: ");
        while (mat2.find()) {
            System.out.println(mat2.group());
        }
    }
}

