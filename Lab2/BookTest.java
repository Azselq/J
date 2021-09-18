package mirea.Lab2;

public class BookTest {

    public static void main(String[] args) {
	Book book1 = new Book ("Война и мир", "Толстой", "Роман-эпопея");
    System.out.println(book1.toString());
    book1.setName("Преступление и наказание");
    book1.setAuthor("Достаевский");
    book1.setGenre("Роман");
    System.out.println(book1.toString());
    }
}
