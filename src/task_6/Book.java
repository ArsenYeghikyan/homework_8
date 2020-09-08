package task_6;

public class Book {
    private String bookName;
    private Author author;
    private double price;

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public Book(String bookName, Author author, double price) {
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }


}
