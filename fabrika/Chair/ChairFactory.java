package com.company;

public class ChairFactory implements AbstractChairFactory{
    public VictorianChair createVictorianChair(int age)
    {
        return new VictorianChair(age);
    }
    public MagicalChair createMagicalChair()
    {
        return new MagicalChair();

    }
    public FunctionalChair createFunctionalChair() {
        return new FunctionalChair();
    }
}
