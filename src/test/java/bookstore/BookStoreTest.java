package bookstore;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Test;
import java.util.ArrayList; // Import ArrayList class
import java.util.List; // Import List class


public class BookStoreTest {
    @Test
    public void getBookByYear() {
        // Arrange
        BookStore store = new BookStore("The BookWorm");
        Book expectedBook = new Book("Max Havelaar", "Multatuli", 1860);
        store.addBook(expectedBook);

        // Act
        List<Book> books = store.getBookByYear(1860);

        // Assert
        assertFalse("No book found for the given year", books.isEmpty());
        assertEquals("Unexpected number of books found for the given year", 1, books.size());
        Book actualBook = books.get(0);
        assertEquals("Unexpected book retrieved", expectedBook, actualBook);
    }
}