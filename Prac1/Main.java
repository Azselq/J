package com.company;

public class Main {

    public static void main(String[] args) {
            Ball football = new Ball("nike");
            Ball football_1= new Ball (12,"puma");
            football.setRadius(32);
            System.out.println(football.toString());
            System.out.println(football_1.toString());
    }
}
