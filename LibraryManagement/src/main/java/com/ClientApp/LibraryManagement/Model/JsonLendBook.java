package com.ClientApp.LibraryManagement.Model;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor

public class JsonLendBook {

    public JsonLendBook() {
        this.borrowerId = new BorrowerId();
        this.bookId = new BookId();
    }

    public class BookId{
        public int id;
    }

    public class BorrowerId{
        public int id;
    }


        public BorrowerId borrowerId;
        public BookId bookId;
        public String borrowingDate;
        public String deliveryDate;


}
