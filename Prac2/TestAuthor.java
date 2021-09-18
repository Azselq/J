package com.company;

public class TestAuthor {

    public static void main(String[] args) {
	Author author = new Author("Maxim", "@asdads",'M');
    System.out.println(author);
    author.setName("Kirill");
    System.out.println(author);
    }
}
