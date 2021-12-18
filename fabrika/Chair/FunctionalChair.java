package com.company;

public class FunctionalChair implements Chair {
    public int Sum(int a,int b)
    {
        return a+b;
    }

    @Override
    public String toString() {
        return "Функциональный стул ";
    }
}
