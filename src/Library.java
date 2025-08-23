import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private int nextId = 1;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(String title, String author) {
        Book book = new Book(nextId++, title, author);
        if(!books.contains(book)) {
            books.add(book);
        }
    }

    public ArrayList<Book> getAllBooks() {
        return new ArrayList<>(books); // Return a copy
    }

    public Book getBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    public void deleteBook(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                books.remove(book);
                System.out.println("Book " + id + " is deleted");
                return;
            }
        }
        System.out.println("Book not found");
    }
}
