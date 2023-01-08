package com.Book.BookService.Service;

import com.Book.BookService.Entity.Book;
import com.Book.BookService.Error.BookNotFoundException;

public interface IBookService {
    Book saveBook(Book book);

    Book getBookById(Long bookId) throws BookNotFoundException;

    Long getBookIdByBarcodeNumber(Long barcodeNumber) throws BookNotFoundException;
}
