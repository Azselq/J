package mirea.Lab2;

public class Book {
    private String name;
    private String author;
    private String genre;
    public Book(String name, String author, String genre)
    {
        this.name=name;
        this.author = author;
        this.genre = genre;
    }
    public void setName (String name)
    {
        this.name = name;
    }
    public String getName(String name)
    {
        return name;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }
    public String getAuthor(String author)
    {
        return author;
    }
    public void setGenre(String genre)
    {
        this.genre=genre;
    }
    public String getGenre(String genre)
    {
        return genre;
    }
    public String toString()
    {
        return this.name+ " "+ this.author + " "+ this.genre;
    }
}
