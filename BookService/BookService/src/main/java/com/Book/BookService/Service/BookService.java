package com.Book.BookService.Service;

import com.Book.BookService.Entity.Book;
import com.Book.BookService.Error.BookNotFoundException;
import com.Book.BookService.Repository.BookRepository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService implements IBookService {
    @Autowired
    BookRepository bookRepository;
    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book getBookById(Long bookId) throws BookNotFoundException {

        Optional<Book> book=bookRepository.findById(bookId);

        if(!book.isPresent()){

            throw  new BookNotFoundException("Book is not available");
        }
        return book.get();
    }

    @Override
    public Long getBookIdByBarcodeNumber(Long barcodeNumber) throws BookNotFoundException {
Optional<Long> book=bookRepository.findBookIdByBarcodeNumber(barcodeNumber);

if(!book.isPresent()){



    throw  new BookNotFoundException("book id is not exist");
}
return  book.get();

    }
}
