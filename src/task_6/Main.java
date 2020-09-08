package task_6;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Author", "author@gmail.com", "male");
        Book book = new Book("book", author, 4545);
        System.out.println(book.getAuthor().getName() + "\n"
                + book.getAuthor().getEmail() + "\n"
                + book.getAuthor().getGender() + "\n" + book.getPrice() + "\n"
                + book.getBookName());
    }
}
