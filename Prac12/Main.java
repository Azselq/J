package com.company;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Денис", "Денисов", "Денисович");
        System.out.println(person.getPerson());
        Person nedoperson = new Person("Денисов");
        System.out.println(nedoperson.getPerson());
        Adress adress = new Adress("Russia, 77, Moscow, Kommunarka, 118, 4, 4", false);
                System.out.println(adress);
        Adress adress1 = new Adress("USA, 13, LosAngeles, BaconStreet, 15, 3, 2", false);
                System.out.println(adress1);
        Adress adress2 = new Adress("Russia; 21; Novocheboksarsk; Pervomayskaya; 29; 21; 2", true);
        System.out.println(adress2);
        Shirt shirt = new Shirt("S001,Black Polo Shirt,Black,XL");
        System.out.println(shirt);
        Shirt shirt2 = new Shirt("S002,Black Polo Shirt,Black,L");
        System.out.println(shirt2);
        Shirt shirt3 = new Shirt("S003,Blue Polo Shirt,Blue,XL");
        System.out.println(shirt3);

        PhoneNum num = new PhoneNum("+104289652211");
        System.out.println(num);
        PhoneNum num1 = new PhoneNum("+79131234561");
        System.out.println(num1);
        PhoneNum num2 = new PhoneNum("89876543210");
        System.out.println(num2);
    }
}
