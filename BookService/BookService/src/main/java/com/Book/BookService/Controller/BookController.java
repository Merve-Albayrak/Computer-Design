package com.Book.BookService.Controller;


import com.Book.BookService.Entity.Book;
import com.Book.BookService.Error.BookNotFoundException;
import com.Book.BookService.Service.IBookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@Slf4j
@RequestMapping("/books")

public class BookController {


@Autowired
    private IBookService bookService;

    @PostMapping("/save")
    public Book Save(@Valid @RequestBody Book book){


        return bookService.saveBook(book);



    }
    @GetMapping("/get/{id}")
public  Book GetById(@PathVariable("id") Long bookId) throws BookNotFoundException {

return  bookService.getBookById(bookId);


    }

    @GetMapping("/getIdByBarcodeNumber/{barcodeNumber}")
    public  Long GetIdByBarcodeNumber(@PathVariable("barcodeNumber") Long barcodeNumber) throws BookNotFoundException {

        return  bookService.getBookIdByBarcodeNumber(barcodeNumber);


    }
}
