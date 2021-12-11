package lab12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main (String[] args) {
        Pattern pat = Pattern.compile("(^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/](0[13578]|1[02]))|((29|30)[\\/](0[4,6,9]|11)))[\\/](19|[2-9][0-9])\\d\\d$)|(^29[\\/]02[\\/](19|[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)");
        Matcher mat1 = pat.matcher("29/02/2000");
        Matcher mat2 = pat.matcher("29/02/2001");

        System.out.println("Matcher1: ");
        if (mat1.find()) System.out.println("Match!");
        else System.out.println("No match!");

        System.out.println("Matcher2: ");
        if (mat2.find()) System.out.println("Match!");
        else System.out.println("No match!");
    }
}

