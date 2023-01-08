package com.Book.BookService.Repository;

import com.Book.BookService.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {


    @Query( value="select id from book where book.barcode_number=:barcodeNumber",
    nativeQuery = true)
    Optional<Long> findBookIdByBarcodeNumber(Long barcodeNumber);
}
