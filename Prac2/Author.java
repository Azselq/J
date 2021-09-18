package com.company;

public class Author {
    private String name;
    private String email;
    private char gender;
    Author(String name, String email, char gender)
    {
        this.name=name;
        this.email = email;
        this.gender=gender;
    }
    public String getEmail(String email){
        return email;
    }
    public void setEmail (String email)
    {
        this.email=email;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setGender(char gender)
    {
        this.gender=gender;
    }
    public String toString()
    {
        return "Name: "+ this.name + " email: "+ this.email + " gender: " + gender;
    }

}