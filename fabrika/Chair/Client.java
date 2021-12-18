package com.company;

import java.util.Scanner;
public class Client {
    public Chair chair;
    public void sit() throws Exception {
        var scan = new Scanner(System.in);
        var fact = new ChairFactory();
        System.out.println("На каком стуле вы хотите сидеть?");
        System.out.println(" 1) Викторианский стул;");
        System.out.println(" 2) Магический стул;");
        System.out.println(" 3) Функциональный стул.");
        System.out.print("Ваш выбор (1-3): ");
        int choice = scan.nextInt();
        System.out.println(); switch (choice) {
            case 1:
                System.out.print("Введите возраст стула: ");
                chair = fact.createVictorianChair(scan.nextInt());
                System.out.println(chair);
                break;
            case 2:
                chair = fact.createMagicalChair(); ((MagicalChair) chair).doMagic();
                break;
            case 3:
                System.out.print("Введите a и b");
                int a = scan.nextInt();
                int b = scan.nextInt();
                chair = fact.createFunctionalChair(); System.out.println(chair + " -- " + ((FunctionalChair) chair).Sum(a, b));
                break;
        }
    }
    public void setChair(Chair chair) {
        this.chair = chair;
    }
}
