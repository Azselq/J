package com.company;

public class Ball {
    private int radius;
    private String name;
    public Ball(int a, String b)
    {
        radius = a;
        name = b;
    }
    public Ball (String b){
        name = b;
        radius = 0;
    }
    public Ball()
    {

        name = "ball_1";
    }
    public void setName(String name)
    {

        this.name = name;
    }
    public void setRadius(int radius)
    {

        this.radius = radius;
    }
    public String getName(String name)
    {

        return name;
    }
    public int getRadius(int radius)

    {
        return radius;
    }
    public String toString() {

        return this.name + ", " +this.radius;
    }
}
