public class Library {
    private Book[] books;
    private int count;

    public Library(int size) {
        books = new Book[size];
        this.count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
        } else {
            System.out.println("Library is full");
        }
    }

    public Book[] getAllBooks() {
        Book[] result = new Book[count];
        for (int i = 0; i < count; i++) {
            result[i] = books[i];
        }
        return result;
    }

    public Book getBookById(int id) {
        for (int i = 0; i < count; i++) {
            if (books[i].getId() == id) {
                return books[i];
            }
        }
        return null;
    }

    public void deleteBook(int id) {
        for (int i = 0; i < count; i++) {
            if (books[i].getId() == id) {

                for (int j = i; j < count - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[count - 1] = null;
                count--;
                System.out.println("Book " + id + " is deleted");
                return;
            }
        }
        System.out.println("Book not found");
    }
}
