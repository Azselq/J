package lab12;
import java.util.Scanner;
import java.util.regex.*;

public class Main {
    public static void main(String[] args){
        String line;
        Scanner scanner=new Scanner(System.in);
        line = scanner.nextLine();
        String regex_eur= "(\\d+)(\\.)(\\d+)([ ])(EUR)";
        String regex_usd= "(\\d+)(\\.)(\\d+)([ ])(USD)";
        String regex_rub= "(\\d+)(\\.)(\\d+)([ ])(RUB)";

        String regex_date= "(\\d{2})(\\/{1})(\\d{2})(\\/{1})(\\d{4})";//2 числа, слеш, два числа, слеш, четыре числа
        String regex_plus= "(.*\\d+)(\\+{1}).*";//число и плюс
        String regex_email= "[^@]*(\\@)[^@]*";//проверяет на нахождение собаки одной
        String regex_password0="........*";//8 элементов
        String regex_password1=".*\\d+.*";//одна цифра как минимум
        String regex_password2=".*[a-z]+.*";//одна маленькая буква как минимум
        String regex_password3=".*[A-Z]+.*";//одна большая буква как минимум
        if(Pattern.matches(regex_eur,line)){
            System.out.println("Нашёлся EUR");
        }
        else if (Pattern.matches(regex_usd,line)){
            System.out.println("Нашёлся USD");
        }
        else if (Pattern.matches(regex_rub,line)){
            System.out.println("Нашёлся RUB");
        }
        else if (Pattern.matches(regex_plus,line)){
            System.out.println("Нашёлся PLUS");
        }else if (Pattern.matches(regex_date,line)){
            System.out.println("Нашёлся date");
        }else if (Pattern.matches(regex_email,line)){
            System.out.println("Нашёлся email");
        }else if (Pattern.matches(regex_password0,line) && Pattern.matches(regex_password1,line)&& Pattern.matches(regex_password2,line)&& Pattern.matches(regex_password3,line))
        {
            System.out.println("Нашёлся пароль");
        }
        else {
            System.out.println("Не нашлось ничего");
        }
    }
}
