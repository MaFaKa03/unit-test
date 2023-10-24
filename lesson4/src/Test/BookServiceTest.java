import book.Book;
import book.BookRepository;
import book.BookService;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookServiceTest {
    @Test
    void bookServiceTest(){
        BookRepository bookRepository = mock(BookRepository.class);
        Book book = new Book("1","Death Souls","Gogol");

        when(bookRepository.findById("1")).thenReturn(book);
        BookService bookService = new BookService(bookRepository);
        assertThat(bookService.findBookById("1")).isEqualTo(book);
    }

}