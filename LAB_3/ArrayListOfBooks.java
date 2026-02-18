import java.util.ArrayList;
import java.time.LocalDate;

public class ArrayListOfBooks {
    
    private ArrayList<Book> books;
    
    // Constructor
    public ArrayListOfBooks() {
        books = new ArrayList<>();
    }
    
    // Method to add a book to the list
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.name);
    }
    
    // Method to remove a book from the list
    public void removeBook(int index) {
        if (index >= 0 && index < books.size()) {
            books.remove(index);
            System.out.println("Book removed");
        } else {
            System.out.println("Invalid index");
        }
    }
    
    // Method to display all books
    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the list");
            return;
        }
        
        System.out.println("=== All Books ===");
        for (int i = 0; i < books.size(); i++) {
            System.out.println("\nBook " + (i + 1) + ":");
            books.get(i).displayDetails();
        }
    }
    
    // Method to get total number of books
    public int getTotalBooks() {
        return books.size();
    }
    
    // Method to get a book by index
    public Book getBook(int index) {
        if (index >= 0 && index < books.size()) {
            return books.get(index);
        }
        return null;
    }
    
    // Main method
    public static void main(String[] args) throws InvalidPriceException {
        ArrayListOfBooks bookList = new ArrayListOfBooks();
        
        // Create some books
        Book book1 = null;
        Book book2 = null;
        Book book3 = null;
        try {
            book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99, "Scribner", "Fiction", "978-0743273565", LocalDate.of(1925, 4, 10));
        } catch (InvalidPriceException e) {
            System.out.println("Error creating book1: " + e.getMessage());
        } catch (InvalidGenreException e) {
            System.out.println("Error creating book1: " + e.getMessage());
        }
        try {
            book2 = new Book("1984", "George Orwell", 13.99, "Penguin", "", "978-0451524935", LocalDate.of(1949, 6, 8));
        } catch (InvalidPriceException e) {
            System.out.println("Error creating book2: " + e.getMessage());
        } catch (InvalidGenreException e) {
            System.out.println("Error creating book2: " + e.getMessage());
        }
        try {
            book3 = new Book("To Kill a Mockingbird", "Harper Lee", -18.99, "Lippincott", "Fiction", "978-0061120084", LocalDate.of(1960, 7, 11));
        } catch (InvalidPriceException e) {
            System.out.println("Error creating book3: " + e.getMessage());
        } catch (InvalidGenreException e) {
            System.out.println("Error creating book3: " + e.getMessage());
        }
        
        // Add books to the list
        if (book1 != null) {
            bookList.addBook(book1);
        }
        if (book2 != null) {
            bookList.addBook(book2);
        }
        if (book3 !=   null) {
            bookList.addBook(book3);
        }
        
        System.out.println("\nTotal books: " + bookList.getTotalBooks());
        
        // Display all books
        bookList.displayAllBooks();
        
        // Remove a book
        System.out.println("\n--- Removing book at index 1 ---");
        bookList.removeBook(1);
        
        System.out.println("\nTotal books after removal: " + bookList.getTotalBooks());
        bookList.displayAllBooks();
    }
}