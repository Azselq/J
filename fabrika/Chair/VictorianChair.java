package com.company;

public class VictorianChair implements Chair {
    private final int age;
    public VictorianChair(int age)
    {
        this.age=age;
    }
    public int getAge()
    {
        return this.age;

    }
    public String toString()
    {
        return "VictorianChair "+ "age " + this.age;
    }
}
