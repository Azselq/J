package com.company;
import java.util.Scanner;
public class ComplexTest {
    private static final Scanner IN = new Scanner(System.in);
    private static final ConcreteFactory FACTORY = new ConcreteFactory();
    public static void main (String[] args)
    {
            System.out.print ("Введите вещественную часть: ");
            int real = IN.nextInt();
            System.out.print ("Введите мнимую часть: ");
            int image = IN.nextInt();
            Complex z1 = FACTORY.createComplex();
            Complex z2 = FACTORY.createComplex(real,image);
            System.out.println("z = "+ z2);

    }

}
