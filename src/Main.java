import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("""
                         Library Menu
                    1.Add book
                    2.List all books
                    3.Get book by id
                    4.Delete book
                    5.Exit     
                    """);

   int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter book title: ");
                    String title = scanner.nextLine();

                    System.out.println("Enter book author: ");
                    String author = scanner.nextLine();

                    library.addBook(title, author);
                    System.out.println("Book added successfully");
                }
                case 2 -> {
                    System.out.println("All books:");
                    for (Book b : library.getAllBooks()) {
                        System.out.println(b);
                    }
                }
                case 3 -> {
                    System.out.println("Enter book id: ");
                    int searchId = scanner.nextInt();
                    Book foundBook = library.getBookById(searchId);
                    if (foundBook != null) {
                        System.out.println("Book found: " + foundBook);
                    } else {
                        System.out.println("Book not found");
                    }
                }
                case 4 -> {
                    System.out.println("Enter book id to delete: ");
                    int deleteId = scanner.nextInt();
                    library.deleteBook(deleteId);
                }
                case 5 -> {
                    System.out.println("Exiting");
                    return;
                }
                default -> System.out.println("Invalid option");
            }
        }
    }
}
